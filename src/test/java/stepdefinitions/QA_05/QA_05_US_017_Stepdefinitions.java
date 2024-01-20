package stepdefinitions.QA_05;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class QA_05_US_017_Stepdefinitions {
    LoginPage loginPage =new LoginPage();
    Actions actions=new Actions(Driver.getDriver());



    @And("login olur")
    public void loginOlur() {
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Then("withdraw butonuna tiklanir")
    public void withdraw_butonuna_tiklanir() {
    loginPage.withdrawBtn.click();
    }
    @Then("dropdown menuden bir method secilir")
    public void dropdown_menuden_bir_method_secilir() {
        Select select=new Select(loginPage.select);
        select.selectByIndex(1);
    }
    @Then("amount textboxa belirtilen aralikta bir tutar girilir")
    public void amount_textboxa_ile_arasında_bir_tutar_girilir() {

    loginPage.amountBox.sendKeys("500");
    loginPage.widhdrawSubmitBtn.click();
    ReusableMethods.wait(2);
        loginPage.widhdrawSubmitBtn.click();
        ReusableMethods.wait(2);
        loginPage.widhdrawSuccsess.isDisplayed();

    }

    @And("accordion table de Charge-After Charge-Conversion-Status degerleri goruntulenir")
    public void accordionTableDeChargeAfterChargeConversionStatusDegerleriGoruntulenir() {

        loginPage.widhdrawHistoryAccord.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(loginPage.accordionCharge.isDisplayed());
        Assert.assertTrue(loginPage.accordionAfterCharge.isDisplayed());
        Assert.assertTrue(loginPage.accordionConversion.isDisplayed());


    }

    @Then("withdraw money butonuna tiklanip withdraw money sayfasina gecilir")
    public void withdrawMoneyButonunaTiklanipWithdrawMoneySayfasinaGecilir() {
        loginPage.withdrawMoneyBtn.click();
        ReusableMethods.wait(2);
        String expectedUrl="https://qa.loantechexper.com/user/withdraw";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }

    @And("withdraw Money sayfasinda withdraw log butonuna tiklandiginda withdraw history sayfasina gecilir")
    public void withdrawMoneySayfasindaWithdrawLogButonunaTiklandigindaWithdrawHistorySayfasinaGecilir() {
        loginPage.withdrawLogBtn.click();
        ReusableMethods.wait(2);
        String expectedUrl="https://qa.loantechexper.com/user/withdraw/history";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

    }
}

