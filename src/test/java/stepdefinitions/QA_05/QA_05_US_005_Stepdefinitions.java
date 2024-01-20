package stepdefinitions.QA_05;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class QA_05_US_005_Stepdefinitions {
    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("menu basligindan About butonuna tiklanir")
    public void menuBasligindanAboutButonunaTiklanir() {

    homePage.aboutUstMenu.click();

    }

    @And("acilan sayfanin about oldugu dogrulanir")
    public void acilanSayfaninAboutOlduguDogrulanir() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.loantechexper.com/about";
        Assert.assertEquals(actualUrl,expectedUrl);
    }

    @Then("sayfanin footer bolumunden About butonuna tiklanir")
    public void sayfaninFooterBolumundenAboutButonunaTiklanir() {

        ReusableMethods.wait(2);

        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        homePage.aboutFooter.click();
    }

    @And("acilan sayfadaki Fulfilling Financial Dreams basliginin gorundugu dogrulanir")
    public void acilanSayfadakiFulfillingFinancialDreamsBasligininGorunduguDogrulanir() {
        Assert.assertTrue(homePage.fulfillingFDYazi.isDisplayed());
    }

    @Given("Home | About linkleri gorunur oldugu test edilir")
    public void homeAboutLinkleriGorunurOlduguTestEdilir() {
        Assert.assertTrue(homePage.aboutHomeLink.isDisplayed());
        Assert.assertTrue(homePage.aboutAboutLink.isDisplayed());
    }

    @And("Home linkine tiklanir ve anasayfada oldugumuz dogrulanir")
    public void homeLinkineTiklanirVeAnasayfadaOldugumuzDogrulanir() {
        homePage.aboutHomeLink.click();
        ReusableMethods.wait(2);
        String actualTitle=Driver.getDriver().getTitle();
        String expectedTitle="Loantech Exper - Home";

        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
