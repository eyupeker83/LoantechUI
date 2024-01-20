Feature: Bir yonetici (admin) olarak bekleyen deposit isteklerini yonetebilmek icin Pending Deposit sayfasinin olmasi.


  Scenario: TC_01 Dogru Username ve Password girilerek  siteye Admin olarak giris yapilabilme
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer
    And   login e tiklar.
    Then acilan sayfanin Admin sayfasi oldugu dogrulanir
    And browseri kapatir.

  Scenario: TC_02 Admin olarak Deposits menu basligi altindaki "Pending Deposits" sayfa linkine tiklandiginda "admin/deposit/pending" sayfasina erisilmeli
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer
    And   login e tiklar.
    And Deposits linkine Tiklanir.
    Then Pending Deposits linkine tiklanir.
    Then Acilan sayfanin admin,deposit,pending sayfasi dogru bilgiler icerdigi dogrulanir.
    And browseri kapatir.


  Scenario: TC_03 Admin olarak girildiginde Deposit, Pending Deposit, Details butonu görünür ve aktif olmalı
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer
    And   login e tiklar.
    And Deposits linkine Tiklanir.
    Then Pending Deposits linkine tiklanir.
    Then Acilan sayfanin Details Butonu icerdigi dogrulanir.
    And browseri kapatir.

  Scenario: TC_04 Admin olarak, Deposit Butonuna tiklanidiginda 'Approve/Reject' butonları görünür ve aktif olmalı onaylandığında ya da reddedildiğinde uyarı mesajı görülmeli ve Pending Deposits
  listesinden  kaldırıldığı görüntülenmeli.
    Given admin ilgili "adminloginUrl" sayfasina gider.
    Then  usernamekutusuna "AdminUsernameAB" girer
    Then  password kutusuna "AdminPasswordAB" girer.
    And   login e tiklar.
    And Deposits linkine Tiklanir.
    Then Pending Deposits linkine tiklanir.
    Then Acilan sayfanin Details Butonu tiklanir.
    Then Approve ve Reject butonlarinin görünür oldugu dogrulanir.
    And Reject Butonuna tiklayinca cikan Alerte aciklama yazilir ve submit butonuna basilir.
    And Reject ile Pending Deposits listesinden kaldirildigi dogrulanir.
    Then Pending Deposits linkine tiklanir.
    Then Acilan sayfanin Details Butonu tiklanir.
    And Approve Butonuna tiklayinca cikan Are you sure to approve this transaction? sorulu  Alert yes butonuna basilir.
    Then Aprove Pending Deposits listesinden kaldirildigi dogrulanir.
    And browseri kapatir.