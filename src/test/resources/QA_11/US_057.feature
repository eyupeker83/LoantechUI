
Feature: US_057 Withdrawals islemlerini yonetebilmek icin admin panelde Withdrawals menusunu bulunur

  Scenario: US_057_TC_01 Admin panel side bar uzerinde Withdrawals menu basligi oldugu bulunur
    Given admin ilgili "adminloginUrl" sayfasina gider
    Then  username kutusuna "gecerliAdminUsername" girer
    Then  password kutusuna "gecerliAdminPassword" girer
    And   login e tiklar
    Then  acilan sayfada Withdrawals menu basliginin goruldugu dogrulanir
    And   sayfa kapatilir

    Scenario: US_057_TC_02 Withdrawal Methods sayfa basligi bulunur ve ilgili sayfaya yonlendirme yapılabilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Withdrawal Methods sayfa basliginin oldugu dogrulanir
      Then  Withdrawal Methods linkine tiklanir
      Then  acilan sayfada Withdrawal Methods yazisi oldugu test edilir
      And   sayfa kapatilir

    Scenario: US_057_TC_03 Pending Withdrawals sayfa basligi bulunur ve ilgili sayfaya yonlendirme yapılabilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Pending Withdrawals sayfa basliginin oldugu dogrulanir
      Then  Pending Withdrawals linkine tiklanir
      Then  acilan sayfada Pending Withdrawals yazisi oldugu test edilir
      And   sayfa kapatilir

    Scenario: US_057_TC_04 Approved Withdrawals sayfa basligi bulunur ve ilgili sayfaya yonlendirme yapılabilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Approved Withdrawals sayfa basliginin oldugu dogrulanir
      Then  Approved Withdrawals linkine tiklanir
      Then  acilan sayfada Approved Withdrawals yazisi oldugu test edilir
      And   sayfa kapatilir

    Scenario:US_057_TC_05 Rejected Withdrawals sayfa basligi bulunur ve ilgili sayfaya yonlendirme yapılabilir
      Given admin ilgili "adminloginUrl" sayfasina gider
      Then  username kutusuna "gecerliAdminUsername" girer
      Then  password kutusuna "gecerliAdminPassword" girer
      And   login e tiklar
      Then  Withdrawals menu basligina tiklar
      Then  Rejected Withdrawals sayfa basliginin oldugu dogrulanir
      Then  Rejected Withdrawals linkine tiklanir
      Then  acilan sayfada Rejected Withdrawals yazisi oldugu test edilir
      And   sayfa kapatilir

      Scenario: US_57_TC_06 All withdrawals sayfa basligi bulunur ve ilgili sayfaya yonlendirme yapılabilir
        Given admin ilgili "adminloginUrl" sayfasina gider
        Then  username kutusuna "gecerliAdminUsername" girer
        Then  password kutusuna "gecerliAdminPassword" girer
        And   login e tiklar
        Then  Withdrawals menu basligina tiklar
        Then  All withdrawals sayfa basliginin oldugu dogrulanir
        Then  All withdrawals linkine tiklanir
        Then  acilan sayfada All withdrawals yazisi oldugu test edilir
        And   sayfa kapatilir

