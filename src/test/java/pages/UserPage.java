package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class UserPage {
    public UserPage(){
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
    Bilal       100      124         Mehmet     200       224
     */



    // Betül
























    // Kardelen






















    // Adem

    @FindBy (xpath ="(//h4[@class='mt-0 t-text-white text-capitalize'])[4]")
    public WebElement newsletterElementAB;

    @FindBy (xpath = "//input[@id='email']")
    public WebElement newsletterEmailElmentAB;
    @FindBy (xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement cookiesElementAB;
    @FindBy (xpath ="//i[@class='bx bxs-paper-plane']")
    public WebElement emailSendButtonAB;
    @FindBy (xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement alertTextAB;










    // Bilal
























    // Eyüp
























    // Fatih
























    //Kaan
























    //Mehmet
























    // Sadık






















    // Şeref
    @FindBy(xpath = "(//*[@class='mb-0 vf-info-list__text'])[1]")
    public WebElement emailMenusuYaziElementi;
    @FindBy (xpath = "(//*[@class='mb-0 vf-info-list__text'])[2]")
    public WebElement adresMenusuYaziElementi;
    @FindBy (xpath = "//*[@class='mb-0 fw-md vf-info-list__text']")
    public WebElement telefonMenusuYaziElementi;
    @FindBy (xpath = "//*[@class='img-fluid logo__is']")
    public WebElement logoButtonElementi;
    @FindBy (xpath = "//*[@class='nav-link active']")
    public WebElement homeButtonElementi;
    @FindBy (xpath = "//*[@class=' nav-link']")
    public WebElement aboutButtonElementi;
    @FindBy (xpath = "(//*[@class='nav-link '])[2]")
    public WebElement plansButtonElementi;
    @FindBy (xpath = "(//*[@class='nav-link '])[2]")
    public WebElement blogsButtonElementi;
    @FindBy (xpath = "(//*[@class='nav-link '])[3]")
    public WebElement contactButtonElementi;
    @FindBy (xpath = "(//a[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement loginButtonElementi;
    @FindBy (xpath = "//*[@class='btn btn--xl xl-text btn--base btn--outline mt-3']")
    public WebElement getStartedButtonElementi;
    @FindBy (xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement cookiesKabulButonu;























    // Uğur

























}
