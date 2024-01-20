package stepdefinitions.QA_05;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import io.cucumber.java.en.*;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class QA_05_US_019_Stepdefinitions {
    LoginPage loginPage =new LoginPage();
    Actions actions=new Actions(Driver.getDriver());


    @Then("transactions linkine tiklanir")
    public void transactions_linkine_tiklanir() {
        loginPage.transactionLink.click();
    }

    @And("my transactions history sayfasina yonlendirilir")
    public void myTransactionsHistorySayfasinaYonlendirilir() {
        Assert.assertTrue(loginPage.myTransactionsHistoryElementi.isDisplayed());
    }

    @Then("sayfada transaction number ile arama yapabilmeli")
    public void sayfadaTransactionNumberIleAramaYapabilmeli() {
    loginPage.transactionNumberSearch.sendKeys(ConfigReader.getProperty("TransactionNumber"));
    actions.sendKeys(Keys.ENTER).perform();
    }

    @Then("type ve remark dropdown elementlerindeki secenekler belirtildigi gibi olmalidir")
    public void type_ve_remark_dropdown_elementlerindeki_secenekler_belirtildigi_gibi_olmalidir() {
        Select selectType=new Select(loginPage.typeDdm);
        Select selectRemark=new Select(loginPage.remarkDdm);

        String[] typeDdmArr = {"All","Plus","Minus"};
        String[] remarkDdmArr={"Any", "Application fee", "Balance add","Deposit", "Loan taken", "Withdraw", "Withdraw reject"};

        List<String> expectedTypeElementleri= Arrays.asList(typeDdmArr);
        List<WebElement> typeDdmList =selectType.getOptions();

        List<String> actualTypeDdmList=ReusableMethods.stringListeCevir(typeDdmList);
        Assert.assertEquals(expectedTypeElementleri,actualTypeDdmList);


        List<String> expectedRemarkElementleri= Arrays.asList(typeDdmArr);
        List<WebElement> remarkDdmList =selectType.getOptions();

        List<String> actualRemarkDdmList=ReusableMethods.stringListeCevir(remarkDdmList);
        Assert.assertEquals(expectedRemarkElementleri,actualRemarkDdmList);
    }


}
