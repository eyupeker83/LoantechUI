Feature: QA_10_US002 Ana Sayfa Üst Barında Menü Başlıklarına Erişim.

  @wip
  Scenario: TC01 Site üst barındaki email, adres ve telefon menusu kontrolu

    Given Ziyaretçi "homepageUrl" anasayfaya gider.
    And Anasayfa üst barında email bilgilerinin bulunduğu test edilir.
    And Anasayfa üst barında adres bilgilerinin bulunduğu test edilir.
    And Anasayfa üst barında telefon bilgilerinin bulunduğu test edilir.
    Then Browser kapatilir.

  @wip
  Scenario: TC02 Menu çubuğundaki Logo, Home, About, Plans, Blogs, Contac ve Login ile anasayfadaki Get Started iconu kontrolu

    Given Ziyaretçi "homepageUrl" anasayfaya gider.
    And Menu cubugundaki Logo iconunun bulunduğu test edilir.
    And Menu cubugundaki Home iconunun bulunduğu test edilir.
    And Menu cubugundaki About iconunun bulunduğu test edilir.
    And Menu cubugundaki Plans iconunun bulunduğu test edilir.
    And Menu cubugundaki Blogs iconunun bulunduğu test edilir.
    And Menu cubugundaki Contact iconunun bulunduğu test edilir.
    And Menu cubugundaki Login iconunun bulunduğu test edilir.
    And Anasayfada Get Started iconunun bulunduğu test edilir.
    Then Browser kapatilir.


  @wip
  Scenario: TC03 Logo'ya tıklandığında anasayfaya geçiş testi.

    Given Ziyaretçi "homepageUrl" anasayfaya gider.
    And Menu cubugundaki Logo iconu tıklanır.
    And Sitenin anasayfasına geçiş yapıldığı test edilir.
    Then Browser kapatilir.

  @wip
  Scenario: TC04 Menu çubuğundaki Logo, Home, About, Plans, Blogs, Contac ve Login ile anasayfadaki Get Started iconlarının aktiflik kontrolu

    Given Ziyaretçi "homepageUrl" anasayfaya gider.
    And Menu cubugundaki Logo iconunun aktif olduğu test edilir.
    And Menu cubugundaki Home iconunun aktif olduğu test edilir.
    And Menu cubugundaki About iconunun aktif olduğu test edilir.
    And Menu cubugundaki Plans iconunun aktif olduğu test edilir.
    And Menu cubugundaki Blogs iconunun aktif olduğu test edilir.
    And Menu cubugundaki Contact iconunun aktif olduğu test edilir.
    And Menu cubugundaki Login iconunun aktif olduğu test edilir.
    And Anasayfada Get Started iconunun aktif olduğu test edilir.
    Then Browser kapatilir.