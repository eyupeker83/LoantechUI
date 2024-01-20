package stepdefinitions.QA_09;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.security.auth.kerberos.KeyTab;

public class QA_09_US_007_024_025_042_Stepdefinitions {

    HomePage homePage = new HomePage();
    Actions actions=new Actions(Driver.getDriver());
    LoginPage loginPage = new LoginPage();
    AdminPage adminPage = new AdminPage();


    // US_007 TC_01
    @Given("belirlenen site {string} ile browserden siteye erisilir .")
    public void belirlenenSiteIleBrowserdenSiteyeErisilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("homepageUrl"));
        ReusableMethods.wait(2);
        homePage.cookiesElementi.click();
        ReusableMethods.wait(1);
    }


    @Then("homepage footer bolumunde Important Link baslıgı altında Loan Plans Linki görünür oldugu dogrulanır .")
    public void homepageFooterBolumundeImportantLinkBaslıgıAltındaLoanPlansLinkiGorunurOlduguDogrulanır() {
        Assert.assertTrue(homePage.loansPlanlinkElementi.isDisplayed());
    }
    @And("homepage footer bolumunde Important Link baslıgı altında Loan Plans Linki aktif oldugu dogrulanır .")
    public void homepageFooterBolumundeImportantLinkBaslıgıAltındaLoanPlansLinkiAktifOlduguDogrulanır() {
   Assert.assertTrue(homePage.loansPlanlinkElementi.isEnabled());
    }

    @Then("Loan Plans Sayfasinda Basic Loan tiklanir .")
    public void loan_plans_sayfasinda_basic_loan_tiklanir() {
        homePage.basicLoanbutonElementi.click();
    }

    @Then("basic Loan basligi altinda Loan Plan Cardlar görüntülendigi dogrulanır .")
    public void basic_loan_basligi_altinda_loan_plan_cardlar_görüntülendigi_dogrulanır() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.basicLoanKartElementi.isDisplayed());
    }
    @Then("cardlarin altinda bulunan Apply Now butonlarinin görünür oldugu dogrulanir.")
    public void cardlarin_altinda_bulunan_apply_now_butonlarinin_görünür_oldugu_dogrulanir() {
        Assert.assertTrue(homePage.applyNowButonElementi.isDisplayed());
    }
    @Then("cardlarin altinda bulunan Apply Now butonlarinin aktif oldugu dogrulanir")
    public void cardlarin_altinda_bulunan_apply_now_butonlarinin_aktif_oldugu_dogrulanir() {
            Assert.assertTrue(homePage.applyNowButonElementi.isEnabled());
    }
   @Then("browser kapatilir .")
    public void browser_kapatilir() {
    Driver.closeDriver();
    }


      // US_007 TC_02
    @Then("loan Plans Sayfasinda Home linkine tiklanir .")
    public void loan_plans_sayfasinda_home_linkine_tiklanir() {
        ReusableMethods.wait(2);
        homePage.homeLinkiLoansplandaki.click();
    }
    @Then("homepage sayfasina gecis yapılabildigi dogrulanir .")
    public void homepage_sayfasina_gecis_yapılabildigi_dogrulanir() {
        ReusableMethods.wait(2);
        String expectedhomePageTitle ="One Loan At A Time: Your Trusted Partner In Financial Empowerment" ;
        String actualhomePageTitle = homePage.homepageTitle.getText();
        Assert.assertTrue(actualhomePageTitle.contains(expectedhomePageTitle));
       // Assert.assertTrue(homePage.getStartedbutonuhomeda.isDisplayed());

    }
    @Then("loan Plans Sayfasinda Loan Plans linkine tiklanir .")
    public void loan_plans_sayfasinda_loan_plans_linkine_tiklanir() {
        ReusableMethods.wait(2);
        Driver.getDriver().navigate().back();
       homePage.LoanPlansLinkiLoansplandaki.click();

    }
    @Then("loan Plans sayfasina  gecis yapilabildiği dogrulanir")
    public void loan_plans_sayfasina_gecis_yapilabildiği_dogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.LoanPlansLinkiLoansplandaki.isEnabled());
    }





    // US_024
    @Given("belirlenen site {string} i ile browserdan siteye erisilir .")
    public void belirlenen_site_i_ile_browserdan_siteye_erisilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("userloginUrl"));
        ReusableMethods.wait(2);
        loginPage.cookiesElementi.click();
        ReusableMethods.wait(1);
    }
    @Then("homepagede header bolumunde login sekmesine  tiklanir .")
    public void homepagede_header_bolumunde_login_sekmesine_tiklanir() {

        loginPage.loginButonu.click();
    }


    @And("acilan login sayfasinda username kutusuna gecerli bir {string} girilir .")
    public void acilanLoginSayfasindaUsernameKutusunaGecerliBirGirilir(String username) {
        ReusableMethods.wait(3);

            actions.sendKeys(Keys.PAGE_DOWN).perform();
            loginPage.usernamebox.sendKeys(ConfigReader.getProperty(username));
        ReusableMethods.wait(2);
    }

    @And("login sayfasinda Your password kutusuna kullanici {string} girilir .")
    public void loginSayfasindaYourPasswordKutusunaKullaniciGirilir(String userpassword) {
        actions.sendKeys(Keys.TAB).perform();
        loginPage.userpasswordbox.sendKeys(ConfigReader.getProperty(userpassword));
        ReusableMethods.wait(2);
    }


    @Then("giris yapabilmek için login butonuna tiklanir .")
    public void giris_yapabilmek_için_login_butonuna_tiklanir() {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",loginPage.loginOlmabutonu);
         loginPage.loginOlmabutonu.click();

    }
    @Then("dashboard sayfasinda bulunan   Successful Deposits basligi görüntülendigi test edilir .")
    public void dashboard_sayfasinda_bulunan_successful_deposits_basligi_görüntülendigi_test_edilir() {
       Assert.assertTrue( loginPage.successfulDepositsYazisi.isDisplayed());
    }
    @Then("dashboard sayfasinda bulunan  Successful Withdrawals basligi görüntülendigi test edilir .")
    public void dashboard_sayfasinda_bulunan_successful_withdrawals_basligi_görüntülendigi_test_edilir() {
        Assert.assertTrue(loginPage.successfulWittdralwalasYazisi.isDisplayed());
    }
    @Then("dashboard sayfasinda bulunan   Total Loan basligi görüntülendigi test edilir .")
    public void dashboard_sayfasinda_bulunan_total_loan_basligi_görüntülendigi_test_edilir() {
        Assert.assertTrue(loginPage.totalLoanYazisi.isDisplayed());
    }
    @Then("dashboard sayfasında bulunan basliklarin altindaki  Toplam tutar görüntülendigi test edilir .")
    public void dashboard_sayfasında_bulunan_basliklarin_altindaki_toplam_tutar_görüntülendigi_test_edilir() {
        Assert.assertTrue(loginPage.toplamkredimiktaryazisi.isDisplayed());
    }
    @Then("dashboard sayfasında bulunan basliklarin altindaki Submitted tutarin görüntülendigi test edilir .")
    public void dashboard_sayfasında_bulunan_basliklarin_altindaki_submitted_tutarin_görüntülendigi_test_edilir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(loginPage.submittedYazisi.isEnabled());
    }
    @Then("dashboard sayfasında bulunan basliklarin altindaki Pending  tutarin görüntülendigi test edilir .")
    public void dashboard_sayfasında_bulunan_basliklarin_altindaki_pending_tutarin_görüntülendigi_test_edilir() {
        Assert.assertTrue(loginPage.pendingYazisi.isDisplayed());
    }
    @Then("dashboard sayfasında bulunan basliklarin altindaki Rejected tutarin görüntülendigi test edilir .")
    public void dashboard_sayfasında_bulunan_basliklarin_altindaki_rejected_tutarin_görüntülendigi_test_edilir() {
        Assert.assertTrue(loginPage.rejectedYazisi.isDisplayed());
    }
    @Then("dashboard sayfasında bulunan basliklarin altindaki  kredi adetlerinin görüntülendigi test edilir .")
    public void dashboard_sayfasında_bulunan_basliklarin_altindaki_kredi_adetlerinin_görüntülendigi_test_edilir() {
            Assert.assertTrue(loginPage.krediAdetYazisi.isDisplayed());
    }

    // US_025 TC_01

    @Given("belirlenen site {string} i ile browserdan admin siteye erisilir .")
    public void belirlenenSiteIIleBrowserdanAdminSiteyeErisilir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminloginUrl"));
      //  ReusableMethods.wait(2);
      //  loginPage.cookiesElementi.click();
    }

    @Then("açılan admin login sayfasinda username kutusuna gecerli bir {string} kullanici adi  girilir .")
    public void açılan_admin_login_sayfasinda_username_kutusuna_gecerli_bir_kullanici_adi_girilir(String adminname) {
     //   Driver.getDriver().get(ConfigReader.getProperty("adminloginUrl"));
        ReusableMethods.wait(2);
        adminPage.adminnamebox.sendKeys(ConfigReader.getProperty(adminname));
    }
    @Then("admin login sayfasinda password kutusuna {string} girilir .")
    public void admin_login_sayfasinda_password_kutusuna_girilir(String adminpassword) {
        adminPage.passwordbox.sendKeys(ConfigReader.getProperty(adminpassword));

    }
    @Then("giris yapabilmek icin login butonuna tiklanir .")
    public void giris_yapabilmek_icin_login_butonuna_tiklanir() {
      JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
       js.executeScript("arguments[0].scrollIntoView(true);",adminPage.loginboxadmin);
        //adminPage.passwordbox.sendKeys(Keys.ENTER);
        ReusableMethods.wait(1);
        adminPage.loginboxadmin.click();

    }
    @Then("admin panel side bar uzerinde Loans menu basligi görüntülenir.")
    public void admin_panel_side_bar_uzerinde_loans_menu_basligi_görüntülenir() {
        Assert.assertTrue(adminPage.loansMenu.isDisplayed());

    }
    @Then("admin panel side bar uzerinde Loans menu basligi tiklanir.")
    public void admin_panel_side_bar_uzerinde_loans_menu_basligi_tiklanir() {
        adminPage.loansMenu.click();
        ReusableMethods.wait(2);

    }
    @Then("loans menu basligi altinda Pending Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_pending_loans_sayfa_basligi_görüntülenir() {
            adminPage.pendingLoan.click();
            ReusableMethods.wait(1);

    }
    @Then("loans menu basligi altinda Running Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_running_loans_sayfa_basligi_görüntülenir() {
            adminPage.runningLoan.click();
              ReusableMethods.wait(1);
    }
    @Then("loans menu basligi altinda Due Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_due_loans_sayfa_basligi_görüntülenir() {
            adminPage.dueLoan.click();
        ReusableMethods.wait(1);

    }
    @Then("loans menu basligi altinda Paid Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_paid_loans_sayfa_basligi_görüntülenir() {
        adminPage.paidLoan.click();
        ReusableMethods.wait(1);

    }
    @Then("loans menu basligi altinda Rejected Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_rejected_loans_sayfa_basligi_görüntülenir() {
        adminPage.rejectedLoan.click();
        ReusableMethods.wait(1);

    }
    @Then("loans menu basligi altinda  All Loans sayfa basligi görüntülenir.")
    public void loans_menu_basligi_altinda_all_loans_sayfa_basligi_görüntülenir() {
        adminPage.allLoan.click();
        ReusableMethods.wait(1);

    }

    @And("loans menu basligi altinda Pending Loans sayfa basligi tiklanir")
    public void loansMenuBasligiAltindaPendingLoansSayfaBasligiTiklanir() {
       adminPage.pendingLoan.click();
       ReusableMethods.wait(1);
    }

    @And("Pending Loans sayfasina ulasildigi test edilir .")
    public void pendingLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
    Assert.assertTrue(adminPage.pendingLoanbasligi.isDisplayed());
    }

    @And("Running Loans sayfasina ulasildigi test edilir .")
    public void runningLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.runningLoanbasligi.isDisplayed());

    }

    @And("Due Loans sayfasina ulasildigi test edilir  .")
    public void dueLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.dueLoanbasligi.isDisplayed());

    }

    @Then("loans menu basligi altinda Running Loans sayfa basligi tiklanir")
    public void loansMenuBasligiAltindaRunningLoansSayfaBasligiTiklanir() {
        ReusableMethods.wait(1);
        adminPage.runningLoan.click();
    }

    @And("loans menu basligi altinda Due Loans sayfa basligi tiklanir")
    public void loansMenuBasligiAltindaDueLoansSayfaBasligiTiklanir() {
        ReusableMethods.wait(1);
        adminPage.dueLoan.click();
    }

    @And("loans menu basligi altinda Paid Loans sayfa basligi tiklanir")
    public void loansMenuBasligiAltindaPaidLoansSayfaBasligiTiklanir() {
        ReusableMethods.wait(1);
        adminPage.paidLoan.click();
    }

    @And("Paid Loans sayfasina ulasildigi test edilir  .")
    public void paidLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.paidLoanbasligi.isDisplayed());
    }

    @Then("loans menu basligi altinda Rejected Loans sayfa basligi tiklanir")
    public void loansMenuBasligiAltindaRejectedLoansSayfaBasligiTiklanir() {
        ReusableMethods.wait(2);
        adminPage.rejectedLoan.click();
    }

    @And("Rejected Loans sayfasina ulasildigi test edilir   .")
    public void rejectedLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.rejectedLoanbasligi.isDisplayed());
    }

    @Then("loans menu basligi altinda  All Loans sbasligi tiklanir")
    public void loansMenuBasligiAltindaAllLoansSbasligiTiklanir() {

       ReusableMethods.wait(1);
       adminPage.allLoan.click();

    }

    @And("All Loans sayfasina ulasildigi test edilir  .")
    public void allLoansSayfasinaUlasildigiTestEdilir() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.allLoan.isDisplayed());
    }

   
   // US_042

    @Then("dashboard sayfasında bulunan Nawbar'da Manage Users linki basligina tiklanir ve aktif oldugu dogrulanır .")
    public void dashboardSayfasındaBulunanNawbarDaManageUsersLinkiBasliginaTiklanirVeAktifOlduguDogrulanır() {
        ReusableMethods.wait(1);
        adminPage.manageUsersLinki.click();
        Assert.assertTrue(adminPage.manageUsersLinki.isEnabled());
    }
    @Then("manage Users linki altinda Active Users linki tiklanir ve aktif oldugu dogrulanır .")
    public void manageUsersLinkiAltindaActiveUsersLinkiTiklanirVeAktifOlduguDogrulanır() {
        ReusableMethods.wait(1);
        adminPage.activeUsersLinki.click();
        Assert.assertTrue(adminPage.activeUsersLinki.isEnabled());
    }

    @And("active Users Listesinin görüntülendigi dogrulanır .")
    public void activeUsersListesininGoruntulendigiDogrulanır() {
        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.activeUserListesi.isDisplayed());
    }

    @And("active Users Listesinde  User liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeUserListeBasligiGoruntulendigiDogrulanır() {

        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.activeUserUSerbasligi.isDisplayed());
    }

    @And("active Users Listesinde  Email- phone liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeEmailPhoneListeBasligiGoruntulendigiDogrulanır() {
        Assert.assertTrue(adminPage.activeUserEmailbasligi.isDisplayed());
    }

    @And("active Users Listesinde  Country liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeCountryListeBasligiGoruntulendigiDogrulanır() {
        Assert.assertTrue(adminPage.activeUserCountrybasligi.isDisplayed());
    }

    @And("active Users Listesinde  Joined At liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeJoinedAtListeBasligiGoruntulendigiDogrulanır() {

        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.activeUserJoinedAtbasligi.isDisplayed());
    }

    @And("active Users Listesinde  Balance liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeBalanceListeBasligiGoruntulendigiDogrulanır() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.activeUserBalancebasligi.isDisplayed());
    }

    @And("active Users Listesinde  Action liste basligi görüntülendigi dogrulanır .")
    public void activeUsersListesindeActionListeBasligiGoruntulendigiDogrulanır() {

        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.activeUserActionbasligi.isDisplayed());
    }
    @Then("active Users  sayfasinda  Details butonu görüntülendigi dogrulanir .")
    public void active_users_sayfasinda_details_butonu_görüntülendigi_dogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.details.isDisplayed());
    }
    @Then("active Users  sayfasinda  Details butonu tiklanir .")
    public void activeUsersSayfasindaDetailsButonuTiklanir() {
        ReusableMethods.wait(2);
        adminPage.details.click();
    }

    @Then("user Detail sayfasinda Logins butonu görüntülenir .")
    public void user_detail_sayfasinda_logins_butonu_görüntülenir() {
        ReusableMethods.wait(2);
       Assert.assertTrue(adminPage.detailsLoginButonu.isDisplayed());
    }
    @Then("user Detail sayfasinda Logins butonunun aktif oldugu dogrulanir .")
    public void user_detail_sayfasinda_logins_butonunun_aktif_oldugu_dogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.detailsLoginButonu.isEnabled());
    }
    @Then("Logins butonuna tiklanir .")
    public void logins_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.detailsLoginButonu.click();
    }
    @Then("User Login History sayfasina ulasılabildigi dogrulanir .")
    public void user_login_history_sayfasina_ulasılabildigi_dogrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.detailsloginHistorysayfasi.isEnabled());
    }
    @Then("user Login History sayfasinda kullanicinin giris bilgilerinin oldugu liste görüntülenir.")
    public void user_login_history_sayfasinda_kullanicinin_giris_bilgilerinin_oldugu_liste_görüntülenir() {
       ReusableMethods.wait(2);
        adminPage.detailsloginHistoryListesi.isDisplayed();
    }

    @Then("dashboard sayfasında bulunan Nawbar'da Manage Users linki basligina tiklanir .")
    public void dashboard_sayfasında_bulunan_nawbar_da_manage_users_linki_basligina_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.manageUsersLinki.click();
    }
    @Then("manage Users linki altinda Active Users linki tiklanir  .")
    public void manage_users_linki_altinda_active_users_linki_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.activeUsersLinki.click();
    }
    @Then("active Users  sayfasinda  Details butonu tiklanir")
    public void active_users_sayfasinda_details_butonu_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.details.click();
    }
    @And("Logins butonuna tiklanirr .")
    public void loginsButonunaTiklanirr() {
        ReusableMethods.wait(2);
        adminPage.detailsLoginButonu.click();
    }

    @Then("user Login History sayfasina ulaşılabildiği doğrulanir .")
    public void user_login_history_sayfasina_ulaşılabildiği_doğrulanir() {
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.detailsloginHistorysayfasi.isEnabled());
    }
    @Then("user Login History sayfasinda kullanicinin giriş bilgilerinin oldugu listenin görüntülendigi dogrulanir.")
    public void user_login_history_sayfasinda_kullanicinin_giriş_bilgilerinin_oldugu_listenin_görüntülendigi_dogrulanir() {
        ReusableMethods.wait(2);
       Assert.assertTrue(adminPage.detailsloginHistoryListesi.isDisplayed());
    }


}
