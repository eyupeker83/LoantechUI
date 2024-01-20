package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import javax.xml.xpath.XPath;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
/*
   HER QA için 25 satirlik yer ayrilmistir.
    Aralik sayisini artirmayiniz ya da eksiltmeyiniz
    Aralik baslangic ve bitis siralarini degistirmeyiniz
    Yorum satirini asagi ya da yukari kaydirmayiniz
    Satir sayisi yetmezme ek satir talep ediniz
    satir--> baslangiç  bitis                  baslangiç  bitis                baslangiç  bitis
    Betul       25       49          Eyup       125       149         Sadik      225       249
    Kardelen    50       74          Fatih      150       174         Seref      250       274
    Adem        75       99          Kaan       175       199         Ugur       275       300
    Bilal       100      124         Mehmet     200       224         Seref      325       349
     */
    // Betül
























    // Kardelen
























    // Adem
























    // Bilal
























    // Eyüp
@FindBy(xpath = "(//*[text()='About'])[1]") public WebElement aboutUstMenu;
@FindBy(xpath = "(//*[text()='About'])[2]") public WebElement aboutFooter;
@FindBy(xpath = "//h2[text()='Fulfilling Financial Dreams']") public WebElement fulfillingFDYazi;
@FindBy(xpath = "//*[text()='Home                            ']") public WebElement aboutHomeLink;
@FindBy (xpath = "//span[text()='About']") public WebElement aboutAboutLink;
@FindBy(xpath = "//*[text()='Contact']") public WebElement contactUst;
@FindBy(xpath = "(//ul/li/a)[14]") public WebElement contactUsFooter;
    @FindBy(tagName = "iframe") public WebElement iframe;
    @FindBy(xpath = "(//*[@class='mb-0'])[1]") public WebElement contactAdressElementi;
    @FindBy(xpath = "(//*[@class='mb-0'])[2]") public WebElement contactEmailElementi;
    @FindBy(xpath = "(//*[@class='mb-0'])[3]") public WebElement contactMobileElementi;
    @FindBy(xpath = "//*[@name='name']") public WebElement contactYourNameBox;
    @FindBy(xpath ="(//*[@name='email'])[1]") public WebElement contactEmailBox;
    @FindBy(xpath = "//*[@name='subject']") public WebElement contactSubjectBox;
    @FindBy(xpath = "//*[@name='message']") public WebElement contactMessageBox;
    @FindBy(xpath = "(//*[@type='submit'])[1]")public WebElement contactSendMessage;








    // Fatih
























    //Kaan

//@FindBy(xpath = "//*[h4='About Loantech']")
@FindBy(xpath = "//*[@class='mb-0 t-text-white text-center text-capitalize']")
    public WebElement aboutLoantechElementi;
@FindBy(xpath = "//*[@class='fab fa-facebook']")
    public WebElement facebookElementi;
@FindBy(xpath = "//*[@class='fab fa-twitter']")
    public WebElement twitterElementi;
@FindBy(xpath = "//*[@class='fab fa-instagram']")
    public WebElement instagramElementi;
@FindBy(xpath = "//*[@class='fab fa-youtube']")
    public WebElement youtubeElementi;
@FindBy(xpath = "//*[@class='fab fa-linkedin']")
    public WebElement linkedinElementi;
@FindBy(xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement cookiesElementi;








    //Mehmet
























    // Sadık
    @FindBy(xpath = "//a[text()='Plans']")
    public WebElement plansElementi;     // Homepage > header > Plans linki
    @FindBy(xpath = "//h2[normalize-space()='Loan Plans']")
    public WebElement loansPlanyaziElementi;    // Loan plans page > loan plans yazisi
    @FindBy(xpath = "//a[normalize-space()='Loan Plans']")
    public WebElement loansPlanlinkElementi;   // Homepage > footer > Loan plans linki
    @FindBy(xpath = "//button[@id='pills-basic-loan-tab']")
    public WebElement basicLoanbutonElementi;     // Homepage > plans > Basic Plan
    @FindBy(xpath = " //h4[text()='Basic Loan 1']")
    public WebElement basicLoanKartElementi;     // Homepage > plans > Basic Plan > kartlar
    @FindBy(xpath = "//button[@data-planname='Basic Loan 1']")
    public WebElement applyNowButonElementi;     // Homepage > plans > Basic Plan > kartlar
    @FindBy(xpath = "//a[@class='t-link breadcrumbs__link text-uppercase t-text-white t-link--primary']")
    public WebElement homeLinkiLoansplandaki;     // Homepage > plans > home linki
    @FindBy(xpath = "//span[contains(@class,'t-link breadcrumbs__link text-uppercase t-text-white t-link--primary')]")
    public WebElement LoanPlansLinkiLoansplandaki;     // Homepage > plans > Loanplans linki
    @FindBy(xpath = " //a[normalize-space()='Get Started']")
    public WebElement getStartedbutonuhomeda;     // Homepage > get started
    @FindBy(xpath = "//h1[contains(text(),'One Loan at a Time: Your Trusted Partner in Financ')]")
    public WebElement homepageTitle;     // Homepage > homepageTitle




    // Şeref
    @FindBy (xpath = "(//*[@class='mb-0 vf-info-list__text'])[1]")
            public WebElement emailMenusuYaziElementi;
    @FindBy (xpath = "//*[@class='mb-0 fw-md vf-info-list__text']")
            public WebElement telefonMenusuYaziElementi;
    @FindBy (xpath = "(//*[@class='mb-0 vf-info-list__text'])[2]")
            public WebElement adresMenusuYaziElementi;
    @FindBy (xpath = "//*[@class='navbar navbar-expand-lg navbar-light']")
            public WebElement menuCubuguElementi;
        @FindBy (xpath = "//*[@class='img-fluid logo__is']")
            public WebElement logoButtonElementi;
    @FindBy (xpath = "(//*[@class='nav-link active'])[1]")
            public WebElement homeButtonElementi;
    @FindBy (xpath = "//*[@class=' nav-link']")
            public WebElement aboutButtonElementi;
    @FindBy (xpath = "(//a[@class='nav-link '])[1]")
            public WebElement plansButtonElementi;
    @FindBy (xpath = "(//a[@class='nav-link '])[2]")
            public WebElement blogsButtonElementi;
    @FindBy (xpath = "(//a[@class='nav-link '])[3]")
            public WebElement contactButtonElementi;
    @FindBy (xpath = "(//a[@class='btn btn--md btn--base fw-bold w-100'])[2]")
            public WebElement loginButtonElementi;
    @FindBy (xpath = "//*[@class='btn btn--xl xl-text btn--base btn--outline mt-3']")
            public WebElement getStartedButtonElementi;



















    // Uğur






























    // Şeref
    @FindBy (xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
        public WebElement cookiesKabulButonu;



















}
