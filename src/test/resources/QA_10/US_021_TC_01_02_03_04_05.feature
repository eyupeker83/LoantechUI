Feature: QA_10_US021 Kullanıcı Olarak Ana Sayfa Üst Barındaki Menü Başlıklarına Erişim.


  Scenario: TC01 "https://qa.loantechexper.com/user/login" sitesine erişim kontrolu

    Given Kullanici "userloginUrl" anasayfaya gider.
    When Kullanici web sitesine erişebildiğini test eder.
    Then Kullanici web sitesinde anasayfanın görünür olduğu doğrulanır.
    And Browser kapatilir.

  @wip
  Scenario: TC02 Site üst barındaki email, adres ve telefon menusu kontrolu

    Given Kullanici "userloginUrl" anasayfaya gider.
    And Kullanici Anasayfa üst barında email bilgilerinin bulunduğu test edilir.
    And Kullanici Anasayfa üst barında adres bilgilerinin bulunduğu test edilir.
    And Kullanici Anasayfa üst barında telefon bilgilerinin bulunduğu test edilir.
    Then Browser kapatilir.

  @wip
  Scenario: TC03 Menu çubuğundaki Logo, Home, About, Plans, Blogs, Contac ve Login ile anasayfadaki Get Started iconu kontrolu

    Given Kullanici "userloginUrl" anasayfaya gider.
    And Kullanici Menu cubugundaki Logo iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki Home iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki About iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki Plans iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki Blogs iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki Contact iconunun bulunduğu test edilir.
    And Kullanici Menu cubugundaki Login iconunun bulunduğu test edilir.
    And Kullanici Anasayfada Get Started iconunun bulunduğu test edilir.
    Then Browser kapatilir.


  @wip
  Scenario: TC04 Logo'ya tıklandığında anasayfaya geçiş testi.

    Given Kullanici "userloginUrl" anasayfaya gider.
    And Kullanici Menu cubugundaki Logo iconu tıklanır.
    And Kullanici Sitenin anasayfasına geçiş yapıldığı test edilir.
    Then Browser kapatilir.

  @wip
  Scenario: TC05 Menu çubuğundaki Logo, Home, About, Plans, Blogs, Contac ve Login ile anasayfadaki Get Started iconlarının aktiflik kontrolu

    Given Kullanici "userloginUrl" anasayfaya gider.
    And Kullanici Menu cubugundaki Logo iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki Home iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki About iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki Plans iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki Blogs iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki Contact iconunun aktif olduğu test edilir.
    And Kullanici Menu cubugundaki Login iconunun aktif olduğu test edilir.
    And Kullanici Anasayfada Get Started iconunun aktif olduğu test edilir.

    Then Browser kapatilir.