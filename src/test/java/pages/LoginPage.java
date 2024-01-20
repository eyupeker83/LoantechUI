package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;
public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
  /*
    HER QA için 25 satirlik yer ayrilmistir.
    Aralik sayisini artirmayiniz ya da eksiltmeyiniz
    Aralik baslangic ve bitis siralarini degistirmeyiniz
    Yorum satirini asagi ya da yukari kaydirmayiniz
    Satir sayisi yetmezme ek satir talep ediniz

    Betul       25       49          Eyup       125       149         Sadik      225       249
    Kardelen    50       74          Fatih      150       174         Seref      250       274
    Adem        75       99          Kaan       175       199         Ugur       275       300
    Bilal       100      124         Mehmet     200       224
     */

    // Betül
























    // Kardelen
























    // Adem
























    // Bilal
























    // Eyüp
@FindBy(xpath = "//input[@name='username']")
    public WebElement usernameKutusu;
@FindBy(xpath = "//input[@name='password']")
    public WebElement passwordKutusu;
@FindBy(xpath = "(//*[@type='submit'])[1]")
    public WebElement loginBtn;
@FindBy(xpath = "(//*[text()='Withdraw'])[2]")public WebElement withdrawBtn;
@FindBy (tagName = "select")public WebElement select;
@FindBy(xpath = "//*[@name='amount']")public WebElement amountBox;
@FindBy(xpath = "//*[@type='submit']")public WebElement widhdrawSubmitBtn;
    @FindBy(xpath = "(//script)[10]") public WebElement widhdrawSuccsess;
@FindBy(xpath = "(//button[@type='button'])[1]") public WebElement widhdrawHistoryAccord;
@FindBy(xpath = "(//*[@class='caption'])[1]") public WebElement accordionCharge;
@FindBy(xpath = "(//*[@class='caption'])[2]") public WebElement accordionAfterCharge;
@FindBy(xpath = "(//*[@class='caption'])[3]") public WebElement accordionConversion;
@FindBy (xpath = "//a[text()=' Withdraw Money']") public WebElement withdrawMoneyBtn;
@FindBy (xpath = "//a[text()='Withdraw Log ']") public WebElement withdrawLogBtn;
@FindBy (xpath = "//a[text()='Transactions']") public WebElement transactionLink;
@FindBy (xpath = "//h3[text()='My Transactions History']") public WebElement myTransactionsHistoryElementi;
@FindBy (xpath = "//input[@name='search']") public WebElement transactionNumberSearch;
@FindBy (xpath = "//select[@name='trx_type']") public WebElement typeDdm;
@FindBy (xpath = "//select[@name='remark']") public WebElement remarkDdm;


    // Fatih
























    //Kaan
























    //Mehmet
























    // Sadık
    @FindBy(xpath = "//a[normalize-space()='Login']")
    public WebElement loginButonu;     // login> login yazi butonu
   @FindBy(xpath = "//input[@id='username']")
    public WebElement usernamebox;    // login page > username kutusu
    @FindBy(xpath = "//input[@id='password']")
    public WebElement userpasswordbox;    // login page > username pasword kutusu
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginOlmabutonu ;   // login > login giris butonu
    @FindBy(xpath = "//h5[text()='Successful Deposits']")
    public WebElement successfulDepositsYazisi;    // login page >  dashboard Succesful Deposits yazisi
    @FindBy(xpath = "//h5[text()='Successful Withdrawals']")
    public WebElement successfulWittdralwalasYazisi;    // login page  dashboard > Succesful Withdrawals yazisi
    @FindBy(xpath = "//h5[text()='Total Loan']")
    public WebElement totalLoanYazisi;    // login page >  dashboard total loan yazisi
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/p[1]/small[1]/i[1]")
    public WebElement krediAdetYazisi;    // login page >  dashboard  kredi adet  yazisi
    @FindBy(xpath = "//h3[normalize-space()='134,000.00 USD']")
    public WebElement toplamkredimiktaryazisi;    // login page >  dashboard toplam kredi miktar  yazisiyazisi
    @FindBy(xpath = "(//p[text()='Pending'])[3]")
    public WebElement pendingYazisi;    // login page > dashboard  Pending yazisi
    @FindBy(xpath = "(//p[text()='Submitted'])[1]")
    public WebElement submittedYazisi;    // login page > dashboard  Submited yazisi
    @FindBy(xpath = "(//p[text()='Rejected'])[1]") public WebElement rejectedYazisi;    // login page >  dashboard rejected yazisi
    @FindBy(xpath = "//*[@class='btn btn--base btn--xl w-100 policy']")  public WebElement cookiesElementi;
    // Şeref
























    // Uğur





















































































































}





























