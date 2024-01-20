package stepdefinitions.QA_05;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class QA_05_US_009_Stepdefinitions {

    HomePage homePage=new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("menuden contact linkine tiklanir")
    public void ust_menuden_contact_linkine_tiklanir() {
        ReusableMethods.wait(2);
        actions.click().perform();
        ReusableMethods.wait(2);
        homePage.contactUst.click();
    }

    @And("contact sayfasinda oldugu dogrulanir")
    public void contactSayfasindaOlduguDogrulanir() {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.loantechexper.com/contact";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
    @Then("sayfanın footer bolumunden Contact Us linki gorunur ve tiklanir")
    public void sayfanın_footer_bolumunden_contact_us_linkine_tiklanir() {
        actions.sendKeys(Keys.END).perform();
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.contactUsFooter.isDisplayed());
        homePage.contactUsFooter.click();
    }

    @And("sirket adresi gorunur ve belirtilen adresle ayni oldugu dogrulanir")
    public void sirketAdresiGorunurVeBelirtilenAdresleAyniOlduguDogrulanir() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(2);
        Driver.getDriver().switchTo().frame(homePage.iframe);
        String actualAdress=homePage.iframe.getText();
        String expectedAdress="105 Evergreen Ave, Brooklyn, NY 11206, Amerika Birleşik Devletleri";
    }
    @Then("contact sayfasinda adress -email ve telefon numarasi gorunur olmali")
    public void contact_sayfasinda_adress_email_ve_telefon_numarasi_gorunur_olmali() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(homePage.contactAdressElementi.isDisplayed());
        Assert.assertTrue(homePage.contactEmailElementi.isDisplayed());
        Assert.assertTrue(homePage.contactMobileElementi.isDisplayed());
    }

    @Then("acilan sayfada sirkete mesaj yazilip gonderilir")
    public void acilan_sayfada_sirkete_mesaj_yazilip_gonderilir() {
        Faker faker= new Faker();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        homePage.contactYourNameBox.sendKeys(faker.name().fullName());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.internet().emailAddress());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.lorem().word());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(faker.lorem().sentence()).perform();



        homePage.contactSendMessage.click();

    }

}
