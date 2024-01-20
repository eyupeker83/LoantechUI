package stepdefinitions.QA_07;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QA_07_US_047_Stepdefinitions {

    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());
    LoginPage loginPage = new LoginPage();


    @Given("kullanici {string} ile browserdan siteye erisir.")
    public void kullanici_ile_browserdan_siteye_erisir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("adminloginUrl"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
    }

    @Given("acilan admin login sayfasinda username kutusuna gecerli bir admin kullanici adi  girilir.")
    public void acilan_admin_login_sayfasinda_username_kutusuna_gecerli_bir_admin_kullanici_adi_girilir() {
        adminPage.adminUsernameKutusu.sendKeys(ConfigReader.getProperty("adminnameQA7"));
    }

    @Given("acilan admin login sayfasinda password kutusuna gecerli bir admin sifre girilir.")
    public void acilan_admin_login_sayfasinda_password_kutusuna_gecerli_bir_admin_sifre_girilir() {
        adminPage.adminPasswordKutusu.sendKeys(ConfigReader.getProperty("adminpasswordQA7"));
    }

    @Given("Login butonuna tiklanir.")
    public void login_butonuna_tiklanir() {

        ReusableMethods.wait(1);
        adminPage.loginButton.click();
    }

    @Given("acilan pencerede soldaki menude Manage Users kismina tiklanir.")
    public void acilan_pencerede_soldaki_menude_manage_users_kismina_tiklanir() {
        adminPage.manageUsers.click();
    }

    @Given("aktif kullanicilar butonuna tiklanir.")
    public void aktif_kullanicilar_butonuna_tiklanir() {
        adminPage.activeUsers.click();
        ReusableMethods.wait(2);
    }
    @Given("arama kutusuna {string} yazilir.")
    public void arama_kutusuna_kaan1_yazilir(String kaan) {
        ReusableMethods.wait(2);
        adminPage.selectusersKutusu.click();
        adminPage.selectusersKutusu.sendKeys(ConfigReader.getProperty(kaan));
        adminPage.searchAramabutonu.click();
        ReusableMethods.wait(2);

    }

    @Given("islem yapilacak kullaniciya ait details butonuna tiklanir.")
    public void islem_yapilacak_kullaniciya_ait_details_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.activeUsersIlkKullanciDetails.click();
    }

    @Given("ban user butonuna tiklanir.")
    public void ban_user_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.banUserElementi.click();

    }

    @Given("aciklama kismina yasaklama sebebi hakkinda bilgi girilir.")
    public void aciklama_kismina_yasaklama_sebebi_hakkinda_bilgi_girilir() {
        ReusableMethods.wait(2);
        adminPage.banAciklamaKutusuElementi.click();
        adminPage.banAciklamaKutusuElementi.sendKeys(ConfigReader.getProperty("test"));
    }

    @Given("submit butonuna tiklanir.")
    public void submit_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.banUserAciklamaSubmitElementi.click();
    }

    @Given("isleminin onaylandiğina yonelik uyari mesajinin goruldugu test edilir.")
    public void isleminin_onaylandigina_yonelik_uyari_mesajinin_goruldugu_test_edilir() {
        ReusableMethods.wait(2);
        adminPage.banOnayMesajiElementi.isDisplayed();
    }

    @Given("banner users butonuna tiklanir.")
    public void banner_users_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.bannedUsersElementi.click();
    }

    /*
    @Given("arama kutusuna {string} yazilir.")
    public void arama_kutusuna_kaan_yazilir(String kaan) {
        ReusableMethods.wait(1);
        adminPage.selectusersKutusu.click();
        adminPage.selectusersKutusu.sendKeys(ConfigReader.getProperty(kaan));
        actions.sendKeys(Keys.ENTER);
        ReusableMethods.wait(1);
    }
*/
    @Given("engellenen  kullanicinin user bilgisinin listede  gorunur oldugu test edilir.")
    public void engellenen_kullanicinin_user_bilgisinin_listede_gorunur_oldugu_test_edilir() {
        ReusableMethods.wait(2);
        adminPage.banIlkUser.isDisplayed();
    }

    @Given("acilan listeden, islem yapilacak kullaniciya ait details butonuna tiklanir.")
    public void acilan_listeden_islem_yapilacak_kullaniciya_ait_details_butonuna_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.banUsersIlkKullanciDetails.click();
    }

    @Given("kullanicinin engellenmis olduğunun goruldugu test edilir.")
    public void kullanicinin_engellenmis_oldugunun_goruldugu_test_edilir() {
        ReusableMethods.wait(2);
        adminPage.bannedUyariYazisi.isDisplayed();
    }

    @Given("admin kullanici adina tiklanir.")
    public void admin_kullanici_adina_tiklanir() {
        ReusableMethods.wait(2);
        adminPage.adminIsimButonu.click();
    }

    @Given("logout butonuna tiklanir.")
    public void logout_butonuna_tiklanir() {
        ReusableMethods.wait(1);
        adminPage.adminLogoutButonu.click();
    }

    @Given("browser kapatilir.")
    public void browser_kapatilir() {
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

}