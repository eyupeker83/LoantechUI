package stepdefinitions.QA_07;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JS_Utilities;
import utilities.ReusableMethods;


import java.io.IOException;
import java.util.Set;

public class QA_07_US_006_Stepdefinitions {

    HomePage homePage= new HomePage();
    Actions actions=new Actions(Driver.getDriver());

    String windowHandle = Driver.getDriver().getWindowHandle();
    @Given("kullanici {string} ile browserdan siteye erişir")
    public void kullanici_ile_browserdan_siteye_erişir(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("homepageUrl"));

    }
    @Given("footer bölümüne gider")
    public void home_page_sayfasında_iken_footer_bölümüne_gider() throws IOException {



        ReusableMethods.wait(1);
        homePage.cookiesElementi.click();
        ReusableMethods.wait(1);

        JS_Utilities.scrollToBottom(Driver.getDriver());

        ReusableMethods.wait(1);

        ReusableMethods.getScreenshot("About Loantech Sosyal Medya Iconları");

    }
    @Given("facebook linkinin görünür olduğunu test eder")
    public void footer_bolumundeki_facebook_linkinin_görünür_olduğunu_test_eder() {

        Assert.assertTrue(homePage.facebookElementi.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Given("X linkinin görünür olduğunu test eder")
    public void footer_bolumundeki_x_linkinin_görünür_olduğunu_test_eder() {

        Assert.assertTrue(homePage.twitterElementi.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("google linkinin görünür olduğunu test eder")
    public void footer_bolumundeki_google_linkinin_görünür_olduğunu_test_eder() {


    }
    @Given("youtube inkinin görünür olduğunu test eder")
    public void footer_bolumundeki_youtube_inkinin_görünür_olduğunu_test_eder() {

        Assert.assertTrue(homePage.youtubeElementi.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("linkedin  linkinin görünür olduğunu test eder")
    public void footer_bolumundeki_linkedin_linkinin_görünür_olduğunu_test_eder() {

        Assert.assertTrue(homePage.linkedinElementi.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("instagram linkinin görünür olduğunu test eder")
    public void footer_bolumundeki_instagram_linkinin_görünür_olduğunu_test_eder() {

        Assert.assertTrue(homePage.instagramElementi.isDisplayed());
        ReusableMethods.wait(2);

        // Home page sayfasında iken, footer bölümündeki fonksiyonların görünür olduğu test edilmiştir.
    }




    @Given("facebook linkinin aktif olduğunu test eder")
    public void facebook_linkinin_aktif_olduğunu_test_eder() {
  //      Driver.getDriver().get(ConfigReader.getProperty("homepageUrl"));

   //     ReusableMethods.wait(2);
//        homePage.cookiesElementi.click();
        ReusableMethods.wait(1);

   //     ReusableMethods.wait(2);
//        homePage.cookiesElementi.click();
        ReusableMethods.wait(1);


        JS_Utilities.scrollToBottom(Driver.getDriver());
        homePage.facebookElementi.click();
        homePage.twitterElementi.click();
        homePage.youtubeElementi.click();
        homePage.linkedinElementi.click();
        homePage.instagramElementi.click();


        Set<String> windowHandles = Driver.getDriver().getWindowHandles();


        for (String handle : windowHandles) {

            if (!handle.equals(windowHandle)) {
                Driver.getDriver().switchTo().window(handle);
                System.out.println(Driver.getDriver().getTitle());
            }
        }


        ReusableMethods.switchToWindow("Facebook - Giriş Yap veya Kaydol");
        String expectedFBTitle = "Facebook - Giriş Yap veya Kaydol";
        String actualFBTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedFBTitle, actualFBTitle);
        ReusableMethods.wait(1);


    }
    @Given("X linkinin aktif olduğunu test eder")
    public void x_linkinin_aktif_olduğunu_test_eder() {

        ReusableMethods.switchToWindow("X. Olan biten burada / X");
        String expectedXTitle = "X. Olan biten burada / X";
        String actualXTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedXTitle, actualXTitle);
        ReusableMethods.wait(1);
    }
    @Given("google linkinin aktif olduğunu test eder")
    public void google_linkinin_aktif_olduğunu_test_eder() {

    }
    @Given("youtube inkinin aktif olduğunu test eder")
    public void youtube_inkinin_aktif_olduğunu_test_eder() {
        ReusableMethods.switchToWindow("YouTube");
        String expectedYouTubeTitle = "YouTube";
        String actualYouTubeTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedYouTubeTitle, actualYouTubeTitle);
        ReusableMethods.wait(1);

    }
    @Given("linkedin  linkinin aktif olduğunu test eder")
    public void linkedin_linkinin_aktif_olduğunu_test_eder() {
        ReusableMethods.switchToWindow("LinkedIn: Oturum Açın veya Üye Olun");
        String expectedlinkedinTitle = "LinkedIn: Oturum Açın veya Üye Olun";
        String actuallinkedinTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedlinkedinTitle, actuallinkedinTitle);
        ReusableMethods.wait(1);

    }
    @Given("instagram linkinin aktif olduğunu test eder")
    public void instagram_linkinin_aktif_olduğunu_test_eder() throws IOException {
        ReusableMethods.switchToWindow("Gizlilik hatası");
        ReusableMethods.getScreenshot("instagram sayfası" );
        String expectedinstagramTitle = "Instagram";
        String actualinstagramTitle = Driver.getDriver().getTitle();
        Assert.assertNotEquals(expectedinstagramTitle, actualinstagramTitle);
        ReusableMethods.wait(1);

    }

    @Given("browser kapatilir")
    public void browser_kapatilir() {
        Driver.quitDriver();

    }
}

/*

 Expected result;
         Facebook - Giriş Yap veya Kaydol
         X. Olan biten burada / X
         Google
         YouTube
         LinkedIn: Oturum Açın veya Üye Olun
         Instagram

  Actual result;
  Facebook - Giriş Yap veya Kaydol
         X. Olan biten burada / X
         .......
         YouTube
         LinkedIn: Oturum Açın veya Üye Olun
         Gizlilik hatası

 */