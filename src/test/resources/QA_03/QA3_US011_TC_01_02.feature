Feature: QA3_US011 ziyaretci olarak  kredi planlarından haberdar olmak için sirket bültenine abone olunabilir.


  Scenario: TC_01 Ziyaretci sayfaya giriş yaptıktan Newsletter bölümünü görüntüleyebilmelidir.

    Given Kullanıcı visitorURL anasayfaya gider.
    Then  Anasayfa Footer bölümünde Newsletter bölümüne gelinir.
    Then  Newsletter Bölümünde Newsletter yazisi ve E-Mail adresi girilen Text Box görütülendigi dogrulanir.
    And   browseri kapatir.

    Scenario: TC02 Ziyaretci Footer Newsletter Bölümününden E-mail ile sirket bültenine abone olabilmelidir.
      Given   Kullanıcı visitorURL anasayfaya gider.
      Then    Anasayfa Footer bölümünde Newsletter bölümüne gelinir.
      Then    Newsletter Bölümünde Newsletter yazisi ve E-Mail adresi girilen Text Box E-Mail adresi girilir.
      And     Text Box yaninda bulunan gönder butonuna tiklanir.
      Then    Sirket bültenine abone olundugu dogrulanir.
      And     browseri kapatir.
