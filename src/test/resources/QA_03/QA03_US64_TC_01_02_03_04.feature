Feature: US064 Admin olarak islem bekleyen support ticketlari yonetebilmek icin Pending Ticket sayfasinin olmasin


  Scenario: TC_01 Admin panelde side bar uzerinde Support Ticket menu basligi altinda Pending Tickets sayfasına erişilebilmeli

    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then  acilan sayfada Support Butonu tiklanir.
    Then  Support Ticket menu altinda Pending Ticket butonuna tiklandiginda bu sayfaya gittigi dogrulanir
    And   browseri kapatir.


  Scenario: TC_02 Admin olarak,Pending Tickets sayfasinda 'Subject,Submitted By,Status Priority,Last Reply,Action' bilgileri görünür olmalıdır.
    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then  acilan sayfada Support Butonu tiklanir.
    Then  Support Ticket menu altinda Pending Ticket butonuna tiklanir.
    And   Acilan sayfada Subject,Submitted By,Status Priority,Last Reply,Action' bilgileri görünür oldugu dogrulanir.
    And   browseri kapatir.


  Scenario:TC_03 Admin olarak,Pending Tickets Action başlığı altında 'Details' sayfasına erişilmeli.
    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then  acilan sayfada Support Butonu tiklanir.
    Then  Support Ticket menu altinda Pending Ticket butonuna tiklanir.
    And   Acilan sayfada Action Titleinin altinda bulunan Details butonuna tiklanir.
    Then  Acilan sayfada Close Ticket, Reply,Delete butonlari oldugu dogrulanir.
    And   browseri kapatir.



  @wipab
  Scenario: TC_04 Admin olarak,details sayfasında seçilen ticket üzerinde işlem( kapatılabilir,cevaplanabilir,silinebilir) yapılabilmelidir.

    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then  acilan sayfada Support Butonu tiklanir.
    Then  Support Ticket menu altinda Pending Ticket butonuna tiklanir.
    And   Acilan sayfada Action Titleinin altinda bulunan Details butonuna tiklanir.
    Then  Close butonuna tiklanip allert kabul edildiginde Supported ticket closed succesfully yazisi göründügü dogrulanir.
    Then  Metin Kutusuna cevap yazilip Reply butonuna tiklandiginda Support Ticket Replyed successfully yazisi ciktigi dogrulanir.
    And   Delete butonuna tiklanip Alert kabul edildiginde Support Ticket Deleted successfully ciktigi dogrulanir.
    And   browseri kapatir.