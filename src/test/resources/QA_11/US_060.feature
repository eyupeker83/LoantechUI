
Feature: US_060 admin tarafindan kabul edilen withdrawals isleklerini goruntulenebildigi Approved Withdrawals testi
  @wip
  Scenario: US_060_TC_01 Admin panelde Withdrawals menu basligi altinda Approved Withdrawals sayfasına erişilebilir
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  username kutusuna "gecerliAdminUsername" girer
    Then  password kutusuna "gecerliAdminPassword" girer
    And   login e tiklar
    Then  Withdrawals menu basligina tiklar
    Then  Approved Withdrawals sayfa basliginin oldugu dogrulanir
    Then  Approved Withdrawals linkine tiklanir
    Then  acilan sayfada Approved Withdrawals yazisi oldugu test edilir
    And   sayfa kapatilir

    Scenario: US_060_TC_02 'Gateway,Initiated,'User','Amount','Conversion','Status',
                'Action' başlıkları ve altındaki bilgiler görünür durumdadır
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Approved Withdrawals linkine tiklanir
      Then  Gateway sayfa basliginin goruldugu dogrulanir
      Then  Initiated sayfa basliginin goruldugu dogrulanir
      Then  User sayfa basliginin goruldugu dogrulanir
      Then  Amount sayfa basliginin goruldugu dogrulanir
      Then  Conversion sayfa basliginin goruldugu dogrulanir
      Then  Status sayfa basliginin goruldugu dogrulanir
      Then  Action sayfa basliginin goruldugu dogrulanir
      And   sayfa kapatilir

    Scenario: US_060_TC_03 Listede Action başlığı altında 'Details' sayfasına erişilebilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Approved Withdrawals linkine tiklanir
      Then  Details linkine tiklanir
      Then  sayfanin acildigi test edilir
      And   sayfa kapatilir

    Scenario: US_060_TC_04 Approved Withdrawals tablosu uzerinde Start Date - End Date" bilgileri ile arama yapilabilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Approved Withdrawals linkine tiklanir
      Then  Start Date - End Dat kutusuna tarih girilir arama tusuna basilir
      Then  arama yapilabildigi test edilir
      And   sayfa kapatilir

  Scenario: US_060_TC_05 Approved Withdrawals tablosu uzerinde "Transaction No" bilgileri ile arama yapilabilir
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  username kutusuna "gecerliAdminUsername" girer
    Then  password kutusuna "gecerliAdminPassword" girer
    And   login e tiklar
    Then  Withdrawals menu basligina tiklar
    Then  Approved Withdrawals linkine tiklanir
    Then  Transaction No ile arama kutusuna username girilir enter tusuna basilir
    Then  arama yapilabildigi dogrulanir
    Then  sayfa kapatilir

  Scenario: US_060_TC_06 Approved Withdrawals tablosu uzerinde "Username" bilgileri ile arama yapilabilir
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  username kutusuna "gecerliAdminUsername" girer
    Then  password kutusuna "gecerliAdminPassword" girer
    And   login e tiklar
    Then  Withdrawals menu basligina tiklar
    Then  Approved Withdrawals linkine tiklanir
    Then  username ile arama kutusuna username girilir enter tusuna basilir
    Then  arama yapilabildigi dogrulanir
    And   sayfa kapatilir