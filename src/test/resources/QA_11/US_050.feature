
Feature: US_050 admin olarak kullanıcılara bildirim gönderebilme

    Scenario: US_050_TC_01 Yönetici dashboard'da Notification to All linki görüntüleyebilir ve aktif olarak kullanabilir
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  username kutusuna "gecerliAdminUsername" girer
    Then  password kutusuna "gecerliAdminPassword" girer
    And   login e tiklar
    Then  acilan pencerede soldaki menude Manage Users e tiklar
    Then  acilan menude Notification to All linkine tiklanir
    Then  sayfanin acildigi dogrulanir
    And   sayfa kapatilir

    Scenario: US_050_TC_02 Admin sectigi kullanicilara bildirim gonderebilir ve gonderim onay mesaji alir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  acilan pencerede soldaki menude Manage Users e tiklar
      Then  acilan menude Notification to All linkine tiklanir
      Then  acilan sayfada Being Sent kutusuna tiklar
      Then  acilan menude Selected Users secilir
      Then  selected users kutusuna tiklanir
      Then  ilk kullaniciyi secmek icin enter tusuna basar
      Then  Subject kutusuna "test" yazilir
      Then  Message kutusuna "test" yazilir
      Then  Per Batch kutusuna bir yazilir
      Then  Cooling Period kutusuna bir yazilir
      And   submit butonuna tiklar
      Then  ekranda Done yazdigi dogrulanir
      Then  sayfa kapatilir

    Scenario: US_050_TC_03 Admin tüm kullanıcılara bildirim gönderebilir ve gonderim onay mesaji alir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  acilan pencerede soldaki menude Manage Users e tiklar
      Then  acilan menude Notification to All linkine tiklanir
      Then  Subject kutusuna "test" yazilir
      Then  Message kutusuna "test" yazilir
      Then  Start Form kutusuna bir yazilir
      Then  Per Batch kutusuna bir yazilir
      Then  Cooling Period kutusuna bir yazilir
      And   submit butonuna tiklar
      Then  ekranda Done yazdigi dogrulanir
      Then  sayfa kapatilir









