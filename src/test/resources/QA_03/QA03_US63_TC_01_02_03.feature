Feature: Admin olarak kullanicidan gelen support ticketlari yonetebilmek icin admin panelde Support Ticket menusunun olmasi



  Scenario: TC01 Admin panel side bar uzerinde Support Ticket menu basligi goruntulenmeli
    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then acilan sayfada Support Butonu oldugu dogrulanir
    And browseri kapatir.


    Scenario: TC02 Admin olarak,Support Ticket menu altinda Pending Ticket,Closed Ticket,Answered Ticked, All Ticked sayfa basliklari goruntulenmelidir.

      Given admin ilgili "adminloginUrl" sayfasina gider.
      Then  usernamekutusuna "AdminUsernameAB" girer
      Then  password kutusuna "AdminPasswordAB" girer.
      And   login e tiklar.
      Then acilan sayfada Support Butonu tiklanir.
      Then Support Ticket menu altinda Pending Ticket,Closed Ticket,Answered Ticked, All Ticked butonlari oldugu dogrulanir.
      And browseri kapatir.


  Scenario: TC03 Admin olarak
    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    Then acilan sayfada Support Butonu tiklanir.
    Then Support Ticket menu altinda Pending Ticket butonuna tiklandiginda bu sayfaya gittigi dogrulanir
    Then Support Ticket menu altinda Closed Ticket butonuna tiklandiginda bu sayfaya gittigi dogrulanir
    Then Support Ticket menu altinda Answered Ticked butonuna tiklandiginda bu sayfaya gittigi dogrulanir
    Then Support Ticket menu altinda All Ticked  butonuna tiklandiginda bu sayfaya gittigi dogrulanir
    And browseri kapatir.