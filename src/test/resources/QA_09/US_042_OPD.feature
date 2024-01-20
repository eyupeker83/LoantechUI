Feature: US_042_OPD admin secilen aktif kullanicinin login bilgilerini görebilmeli


  Scenario: TC_01 dashboard sayfasinda manage users , active users , details , Logins ve user login history sayfalarini görüntüleme testi

    Given  belirlenen site "adminloginUrl" i ile browserdan admin siteye erisilir .
    Then açılan admin login sayfasinda username kutusuna gecerli bir "adminnameQA9" kullanici adi  girilir .
    And admin login sayfasinda password kutusuna "adminpasswordQA9" girilir .
    And giris yapabilmek icin login butonuna tiklanir .
    Then dashboard sayfasında bulunan Nawbar'da Manage Users linki basligina tiklanir ve aktif oldugu dogrulanır .
    Then manage Users linki altinda Active Users linki tiklanir ve aktif oldugu dogrulanır .
    And  active Users Listesinin görüntülendigi dogrulanır .
    And  active Users Listesinde  User liste basligi görüntülendigi dogrulanır .
    And  active Users Listesinde  Email- phone liste basligi görüntülendigi dogrulanır .
    And  active Users Listesinde  Country liste basligi görüntülendigi dogrulanır .
    And  active Users Listesinde  Joined At liste basligi görüntülendigi dogrulanır .
    And  active Users Listesinde  Balance liste basligi görüntülendigi dogrulanır .
    And  active Users Listesinde  Action liste basligi görüntülendigi dogrulanır .
    Then active Users  sayfasinda  Details butonu görüntülendigi dogrulanir .
    Then active Users  sayfasinda  Details butonu tiklanir .
    And user Detail sayfasinda Logins butonu görüntülenir .
    Then user Detail sayfasinda Logins butonunun aktif oldugu dogrulanir .
    And Logins butonuna tiklanir .
    Then User Login History sayfasina ulasılabildigi dogrulanir .
    Then user Login History sayfasinda kullanicinin giris bilgilerinin oldugu liste görüntülenir.
    And browser kapatilir .


  Scenario: TC_02 dashboard sayfasinda  user login history sayfalsinda giris bilgilerini görüntüleme testi

     Given  belirlenen site "adminloginUrl" i ile browserdan admin siteye erisilir .
     Then açılan admin login sayfasinda username kutusuna gecerli bir "adminnameQA9" kullanici adi  girilir .
     And admin login sayfasinda password kutusuna "adminpasswordQA9" girilir .
     And giris yapabilmek icin login butonuna tiklanir .
      Then dashboard sayfasında bulunan Nawbar'da Manage Users linki basligina tiklanir .
      Then manage Users linki altinda Active Users linki tiklanir  .
      Then active Users  sayfasinda  Details butonu tiklanir
      And  Logins butonuna tiklanirr .
     Then user Login History sayfasina ulaşılabildiği doğrulanir .
     Then user Login History sayfasinda kullanicinin giriş bilgilerinin oldugu listenin görüntülendigi dogrulanir.
      And browser kapatilir .