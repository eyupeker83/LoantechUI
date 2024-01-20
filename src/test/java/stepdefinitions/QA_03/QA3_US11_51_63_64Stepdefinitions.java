package stepdefinitions.QA_03;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AdminPage;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QA3_US11_51_63_64Stepdefinitions {
    UserPage userPage = new UserPage();
    AdminPage adminPage = new AdminPage();

    @Given("Kullanıcı visitorURL anasayfaya gider.")
    public void kullanıcı_visitor_url_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("visitorURL"));
        ReusableMethods.wait(2);
        userPage.cookiesElementAB.click();
        ReusableMethods.wait(2);

    }

    @Then("Anasayfa Footer bölümünde Newsletter bölümüne gelinir.")
    public void anasayfa_footer_bölümünde_newsletter_bölümüne_gelinir() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        ReusableMethods.wait(3);
    }

    @Then("Newsletter Bölümünde Newsletter yazisi ve E-Mail adresi girilen Text Box görütülendigi dogrulanir.")
    public void newsletter_bölümünde_newsletter_yazisi_ve_e_mail_adresi_girilen_text_box_görütülendigi_dogrulanir() {
        Assert.assertTrue(userPage.newsletterElementAB.isDisplayed());
        Assert.assertTrue((userPage.newsletterEmailElmentAB.isDisplayed()));
    }

    @Then("browseri kapatir.")
    public void browseri_kapatir() {
        Driver.quitDriver();

    }

    @Then("Newsletter Bölümünde Newsletter yazisi ve E-Mail adresi girilen Text Box E-Mail adresi girilir.")
    public void newsletter_bölümünde_newsletter_yazisi_ve_e_mail_adresi_girilen_text_box_e_mail_adresi_girilir() {

        Faker faker = new Faker();
        userPage.newsletterEmailElmentAB.sendKeys(faker.internet().emailAddress());
    }

    @Then("Text Box yaninda bulunan gönder butonuna tiklanir.")
    public void text_box_yaninda_bulunan_gönder_butonuna_tiklanir() {

        userPage.emailSendButtonAB.click();
    }

    @Then("Sirket bültenine abone olundugu dogrulanir.")
    public void sirket_bültenine_abone_olundugu_dogrulanir() {

        // Alert nesnesini alın
        ReusableMethods.wait(2);
        String alertText = userPage.alertTextAB.getText();

        //ReusableMethods.getScreenshot("Newsletter");
        //Alert alert = Driver.getDriver().switchTo().alert();
        //  String alertText = alert.getText();
        // Alert üzerindeki metni alın

        Assert.assertTrue(alertText.contains("Thank you, we will notice you our latest news"));
        // Alert üzerindeki metni yazdırın
        System.out.println(alertText);


    }

    @Given("admin ilgili {string} sayfasina gider.")
    public void admin_ilgili_sayfasina_gider(String adminloginUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminloginUrl));
    }

    @Then("usernamekutusuna {string} girer")
    public void username_kutusuna_girer(String AdminUsernameAB) {
        adminPage.adminUsernameKutusuAB.sendKeys(ConfigReader.getProperty(AdminUsernameAB));
    }

    @Then("password kutusuna {string} girer.")
    public void password_kutusuna_girer(String AdminPasswordAB) {
        adminPage.adminPasswordKutusuAB.sendKeys(ConfigReader.getProperty(AdminPasswordAB));
    }

    @Then("login e tiklar.")
    public void login_e_tiklar() {


        ReusableMethods.wait(1);
        adminPage.loginButtonAB.click();

    }


    @Then("acilan sayfanin Admin sayfasi oldugu dogrulanir")
    public void acilanSayfaninAdminSayfasiOlduguDogrulanir() {
        String actuelURl = Driver.getDriver().getCurrentUrl();
        String expectedURl = "https://qa.loantechexper.com/admin/dashboard";
        Assert.assertEquals(expectedURl, actuelURl);

    }

    @And("Deposits linkine Tiklanir.")
    public void supportTicketLinkineTiklanir() {

        adminPage.depositButtonAB.click();
    }

    @Then("Pending Deposits linkine tiklanir.")
    public void pendingDepositsLinkineTiklanir() {

        adminPage.pendingDepositAB.click();
    }


    @Then("Acilan sayfanin admin,deposit,pending sayfasi dogru bilgiler icerdigi dogrulanir.")
    public void acilanSayfaninAdminDepositPendingSayfasiDogruBilgilerIcerdigiDogrulanir() {
        String actuelURL = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.loantechexper.com/admin/deposit/pending";
        Assert.assertEquals(expectedUrl, actuelURL);
        Assert.assertTrue(adminPage.amountTextAB.isDisplayed());
        Assert.assertTrue(adminPage.conversionTextAB.isDisplayed());

    }

    @Then("Acilan sayfanin Details Butonu icerdigi dogrulanir.")
    public void acilanSayfaninDetailsButonuIcerdigiDogrulanir() {
        Assert.assertTrue(adminPage.detailsButtonAB.isDisplayed());
    }

    @Then("Acilan sayfanin Details Butonu tiklanir.")
    public void acilanSayfaninDetailsButonuTiklanir() {
        adminPage.detailsButtonAB.click();
    }

    @Then("Approve ve Reject butonlarinin görünür oldugu dogrulanir.")
    public void approveVeRejectButonlarininGörünürOlduguDogrulanir() {
        Assert.assertTrue(adminPage.approveButtonAB.isDisplayed());
        Assert.assertTrue(adminPage.rejectButtonAB.isDisplayed());
    }

    @And("Reject Butonuna tiklayinca cikan Alerte aciklama yazilir ve submit butonuna basilir.")
    public void rejectButonunaTiklayincaCikanAlerteAciklamaYazilirVeSubmitButonunaBasilir() {
        adminPage.rejectButtonAB.click();
        adminPage.rejectAllertTextAB.sendKeys(ConfigReader.getProperty("textAB"));
        adminPage.rejectSubmitButtonAB.click();

    }

    @And("Reject ile Pending Deposits listesinden kaldirildigi dogrulanir.")
    public void rejectIlePendingDepositsListesindenKaldirildigiDogrulanir() {
        ReusableMethods.wait(1);
        String alertText = adminPage.rejectVeriyfyAB.getText();
       // ReusableMethods.getScreenshot("RejecktVeryfy");

        Assert.assertTrue(alertText.contains("Deposit request rejected successfully"));
        // Alert üzerindeki metni yazdırın
        System.out.println(alertText);

    }

    @And("Approve Butonuna tiklayinca cikan Are you sure to approve this transaction? sorulu  Alert yes butonuna basilir.")
    public void approveButonunaTiklayincaCikanAreYouSureToApproveThisTransactionSoruluAlertYesButonunaBasilir() {
        adminPage.approveButtonAB.click();
        adminPage.approveAlertYesAB.click();


    }

    @Then("Aprove Pending Deposits listesinden kaldirildigi dogrulanir.")
    public void aprovePendingDepositsListesindenKaldirildigiDogrulanir() {
        ReusableMethods.wait(1);
        String alertText = adminPage.rejectVeriyfyAB.getText();
        //ReusableMethods.getScreenshot("ApprovedVeryfy");

        Assert.assertTrue(alertText.contains("Deposit request approved successfully"));
        // Alert üzerindeki metni yazdırın
        System.out.println(alertText);
    }

    @Then("acilan sayfada Support Butonu oldugu dogrulanir")
    public void acilanSayfadaSupportButonuOlduguDogrulanir() {
        Assert.assertTrue(adminPage.supportTicketButtonAB.isDisplayed());


    }

    @Then("acilan sayfada Support Butonu tiklanir.")
    public void acilanSayfadaSupportButonuTiklanir() {
        adminPage.supportTicketButtonAB.click();
        ReusableMethods.wait(2);
    }

    @Then("Support Ticket menu altinda Pending Ticket,Closed Ticket,Answered Ticked, All Ticked butonlari oldugu dogrulanir.")
    public void supportTicketMenuAltindaPendingTicketClosedTicketAnsweredTickedAllTickedButonlariOlduguDogrulanir() {
        Assert.assertTrue(adminPage.supportPendingTicketAB.isDisplayed());
        Assert.assertTrue(adminPage.supportClosedTicketAB.isDisplayed());
        Assert.assertTrue(adminPage.sopportAsweredTAB.isDisplayed());
        Assert.assertTrue(adminPage.sopportAllTicketAB.isDisplayed());
    }

    @Then("Support Ticket menu altinda Pending Ticket butonuna tiklandiginda bu sayfaya gittigi dogrulanir")
    public void supportTicketMenuAltindaPendingTicketButonunaTiklandigindaBuSayfayaGittigiDogrulanir() {
        adminPage.supportPendingTicketAB.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.pendingTicketsTextAB.isDisplayed());
    }

    @Then("Support Ticket menu altinda Closed Ticket butonuna tiklandiginda bu sayfaya gittigi dogrulanir")
    public void support_ticket_menu_altinda_closed_ticket_butonuna_tiklandiginda_bu_sayfaya_gittigi_dogrulanir() {
        adminPage.supportClosedTicketAB.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.closedTicketsTextAB.isDisplayed());
    }

    @Then("Support Ticket menu altinda Answered Ticked butonuna tiklandiginda bu sayfaya gittigi dogrulanir")
    public void support_ticket_menu_altinda_answered_ticked_butonuna_tiklandiginda_bu_sayfaya_gittigi_dogrulanir() {
        adminPage.sopportAsweredTAB.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.answeredTicketsTextAB.isDisplayed());


    }

    @Then("Support Ticket menu altinda All Ticked  butonuna tiklandiginda bu sayfaya gittigi dogrulanir")
    public void support_ticket_menu_altinda_all_ticked_butonuna_tiklandiginda_bu_sayfaya_gittigi_dogrulanir() {
        adminPage.sopportAllTicketAB.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.allTicketTextSupportedAB.isDisplayed());
    }

    @Then("Support Ticket menu altinda Pending Ticket butonuna tiklanir.")
    public void supportTicketMenuAltindaPendingTicketButonunaTiklanir() {
        adminPage.supportPendingTicketAB.click();
    }

    @And("Acilan sayfada Subject,Submitted By,Status Priority,Last Reply,Action' bilgileri görünür oldugu dogrulanir.")
    public void acilanSayfadaSubjectSubmittedByStatusPriorityLastReplyActionBilgileriGörünürOlduguDogrulanir() {
        Assert.assertTrue(adminPage.pendingSubjectTitleAB.isDisplayed());
        Assert.assertTrue(adminPage.pendingSubmittedByTitleAB.isDisplayed());
        Assert.assertTrue(adminPage.pendingStatusTitleAB.isDisplayed());
        Assert.assertTrue(adminPage.pendingPriorityTitleAB.isDisplayed());
        Assert.assertTrue(adminPage.pendingLastReplyTitleAB.isDisplayed());
        Assert.assertTrue(adminPage.pendingActionTitleAB.isDisplayed());


    }

    @And("Acilan sayfada Action Titleinin altinda bulunan Details butonuna tiklanir.")
    public void acilanSayfadaActionTitleininAltindaBulunanDetailsButonunaTiklanir() {
        adminPage.detailsButtonAB.click();
    }

    @Then("Acilan sayfada Close Ticket, Reply,Delete butonlari oldugu dogrulanir.")
    public void acilanSayfadaCloseTicketReplyDeleteButonlariOlduguDogrulanir() {
        Assert.assertTrue(adminPage.detCloseTicketButtonAB.isDisplayed());
        Assert.assertTrue(adminPage.detReplyButtonAB.isDisplayed());
        Assert.assertTrue(adminPage.detDeleteButtonAB.isDisplayed());

    }

    @Then("Close butonuna tiklanip allert kabul edildiginde Supported ticket closed succesfully yazisi göründügü dogrulanir.")
    public void closeButonunaTiklanipAllertKabulEdildigindeSupportedTicketClosedSuccesfullyYazisiGöründügüDogrulanir() {

        adminPage.detCloseTicketButtonAB.click();
        ReusableMethods.wait(1);
        adminPage.closedYesButtonAB.click();
        Assert.assertTrue(adminPage.closedAllertAB.isDisplayed());
        //ReusableMethods.getScreenshot("ClosedSuccess");

    }

    @And("Delete butonuna tiklanip Alert kabul edildiginde Support Ticket Deleted successfully ciktigi dogrulanir.")
    public void deleteButonunaTiklanipAlertKabulEdildigindeSupportTicketDeletedSuccessfullyCiktigiDogrulanir() {
        adminPage.detDeleteButtonAB.click();
        ReusableMethods.wait(1);
        adminPage.deleteYesButonuAB.click();
        Assert.assertTrue(adminPage.deleteAllertAB.isDisplayed());
        //ReusableMethods.getScreenshot("DeleteSuccess");
    }

    @Then("Metin Kutusuna cevap yazilip Reply butonuna tiklandiginda Support Ticket Replyed successfully yazisi ciktigi dogrulanir.")
    public void metinKutusunaCevapYazilipReplyButonunaTiklandigindaSupportTicketReplyedSuccessfullyYazisiCiktigiDogrulanir() {
        adminPage.sopportAllTicketAB.click();
        ReusableMethods.wait(2);
        adminPage.supportPendingTicketAB.click();
        adminPage.detailsButtonAB.click();
        adminPage.replyTextAB.sendKeys(ConfigReader.getProperty("textAB"));
        adminPage.detReplyButtonAB.click();
        ReusableMethods.wait(2);

        Assert.assertTrue(adminPage.replyAllertAB.isDisplayed());
        //ReusableMethods.getScreenshot("ReplySuccess");
    }
}