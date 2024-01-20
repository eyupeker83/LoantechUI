package stepdefinitions.QA_10;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;
import static utilities.Driver.getDriver;

public class QA_10_US_001_002_021_035_Stepdefinitions {

    HomePage homePage = new HomePage();
    AdminPage adminPage = new AdminPage();
    LoginPage loginPage = new LoginPage();
    UserPage userPage = new UserPage();
    Actions actions = new Actions(Driver.getDriver());


    @Given("Ziyaretçi {string} anasayfaya gider.")
    public void ziyaretçi_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("homepageUrl"));
        ReusableMethods.wait(2);
        homePage.cookiesKabulButonu.click();
        ReusableMethods.wait(1);
    }

    @When("web sitesine erişebildiğini test eder.")
    public void web_sitesine_erişebildiğini_test_eder() {
        String expectedWebAdresi = ("https://qa.loantechexper.com/");
        String actualWebAdresi = driver.getCurrentUrl();
        Assert.assertTrue(actualWebAdresi.equals(expectedWebAdresi));
    }

    @Then("web sitesinde anasayfanın görünür olduğu doğrulanır.")
    public void web_sitesinde_anasayfanın_görünür_olduğu_doğrulanır() {
        String expectedAnasayfaBasligi = ("Loantech Exper - Home");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
    }

    @Then("Browser kapatilir.")
    public void Browser_kapatilir() {
        Driver.closeDriver();
    }

    @Given("Anasayfa üst barında email bilgilerinin bulunduğu test edilir.")
    public void anasayfa_üst_barında_email_bilgilerinin_bulunduğu_test_edilir() {
        Assert.assertTrue(homePage.emailMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Anasayfa üst barında adres bilgilerinin bulunduğu test edilir.")
    public void anasayfa_üst_barında_adres_bilgilerinin_bulunduğu_test_edilir() {
        Assert.assertTrue(homePage.adresMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Anasayfa üst barında telefon bilgilerinin bulunduğu test edilir.")
    public void anasayfa_üst_barında_telefon_bilgilerinin_bulunduğu_test_edilir() {
        Assert.assertTrue(homePage.telefonMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Logo iconunun bulunduğu test edilir.")
    public void menuCubugundakiLogoIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.logoButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Home iconunun bulunduğu test edilir.")
    public void menuCubugundakiHomeIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.homeButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki About iconunun bulunduğu test edilir.")
    public void menuCubugundakiAboutIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.aboutButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Plans iconunun bulunduğu test edilir.")
    public void menuCubugundakiPlansIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.plansButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Blogs iconunun bulunduğu test edilir.")
    public void menuCubugundakiBlogsIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.blogsButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Contact iconunun bulunduğu test edilir.")
    public void menuCubugundakiContactIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.contactButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Login iconunun bulunduğu test edilir.")
    public void menuCubugundakiLoginIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.loginButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Anasayfada Get Started iconunun bulunduğu test edilir.")
    public void anasayfadaGetStartedIconununBulunduğuTestEdilir() {
        Assert.assertTrue(homePage.getStartedButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Logo iconu tıklanır.")
    public void menuCubugundakiLogoIconuTıklanır() {
        homePage.logoButtonElementi.click();
        ReusableMethods.wait(1);
    }

    @And("Sitenin anasayfasına geçiş yapıldığı test edilir.")
    public void siteninAnasayfasınaGeçişYapıldığıTestEdilir() {
        String expectedAnasayfaBasligi = ("Loantech Exper - Home");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
    }

    @And("Menu cubugundaki Logo iconunun aktif olduğu test edilir.")
    public void menuCubugundakiLogoIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.logoButtonElementi.isEnabled());
        ReusableMethods.wait(1);

    }

    @And("Menu cubugundaki Home iconunun aktif olduğu test edilir.")
    public void menuCubugundakiHomeIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.homeButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki About iconunun aktif olduğu test edilir.")
    public void menuCubugundakiAboutIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.aboutButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Plans iconunun aktif olduğu test edilir.")
    public void menuCubugundakiPlansIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.plansButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Blogs iconunun aktif olduğu test edilir.")
    public void menuCubugundakiBlogsIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.blogsButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Contact iconunun aktif olduğu test edilir.")
    public void menuCubugundakiContactIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.contactButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Menu cubugundaki Login iconunun aktif olduğu test edilir.")
    public void menuCubugundakiLoginIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.loginButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @And("Anasayfada Get Started iconunun aktif olduğu test edilir.")
    public void anasayfadaGetStartedIconununAktifOlduğuTestEdilir() {
        Assert.assertTrue(homePage.getStartedButtonElementi.isEnabled());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici {string} anasayfaya gider.")
    public void kullanici_anasayfaya_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("userloginUrl"));
        ReusableMethods.wait(2);
        loginPage.cookiesElementi.click();
        ReusableMethods.wait(1);
    }

    @When("Kullanici web sitesine erişebildiğini test eder.")
    public void kullaniciWebSitesineErişebildiğiniTestEder() {
        String expectedWebAdresi = ("https://qa.loantechexper.com/user/login");
        String actualWebAdresi = driver.getCurrentUrl();
        Assert.assertTrue(actualWebAdresi.equals(expectedWebAdresi));
    }

    @Then("Kullanici web sitesinde anasayfanın görünür olduğu doğrulanır.")
    public void kullaniciWebSitesindeAnasayfanınGörünürOlduğuDoğrulanır() {
        String expectedAnasayfaBasligi = ("Loantech Exper - Login");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
    }

    @And("Kullanici Anasayfa üst barında email bilgilerinin bulunduğu test edilir.")
    public void kullaniciAnasayfaÜstBarındaEmailBilgilerininBulunduğuTestEdilir() {
        Assert.assertTrue(userPage.emailMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Kullanici Anasayfa üst barında adres bilgilerinin bulunduğu test edilir.")
    public void kullaniciAnasayfaÜstBarındaAdresBilgilerininBulunduğuTestEdilir() {
        Assert.assertTrue(userPage.adresMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Kullanici Anasayfa üst barında telefon bilgilerinin bulunduğu test edilir.")
    public void kullaniciAnasayfaÜstBarındaTelefonBilgilerininBulunduğuTestEdilir() {
        Assert.assertTrue(userPage.telefonMenusuYaziElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Kullanici Menu cubugundaki Logo iconunun bulunduğu test edilir.")
    public void kullaniciMenuCubugundakiLogoIconununBulunduğuTestEdilir() {
        Assert.assertTrue(userPage.logoButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Home iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_home_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.homeButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki About iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_about_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.aboutButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Plans iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_plans_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.plansButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Blogs iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_blogs_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.blogsButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Contact iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_contact_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.contactButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Login iconunun bulunduğu test edilir.")
    public void kullanici_menu_cubugundaki_login_iconunun_bulunduğu_test_edilir() {
        Assert.assertTrue(userPage.loginButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Anasayfada Get Started iconunun bulunduğu test edilir.")
    public void kullanici_anasayfada_get_started_iconunun_bulunduğu_test_edilir() {
        userPage.logoButtonElementi.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(userPage.getStartedButtonElementi.isDisplayed());
        ReusableMethods.wait(1);
    }

    @And("Kullanici Menu cubugundaki Logo iconu tıklanır.")
    public void kullaniciMenuCubugundakiLogoIconuTıklanır() {
        userPage.logoButtonElementi.click();
    }

    @And("Kullanici Sitenin anasayfasına geçiş yapıldığı test edilir.")
    public void kullaniciSiteninAnasayfasınaGeçişYapıldığıTestEdilir() {
        String expectedAnasayfaBasligi = ("Loantech Exper - Home");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Logo iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_logo_iconunun_aktif_olduğu_test_edilir() {
        userPage.logoButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Home");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);
    }

    @Given("Kullanici Menu cubugundaki Home iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_home_iconunun_aktif_olduğu_test_edilir() {
        userPage.homeButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Home");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Menu cubugundaki About iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_about_iconunun_aktif_olduğu_test_edilir() {
        userPage.aboutButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - About");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Menu cubugundaki Plans iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_plans_iconunun_aktif_olduğu_test_edilir() {
        userPage.plansButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Loan Plans");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Menu cubugundaki Blogs iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_blogs_iconunun_aktif_olduğu_test_edilir() {
        userPage.blogsButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Blogs");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Menu cubugundaki Contact iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_contact_iconunun_aktif_olduğu_test_edilir() {
        userPage.contactButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Contact Us");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Menu cubugundaki Login iconunun aktif olduğu test edilir.")
    public void kullanici_menu_cubugundaki_login_iconunun_aktif_olduğu_test_edilir() {
        userPage.loginButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Login");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);

    }

    @Given("Kullanici Anasayfada Get Started iconunun aktif olduğu test edilir.")
    public void kullanici_anasayfada_get_started_iconunun_aktif_olduğu_test_edilir() {
        userPage.logoButtonElementi.click();
        userPage.getStartedButtonElementi.click();
        String expectedAnasayfaBasligi = ("Loantech Exper - Register");
        String actualAnasayfaBasligi = Driver.getDriver().getTitle();
        Assert.assertTrue(actualAnasayfaBasligi.equals(expectedAnasayfaBasligi));
        ReusableMethods.wait(1);
    }

    @Given("Kullanici {string} anasayfasina gider.")
    public void kullanici_anasayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminloginUrl"));
        ReusableMethods.wait(2);
    }

    @Given("Kutucuklara adminUsername ve adminPassword' u girer.")
    public void kutucuklara_admin_username_ve_admin_password_u_girer() {
        adminPage.adminnamebox.sendKeys(ConfigReader.getProperty("qa10_adminUsername"));
        adminPage.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("qa10_adminPassword"));
        ReusableMethods.wait(2);

    }

    @Then("Login butonuna tiklar.")
    public void login_butonuna_tiklar() {
        adminPage.adminLoginButtonElemnenti.click();
        ReusableMethods.wait(1);

    }

    @Then("Dashboard anasayfada {string},{string},{string},{string} basliklarinin görünür olduğu doğrulanır.")
    public void dashboard_anasayfada_basliklarinin_görünür_olduğu_doğrulanır(String string, String string2, String string3, String string4) {
        Assert.assertTrue(adminPage.adminTotalUsersButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminActiveUsersButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminEmailUnverifiedUsersButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminMobileUnverifiedUsersButtonu.isDisplayed());

    }

    @Then("Anasayfada bulunan {string},{string},{string},{string} basliklari tiklandiginda ilgili sayfaya yonlendirdigi test edilir.")
    public void anasayfada_bulunan_basliklari_tiklandiginda_ilgili_sayfaya_yonlendirdigi_test_edilir(String string, String string2, String string3, String string4) {

        adminPage.adminTotalUsersButtonu.click();
        String expectedTotalUsersSayfasi = ("Loantech Exper - All Users");
        String actualTotalUsersSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualTotalUsersSayfasi.equals(expectedTotalUsersSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminActiveUsersButtonu.click();
        String expectedActiveUsersSayfasi = ("Loantech Exper - Active Users");
        String actualActiveUsersSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualActiveUsersSayfasi.equals(expectedActiveUsersSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminEmailUnverifiedUsersButtonu.click();
        String expectedEmailUnverifiedUsersSayfasi = ("Loantech Exper - Email Unverified Users");
        String actualEmailUnverifiedUsersSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualEmailUnverifiedUsersSayfasi.equals(expectedEmailUnverifiedUsersSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminMobileUnverifiedUsersButtonu.click();
        String expectedMobileUnverifiedUsersSayfasi = ("Loantech Exper - Mobile Unverified Users");
        String actualMobileUnverifiedUsersSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualMobileUnverifiedUsersSayfasi.equals(expectedEmailUnverifiedUsersSayfasi));
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);

    }

    @Then("Dashboard anasayfada Running Loan, Pending Loan, Due Loan, Paid Loan,Total Deposited, Pending Deposits, Rejected Deposits, Deposited Charge,Total Withdrawn, Pending Withdrawals, Rejected Withdrawals, Withdrawal Charge basliklarinin gorunur oldugu dogrulanir.")
    public void dashboard_anasayfada_running_loan_pending_loan_due_loan_paid_loan_total_deposited_pending_deposits_rejected_deposits_deposited_charge_total_withdrawn_pending_withdrawals_rejected_withdrawals_withdrawal_charge_basliklarinin_gorunur_oldugu_dogrulanir() {
        Assert.assertTrue(adminPage.adminRunningLoanButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingLoanButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminDueLoanButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPaidLoanButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminTotalDepositedButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingDepositsButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminRejectedDepositsButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminDepositedChargeButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminTotalWithdrawnButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingWithdrawalsButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminRejectedWithdrawalsButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminWithdrawalChargeButtonu.isDisplayed());

    }

    @Then("Basliklarin sagindaki View All butonunun gorunur ve aktif oldugu test edilir.")
    public void basliklarin_sagindaki_view_all_butonunun_gorunur_ve_aktif_oldugu_test_edilir() {
        Assert.assertTrue(adminPage.adminRunningLoanWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingLoanWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminDueLoanWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPaidLoanWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminTotalDepositedWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingDepositsWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminRejectedDepositsWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminDepositedChargeWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminTotalWithdrawnWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminPendingWithdrawalsWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminRejectedWithdrawalsWiewAllButtonu.isDisplayed());
        Assert.assertTrue(adminPage.adminWithdrawalChargeWiewAllButtonu.isDisplayed());
        ReusableMethods.wait(2);
        Assert.assertTrue(adminPage.adminRunningLoanWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminPendingLoanWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminDueLoanWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminPaidLoanWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminTotalDepositedWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminPendingDepositsWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminRejectedDepositsWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminDepositedChargeWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminTotalWithdrawnWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminPendingWithdrawalsWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminRejectedWithdrawalsWiewAllButtonu.isEnabled());
        Assert.assertTrue(adminPage.adminWithdrawalChargeWiewAllButtonu.isEnabled());

    }

    @Then("Wiew All butonlari tiklandiginda ilgili sayfaya yonlendirdigi dogrulanir.")
    public void wiew_all_butonlari_tiklandiginda_ilgili_sayfaya_yonlendirdigi_dogrulanir() {

        adminPage.adminRunningLoanWiewAllButtonu.click();
        String expectedRunningLoansWiewSayfasi = ("Loantech Exper - Running Loans");
        String actualRunningLoansWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualRunningLoansWiewSayfasi.equals(expectedRunningLoansWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminPendingLoanWiewAllButtonu.click();
        String expectedPendingLoanWiewSayfasi = ("Loantech Exper - Pending Loans");
        String actualPendingLoanWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPendingLoanWiewSayfasi.equals(expectedPendingLoanWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminDueLoanWiewAllButtonu.click();
        String expectedDueLoanWiewSayfasi = ("Loantech Exper - Due Installment Loans");
        String actualDueLoanWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualDueLoanWiewSayfasi.equals(expectedDueLoanWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminPaidLoanWiewAllButtonu.click();
        String expectedPaidLoanWiewSayfasi = ("Loantech Exper - Paid Loans");
        String actualPaidLoanWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPaidLoanWiewSayfasi.equals(expectedPaidLoanWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        adminPage.adminTotalDepositedWiewAllButtonu.click();
        String expectedTotalDepositedWiewSayfasi = ("Loantech Exper - Deposit History");
        String actualTotalDepositedWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualTotalDepositedWiewSayfasi.equals(expectedTotalDepositedWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminPendingDepositsWiewAllButtonu.click();
        String expectedPendingDepositsWiewSayfasi = ("Loantech Exper - Pending Deposits");
        String actualPendingDepositsWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPendingDepositsWiewSayfasi.equals(expectedPendingDepositsWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminRejectedDepositsWiewAllButtonu.click();
        String expectedRejectedDepositsWiewSayfasi = ("Loantech Exper - Rejected Deposits");
        String actualRejectedDepositsWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualRejectedDepositsWiewSayfasi.equals(expectedRejectedDepositsWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminDepositedChargeWiewAllButtonu.click();
        String expectedDepositedChargeWiewSayfasi = ("Loantech Exper - Deposit History");
        String actualDepositedChargeWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPaidLoanWiewSayfasi.equals(expectedPaidLoanWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);
        adminPage.adminTotalWithdrawnWiewAllButtonu.click();
        String expectedTotalWithdrawnWiewSayfasi = ("Loantech Exper - Withdrawals Log");
        String actualTotalWithdrawnWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualTotalWithdrawnWiewSayfasi.equals(expectedTotalWithdrawnWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminPendingWithdrawalsWiewAllButtonu.click();
        String expectedPendingWithdrawalsWiewSayfasi = ("Loantech Exper - Pending Withdrawals");
        String actualPendingWithdrawalsWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPendingWithdrawalsWiewSayfasi.equals(expectedPendingWithdrawalsWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminRejectedWithdrawalsWiewAllButtonu.click();
        String expectedRejectedWithdrawalsWiewSayfasi = ("Loantech Exper - Rejected Withdrawals");
        String actualRejectedWithdrawalsWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualRejectedWithdrawalsWiewSayfasi.equals(expectedRejectedWithdrawalsWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminPage.adminWithdrawalChargeWiewAllButtonu.click();
        String expectedWithdrawalChargeWiewSayfasi = ("Loantech Exper - Withdrawals Log");
        String actualWithdrawalChargeWiewSayfasi = (Driver.getDriver().getTitle());
        Assert.assertTrue(actualPaidLoanWiewSayfasi.equals(expectedPaidLoanWiewSayfasi));

        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
    }

    @Then("Dashboard sayfasindaki Monthly Deposit & Withdraw Report \\(Last {int} Month), Transactions Report \\(Last {int} Days) chart egrilerinin gorundugu dogrulanir")
    public void dashboardSayfasindakiMonthlyDepositWithdrawReportLastMonthTransactionsReportLastDaysChartEgrilerininGorunduguDogrulanir(int arg0, int arg1) {
        Assert.assertTrue(adminPage.adminMonthlyDepositEgrisi.isDisplayed());
        Assert.assertTrue(adminPage.adminTransactionsReportEgrisi.isDisplayed());

    }

    @Then("Dashboard sayfasindaki Login By Browser, Login By OS,Login By Country chart egrilerinin gorundugu test edilir.")
    public void dashboardSayfasindakiLoginByBrowserLoginByOSLoginByCountryChartEgrilerininGorunduguTestEdilir() {
        Assert.assertTrue(adminPage.adminLoginByBrowserPastasi.isDisplayed());
        Assert.assertTrue(adminPage.adminLoginByOSPastasi.isDisplayed());
        Assert.assertTrue(adminPage.adminLoginByCountryPastasi.isDisplayed());
    }
}

 
