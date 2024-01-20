package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminPage {
    public AdminPage() {
        PageFactory.initElements(Driver.getDriver(), this);
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


   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // Bilal


   
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 // Eyüp


    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  // Fatih


    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
   //Kaan
@FindBy(xpath = "//span[@class='menu-title'][normalize-space()='Active Users']")
public WebElement activeUsers;
@FindBy (xpath = "//input[@id='search']")
public WebElement activeUsersAramaKutusu;
@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/a[1]")
public WebElement activeUsersIlkKullanciDetails;
@FindBy (xpath = "//*[@class='la la-search']") public WebElement searchAramabutonu;
@FindBy(xpath = "//tbody/tr[1]/td[6]/div[1]/a[1]")
public WebElement banUsersIlkKullanciDetails;
@FindBy(xpath = "//button[normalize-space()='Ban User']")
public WebElement banUserElementi;
@FindBy (xpath = "//*[@name='reason']") public WebElement banAciklamaKutusuElementi;
@FindBy (xpath = "(//*[@class='btn btn--primary h-45 w-100'])[2]") public WebElement banUserAciklamaSubmitElementi;
@FindBy(xpath = "//p[@class='iziToast-message slideIn']") public WebElement banOnayMesajiElementi;
@FindBy(xpath = "(//span[@class=\"menu-title\"])[4]")
public WebElement bannedUsersElementi;
@FindBy (xpath = "//tbody/tr[1]/td[1]") public WebElement banIlkUser;
@FindBy (xpath = "//span[@class='badge badge--danger']") public WebElement bannedUyariYazisi;
@FindBy(xpath = "//span[@class='navbar-user__name']") public WebElement adminIsimButonu;
@FindBy(xpath = "//span[normalize-space()='Logout']") public WebElement adminLogoutButonu;

   
  
  
  //Mehmet


    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 // Sadık
    @FindBy(xpath = "//input[@id='username']")
    public WebElement adminnamebox;     // Adminpage > admin name box
    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordbox;     // Adminpage > admin password kutusu
    @FindBy(xpath = "//button[text()='LOGIN']")
    public WebElement loginboxadmin;     // Adminpage > admin login kutusu
    @FindBy(xpath = "//span[text()='Loans']")
    public WebElement loansMenu;     // Adminpage > loan menü
    @FindBy(xpath = "//span[text()='Pending Loans']")
    public WebElement pendingLoan;     // Adminpage > loan menü > pending loan
    @FindBy(xpath = "//span[text()='Running Loans']")
    public WebElement runningLoan;     // Adminpage > loan menü > running Loan
    @FindBy(xpath = "//span[text()='Due Loans']")
    public WebElement dueLoan;     // Adminpage > loan menü > due Loan
    @FindBy(xpath = "//span[text()='Paid Loans']")
    public WebElement paidLoan;     // Adminpage > loan menü > paid Loan
    @FindBy(xpath = "//span[text()='Rejected Loans']")
    public WebElement rejectedLoan;     // Adminpage > loan menü > rejected Loan


   
  
  
  
  // Şeref-1
    @FindBy(xpath = "//button[text()='LOGIN']")
    public WebElement adminLoginButtonElemnenti;
    @FindBy(xpath = "(//*[@class=\"item-link\"])[1]")
    public WebElement adminTotalUsersButtonu;
    @FindBy(xpath = "(//*[@class=\"item-link\"])[2]")
    public WebElement adminActiveUsersButtonu;
    @FindBy(xpath = "(//*[@class=\"item-link\"])[3]")
    public WebElement adminEmailUnverifiedUsersButtonu;
    @FindBy(xpath = "(//*[@class=\"item-link\"])[4]")
    public WebElement adminMobileUnverifiedUsersButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[1]")
    public WebElement adminRunningLoanButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[2]")
    public WebElement adminPendingLoanButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[3]")
    public WebElement adminDueLoanButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[4]")
    public WebElement adminPaidLoanButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[5]")
    public WebElement adminTotalDepositedButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[6]")
    public WebElement adminPendingDepositsButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[7]")
    public WebElement adminRejectedDepositsButtonu;
    // Uğur
    @FindBy(xpath = "//input[@name='username']")
    public WebElement adminUsernameKutusu;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordKutusu;
    @FindBy(xpath = "//*[@*='btn cmn-btn w-100']")
    public WebElement loginButton;
    @FindBy(xpath = "//*[text()='Manage Users']")
    public WebElement manageUsers;
    @FindBy(xpath = "//*[text()='Notification to All']")
    public WebElement notificationToAll;
    @FindBy(xpath = "//h6[text()='Notification to Verified Users']")
    public WebElement notificationToAllSayfaTest;
    @FindBy(xpath = "//select[@name='being_sent_to']")
    public WebElement beingsentKutusu;
    @FindBy(xpath = "//*[text()='Selected Users']")
    public WebElement selectedUsersMenuSecenek;
    @FindBy(xpath = "//*[@*='combobox']")
    public WebElement selectusersKutusu;
    @FindBy(xpath = "//*[@*='Email subject']")
    public WebElement subjectKutusu;
    @FindBy(xpath = "//*[@*='width: 913px; margin: 4px; min-height: 223px; overflow: hidden;']")
    public WebElement messageKutusu;
    @FindBy(xpath = "//input[@id='batch']")
    public WebElement perBatchKutusu;
    @FindBy(xpath = "//input[@id='cooling_time']")
    public WebElement coolingPeriodKutusu;
    @FindBy(xpath = "//input[@id='start_form']")
    public WebElement startFormKutusu;
    @FindBy(xpath = "//*[@*='btn w-100 h-45 btn--primary me-2']")
    public WebElement notifcationSubmitButton;
    @FindBy(xpath = "//*[@*='mail-icon text--success fw-bold text-center']")
    public WebElement notificationDoneYazisi;
    @FindBy(xpath = "//input[@aria-controls='select2-user_list-results']")
    public WebElement selectUserKutusu2;
    @FindBy(xpath = "//*[@*='How many user']")
    public WebElement perBatch;
    @FindBy(xpath = "//*[@*='btn btn--danger stopSending']")
    public WebElement stopButton;
    @FindBy(xpath = "//span[text()='Withdrawals ']")
    public WebElement withdrawalsMenu;
    @FindBy(xpath = "//span[text()='Withdrawal Methods']")
    public WebElement withdrawalsMethodsMenu;
    @FindBy(xpath = "//span[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawalsMenu;
    @FindBy(xpath = "//span[text()='Approved Withdrawals']")
    public WebElement approvedWithdrawalsMenu;
    @FindBy(xpath = "//span[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawalsMenu;
    @FindBy(xpath = "//span[text()='All Withdrawals']")
    public WebElement allWithdrawalsMenu;
    @FindBy(xpath = "//h6[text()='Withdrawal Methods']")
    public WebElement withdrawalMethodsText;
    @FindBy(xpath = "//h6[text()='Pending Withdrawals']")
    public WebElement pendingWithdrawalsText;
    @FindBy(xpath = "//h6[text()='Approved Withdrawals']")
    public WebElement approvedWithdrawalsText;
    @FindBy(xpath = "//h6[text()='Rejected Withdrawals']")
    public WebElement rejectedWithdrawalsText;
    @FindBy(xpath = "//h6[text()='Withdrawals Log']")
    public WebElement allWithdrawalsText;
    @FindBy(xpath = "//*[@id='sidebar__menuWrapper']")
    public WebElement sideBar;
    @FindBy(xpath = "//th[text()='Gateway | Transaction']")
    public WebElement getewayBaslik;
    @FindBy(xpath = "//th[text()='Initiated']")
    public WebElement initiatedBaslik;
    @FindBy(xpath = "//th[text()='User']")
    public WebElement userBaslik;
    @FindBy(xpath = "//th[text()='Amount']")
    public WebElement amountBaslik;
    @FindBy(xpath = "//th[text()='Conversion']")
    public WebElement conversionBaslik;
    @FindBy(xpath = "//th[text()='Status']")
    public WebElement statusBaslik;
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement actionBaslik;
    @FindBy(xpath = "(//i[@class='la la-desktop'])[1]")
    public WebElement detailsButton;
    @FindBy(xpath = "//*[text()='User Withdraw Information']")
    public WebElement detailsSayfaTest;
    @FindBy(xpath = "//*[@*='Start Date - End Date']")
    public WebElement dateKutusu;
    @FindBy(xpath = "//*[@*='datepicker--cell datepicker--cell-day -weekend- -range-from- -selected-']")
    public WebElement startDay;
    @FindBy(xpath = "//*[@*='datepicker--cell datepicker--cell-day -range-to-']")
    public WebElement endDay;
    @FindBy(xpath = "(//i[@class='la la-search'])[2]")
    public WebElement searcheTwo;
    @FindBy(xpath = "(//i[@class='la la-search'])[1]")
    public WebElement searcheOne;
    @FindBy(xpath = "(//span[@class='fw-bold'])[2]")
    public WebElement approvedAramaSonuc;
    @FindBy(xpath = "//input[@class='form-control bg--white']")
    public WebElement transactionAramaKutusu;


   
  
 
  // Sadık 2>>>
    @FindBy(xpath = "//span[text()='All Loans']")
    public WebElement allLoan;     // Adminpage > loan menü > all Loan
    @FindBy(xpath = "//h6[normalize-space()='Pending Loans']")
    public WebElement pendingLoanbasligi;     // Adminpage > loan menü > pendin loan > pendingLoanbasligi
    @FindBy(xpath = "//h6[text()='Running Loans']")
    public WebElement runningLoanbasligi;     // Adminpage > loan menü > pendin loan > running Loanbasligi
    @FindBy(xpath = "//h6[text()='Due Installment Loans']")
    public WebElement dueLoanbasligi;     // Adminpage > loan menü > pendin loan > due Loan basligi
    @FindBy(xpath = "//h6[text()='Paid Loans']")
    public WebElement paidLoanbasligi;     // Adminpage > loan menü > paid loan > paid Loan basligi
    @FindBy(xpath = "//h6[text()='Rejected Loans']")
    public WebElement rejectedLoanbasligi;     // Adminpage > loan menü > paid loan > rejected Loan basligi
    @FindBy(xpath = "//h6[text()='All Loans']")
    public WebElement allLoanbasligi;     // Adminpage > loan menü > paid loan > rejected Loan basligi
    @FindBy(xpath = "//span[text()='Manage Users']")
    public WebElement manageUsersLinki;     // Adminpage >manage Users Linki
    @FindBy(xpath = "//span[text()='Active Users']")
    public WebElement activeUsersLinki;     // Adminpage >manage Users> activeUsersLinki
    @FindBy(xpath = "//h6[text()='Active Users']")
    public WebElement activeUserListesi;     // Adminpage >manage Users> activeUsersLinki
    @FindBy(xpath = "//th[text()='User']")
    public WebElement activeUserUSerbasligi;     // Adminpage >manage Users> active Users başlığı
    @FindBy(xpath = "//th[text()='Email-Phone']")
    public WebElement activeUserEmailbasligi;     // Adminpage >manage Users> active Email başlığı
    @FindBy(xpath = "//th[text()='Country']")
    public WebElement activeUserCountrybasligi;     // Adminpage >manage Users> active Users başlığı
    @FindBy(xpath = "//th[text()='Joined At']")
    public WebElement activeUserJoinedAtbasligi;     // Adminpage >manage Users> Joined At Users başlığı
    @FindBy(xpath = "//th[text()='Balance']")
    public WebElement activeUserBalancebasligi;     // Adminpage >manage Users> activeUser Balance basligi
    @FindBy(xpath = "//th[text()='Action']")
    public WebElement activeUserActionbasligi;     // Adminpage >manage Users> activeUser Balance basligi
    @FindBy(xpath = "//a[normalize-space()='Details']")
    public WebElement details;     // Adminpage >manage Users> activeUser details
    @FindBy(xpath = "//a[normalize-space()='Logins']")
    public WebElement detailsLoginButonu;     // Adminpage >manage Users> activeUser details Login Butonu
    @FindBy(xpath = "//h6[text()='User Login History']")
    public WebElement detailsloginHistorysayfasi;     // Adminpage >manage Users> activeUser details > detailsloginHistorysayfasi
    @FindBy(xpath = "//tbody")
    public WebElement detailsloginHistoryListesi;     // Adminpage >manage Users> activeUser details > detailsloginHistory Listesi


    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
  
  //Adem
    @FindBy(xpath = "//input[@name='username']")
    public WebElement adminUsernameKutusuAB;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordKutusuAB;
    @FindBy(xpath = "//*[@*='btn cmn-btn w-100']")
    public WebElement loginButtonAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[24]")
    public WebElement depositButtonAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[25]")
    public WebElement pendingDepositAB;
    @FindBy(xpath = "//th[normalize-space()='Amount']")
    public WebElement amountTextAB;
    @FindBy(xpath = "//th[normalize-space()='Conversion']")
    public WebElement conversionTextAB;
    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary ms-1']")
    public WebElement detailsButtonAB;
    @FindBy(xpath = "//button[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement approveButtonAB;
    @FindBy(xpath = "//button[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement rejectButtonAB;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement rejectAllertTextAB;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement rejectSubmitButtonAB;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement rejectVeriyfyAB;
    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement approveAlertYesAB;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement approveVeriyfyAB;
    @FindBy(xpath = "//span[normalize-space()='Support Ticket']")
    public WebElement supportTicketButtonAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[38]")
    public WebElement supportPendingTicketAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[39]")
    public WebElement supportClosedTicketAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[40]")
    public WebElement sopportAsweredTAB;
    @FindBy(xpath = "(//span[@class='menu-title'])[41]")
    public WebElement sopportAllTicketAB;
    @FindBy(xpath = "//*[text()='Pending Tickets']")
    public WebElement pendingTicketsTextAB;
    @FindBy(xpath = "//*[text()='Closed Tickets']")
    public WebElement closedTicketsTextAB;
    @FindBy(xpath = "//*[text()='Answered Tickets']")
    public WebElement answeredTicketsTextAB;
    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement allTicketTextSupportedAB;
    @FindBy(xpath = "//*[text()='Subject']")
    public WebElement pendingSubjectTitleAB;
    @FindBy(xpath = "//*[text()='Submitted By']")
    public WebElement pendingSubmittedByTitleAB;
    @FindBy(xpath = "//*[text()='Status']")
    public WebElement pendingStatusTitleAB;
    @FindBy(xpath = "//*[text()='Priority']")
    public WebElement pendingPriorityTitleAB;
    @FindBy(xpath = "//*[text()='Last Reply']")
    public WebElement pendingLastReplyTitleAB;
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement pendingActionTitleAB;
    @FindBy(xpath = "//button[@class='btn btn--danger btn-sm']")
    public WebElement detCloseTicketButtonAB;
    @FindBy(xpath = "//button[@name='replayTicket']")
    public WebElement detReplyButtonAB;
    @FindBy(xpath = "//button[@class='btn btn-danger btn-sm my-3 confirmationBtn']")
    public WebElement detDeleteButtonAB;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement closedYesButtonAB;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement closedAllertAB;
    @FindBy(xpath = "(//button[@type='submit'])[3]")
    public WebElement deleteYesButonuAB;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement deleteAllertAB;
    @FindBy(xpath = "//textarea[@name='message']")
    public WebElement replyTextAB;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement replyAllertAB;



   



  
  
  





























































   // Şeref-2
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[8]")
    public WebElement adminDepositedChargeButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[9]")
    public WebElement adminTotalWithdrawnButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[10]")
    public WebElement adminPendingWithdrawalsButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[11]")
    public WebElement adminRejectedWithdrawalsButtonu;
    @FindBy(xpath = "(//*[@class='widget-two box--shadow2 b-radius--5 bg--white'])[12]")
    public WebElement adminWithdrawalChargeButtonu;

    //Admin Dashboarddaki "Total Users" gibi başlıkların sağındaki "Wiew All" bıttonları
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--primary'])[1]")
    public WebElement adminRunningLoanWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--warning'])[1]")
    public WebElement adminPendingLoanWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--danger'])[1]")
    public WebElement adminDueLoanWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--success'])[1]")
    public WebElement adminPaidLoanWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--success'])[2]")
    public WebElement adminTotalDepositedWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--warning'])[2]")
    public WebElement adminPendingDepositsWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--danger'])[2]")
    public WebElement adminRejectedDepositsWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--primary'])[2]")
    public WebElement adminDepositedChargeWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--success'])[3]")
    public WebElement adminTotalWithdrawnWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--warning'])[3]")
    public WebElement adminPendingWithdrawalsWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--danger'])[3]")
    public WebElement adminRejectedWithdrawalsWiewAllButtonu;
    @FindBy(xpath = "(//*[@class='widget-two__btn btn btn-outline--primary'])[3]")
    public WebElement adminWithdrawalChargeWiewAllButtonu;

    @FindBy(xpath = "(//*[@class='card-title'])[1]")
    public WebElement adminMonthlyDepositEgrisi;
    @FindBy(xpath = "(//*[@class='card-title'])[2]")
    public WebElement adminTransactionsReportEgrisi;
    @FindBy(xpath = "(//*[@class='card-title'])[3]")
    public WebElement adminLoginByBrowserPastasi;
    @FindBy(xpath = "(//*[@class='card-title'])[4]")
    public WebElement adminLoginByOSPastasi;
    @FindBy(xpath = "(//*[@class='card-title'])[5]")
    public WebElement adminLoginByCountryPastasi;



}
