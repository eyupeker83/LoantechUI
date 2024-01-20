package stepdefinitions.QA_11;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

public class Stepdefinitions {
        AdminPage adminPage = new AdminPage();
        Actions actions = new Actions(Driver.getDriver());

    @Given("admin ilgili {string} sayfasina gider")
    public void admin_ilgili_sayfasina_gider(String adminloginUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminloginUrl));
    }
    @Then("username kutusuna {string} girer")
    public void username_kutusuna_girer(String gecerliAdminUsername) {
        adminPage.adminUsernameKutusu.sendKeys(ConfigReader.getProperty(gecerliAdminUsername));
    }
    @Then("password kutusuna {string} girer")
    public void password_kutusuna_girer(String gecerliAdminPassword) {
        adminPage.adminPasswordKutusu.sendKeys(ConfigReader.getProperty(gecerliAdminPassword));
    }
    @Then("login e tiklar")
    public void login_e_tiklar() {

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        adminPage.loginButton.click();

    }
    @Then("acilan pencerede soldaki menude Manage Users e tiklar")
    public void acilan_pencerede_soldaki_menude_manage_users_e_tiklar() {
        adminPage.manageUsers.click();
    }
    @Then("acilan menude Notification to All linkine tiklanir")
    public void acilan_menude_notification_to_all_linkine_tiklanir() {
        adminPage.notificationToAll.click();
        ReusableMethods.wait(1);
    }
    @Then("sayfanin acildigi dogrulanir")
    public void sayfanin_acildigi_dogrulanir() {
        String expText = "Notification to Verified Users";
        String actText = adminPage.notificationToAllSayfaTest.getText();
        ReusableMethods.wait(1);
        Assert.assertTrue(actText.contains(expText));
    }
    @Then("sayfa kapatilir")
    public void sayfa_kapatilir() {
        Driver.closeDriver();
    }

    @Then("acilan sayfada Being Sent kutusuna tiklar")
    public void acilan_sayfada_being_sent_kutusuna_tiklar() {
        ReusableMethods.wait(1);
        adminPage.beingsentKutusu.click();
    }
    @Then("acilan menude Selected Users secilir")
    public void acilan_menude_selected_users_kutusuna_tiklar() {
        ReusableMethods.wait(1);
        adminPage.selectedUsersMenuSecenek.click();
    }
    @Then("selected users kutusuna tiklanir")
    public void selected_users_kutusuna_tiklanir() {
        ReusableMethods.wait(1);
        adminPage.selectusersKutusu.click();
    }
    @Then("ilk kullaniciyi secmek icin enter tusuna basar")
    public void ilk_kullaniciyi_secmek_icin_enter_tusuna_basar() {
        ReusableMethods.wait(1);
        adminPage.selectusersKutusu.sendKeys(Keys.ENTER);
        ReusableMethods.wait(1);
        adminPage.selectUserKutusu2.sendKeys(Keys.ENTER);
    }
    @Then("Subject kutusuna {string} yazilir")
    public void subject_kutusuna_test_yazilir(String test) {
        ReusableMethods.wait(1);
        adminPage.subjectKutusu.click();
        adminPage.subjectKutusu.sendKeys(ConfigReader.getProperty(test));
    }
    @Then("Message kutusuna {string} yazilir")
    public void message_kutusuna_test_yazilir(String test) {
        ReusableMethods.wait(1);
        adminPage.messageKutusu.click();
        adminPage.messageKutusu.sendKeys(ConfigReader.getProperty(test));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Then("Per Batch kutusuna bir yazilir")
    public void per_batch_kutusuna_yazilir() {
        ReusableMethods.wait(1);
       // actions.moveToElement(adminPage.perBatch).perform();
        adminPage.perBatch.sendKeys("1");


    }
    @Then("Cooling Period kutusuna bir yazilir")
    public void cooling_period_kutusuna_yazilir() {
        adminPage.coolingPeriodKutusu.sendKeys("1");

    }
    @Then("submit butonuna tiklar")
    public void submit_butonuna_tiklar() {

        ReusableMethods.wait(1);
        adminPage.notifcationSubmitButton.click();
    }
    @Then("ekranda Done yazdigi dogrulanir")
    public void ekranda_done_yazdigi_dogrulanir() {
        ReusableMethods.wait(7);
        adminPage.stopButton.click();
        ReusableMethods.wait(2);
        String expText = "Done";
        String actText = adminPage.notificationDoneYazisi.getText();
        Assert.assertTrue(actText.contains(expText));
    }
    @Then("Start Form kutusuna bir yazilir")
    public void start_form_kutusuna_yazilir() {
        ReusableMethods.wait(1);
        adminPage.startFormKutusu.sendKeys("1");
    }
    @Then("acilan sayfada Withdrawals menu basliginin goruldugu dogrulanir")
    public void acilan_sayfada_withdrawals_menu_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.withdrawalsMenu.isDisplayed());
    }
    @Then("Withdrawals menu basligina tiklar")
    public void withdrawals_menu_basligina_tiklar() {
        adminPage.withdrawalsMenu.click();

    }
    @Then("Withdrawal Methods sayfa basliginin oldugu dogrulanir")
    public void withdrawal_methods_sayfa_basliginin_oldugu_dogrulanir() {
        Assert.assertTrue(adminPage.withdrawalsMethodsMenu.isDisplayed());
    }
    @Then("Withdrawal Methods linkine tiklanir")
    public void withdrawal_methods_linkine_tiklanir() {
        adminPage.withdrawalsMethodsMenu.click();

    }
    @Then("acilan sayfada Withdrawal Methods yazisi oldugu test edilir")
    public void acilan_sayfada_withdrawal_methods_yazisi_oldugu_test_edilir() {
        Assert.assertTrue(adminPage.withdrawalMethodsText.isDisplayed());
    }
    @Then("Pending Withdrawals sayfa basliginin oldugu dogrulanir")
    public void pending_withdrawals_sayfa_basliginin_oldugu_dogrulanir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.pendingWithdrawalsMenu.isDisplayed());
    }
    @Then("Pending Withdrawals linkine tiklanir")
    public void pending_withdrawals_linkine_tiklanir() {
        adminPage.pendingWithdrawalsMenu.click();
    }
    @Then("acilan sayfada Pending Withdrawals yazisi oldugu test edilir")
    public void acilan_sayfada_pending_withdrawals_yazisi_oldugu_test_edilir() {
        actions.moveToElement(adminPage.sideBar).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.pendingWithdrawalsMenu);
        Assert.assertTrue(adminPage.pendingWithdrawalsText.isDisplayed());
    }
    @Then("Approved Withdrawals sayfa basliginin oldugu dogrulanir")
    public void approved_withdrawals_sayfa_basliginin_oldugu_dogrulanir() {
        actions.moveToElement(adminPage.sideBar).perform();
        actions.moveToElement(adminPage.sideBar).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.approvedWithdrawalsMenu);
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.approvedWithdrawalsMenu.isDisplayed());
    }
    @Then("Approved Withdrawals linkine tiklanir")
    public void approved_withdrawals_linkine_tiklanir() {
        ReusableMethods.wait(1);
        actions.moveToElement(adminPage.sideBar).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.approvedWithdrawalsMenu);
        adminPage.approvedWithdrawalsMenu.click();
    }
    @Then("acilan sayfada Approved Withdrawals yazisi oldugu test edilir")
    public void acilan_sayfada_approved_withdrawals_yazisi_oldugu_test_edilir() {
        ReusableMethods.wait(3);
        Assert.assertTrue(adminPage.approvedWithdrawalsText.isDisplayed());
    }
    @Then("Rejected Withdrawals sayfa basliginin oldugu dogrulanir")
    public void rejected_withdrawals_sayfa_basliginin_oldugu_dogrulanir() {
        actions.moveToElement(adminPage.sideBar).perform();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.rejectedWithdrawalsMenu);
       Assert.assertTrue(adminPage.rejectedWithdrawalsMenu.isDisplayed());
    }
    @Then("Rejected Withdrawals linkine tiklanir")
    public void rejected_withdrawals_linkine_tiklanir() {
        adminPage.rejectedWithdrawalsMenu.click();
    }
    @Then("acilan sayfada Rejected Withdrawals yazisi oldugu test edilir")
    public void acilan_sayfada_rejected_withdrawals_yazisi_oldugu_test_edilir() {
        Assert.assertTrue(adminPage.rejectedWithdrawalsText.isDisplayed());
    }
    @Then("All withdrawals sayfa basliginin oldugu dogrulanir")
    public void all_withdrawals_sayfa_basliginin_oldugu_dogrulanir() {
        actions.moveToElement(adminPage.sideBar).perform();
        ReusableMethods.wait(1);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",adminPage.rejectedWithdrawalsMenu);
        Assert.assertTrue(adminPage.allWithdrawalsMenu.isDisplayed());
    }
    @Then("All withdrawals linkine tiklanir")
    public void all_withdrawals_linkine_tiklanir() {
       adminPage.allWithdrawalsMenu.click();
    }
    @Then("acilan sayfada All withdrawals yazisi oldugu test edilir")
    public void acilan_sayfada_all_withdrawals_yazisi_oldugu_test_edilir() {
       Assert.assertTrue(adminPage.allWithdrawalsText.isDisplayed());
    }
    @Then("Gateway sayfa basliginin goruldugu dogrulanir")
    public void gateway_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.getewayBaslik.isDisplayed());
    }
    @Then("Initiated sayfa basliginin goruldugu dogrulanir")
    public void initiated_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.initiatedBaslik.isDisplayed());
    }
    @Then("User sayfa basliginin goruldugu dogrulanir")
    public void user_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.userBaslik.isDisplayed());
    }
    @Then("Amount sayfa basliginin goruldugu dogrulanir")
    public void amount_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.amountBaslik.isDisplayed());
    }
    @Then("Conversion sayfa basliginin goruldugu dogrulanir")
    public void conversion_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.conversionBaslik.isDisplayed());
    }
    @Then("Status sayfa basliginin goruldugu dogrulanir")
    public void status_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.statusBaslik.isDisplayed());
    }
    @Then("Action sayfa basliginin goruldugu dogrulanir")
    public void action_sayfa_basliginin_goruldugu_dogrulanir() {
        Assert.assertTrue(adminPage.actionBaslik.isDisplayed());
    }
    @Then("Details linkine tiklanir")
    public void details_linkine_tiklanir() {
       adminPage.detailsButton.click();
    }
    @Then("sayfanin acildigi test edilir")
    public void sayfanin_acildigi_test_edilir() {
        Assert.assertTrue(adminPage.detailsSayfaTest.isDisplayed());
    }
    @Then("Start Date - End Dat kutusuna tarih girilir arama tusuna basilir")
    public void start_date_end_dat_kutusuna_tarih_girilir_enter_tusuna_basilir() {
        adminPage.dateKutusu.sendKeys(ConfigReader.getProperty("approvedDate"));
        ReusableMethods.wait(2);
    }
    @Then("arama yapilabildigi test edilir")
    public void arama_yapilabildigi_test_edilir() {
        Assert.assertTrue(adminPage.approvedAramaSonuc.isDisplayed());
    }
    @Then("Transaction No ile arama kutusuna username girilir enter tusuna basilir")
    public void transaction_no_ile_arama_kutusuna_username_girilir_enter_tusuna_basilir() {
        adminPage.transactionAramaKutusu.click();
        ReusableMethods.wait(1);
        adminPage.transactionAramaKutusu.sendKeys(ConfigReader.getProperty("transactionNo"));
        adminPage.searcheOne.click();
    }
    @Then("arama yapilabildigi dogrulanir")
    public void arama_yapilabildigi_dogrulanir() {
        ReusableMethods.wait(3);
        Assert.assertTrue(adminPage.approvedAramaSonuc.isDisplayed());
    }
    @Then("username ile arama kutusuna username girilir enter tusuna basilir")
    public void username_ile_arama_kutusuna_username_girilir_enter_tusuna_basilir() {
        adminPage.transactionAramaKutusu.click();
        adminPage.transactionAramaKutusu.sendKeys(ConfigReader.getProperty("approvedUser"));
        ReusableMethods.wait(3);
        adminPage.searcheOne.click();
        Assert.assertTrue(adminPage.approvedAramaSonuc.isDisplayed());
    }

}
