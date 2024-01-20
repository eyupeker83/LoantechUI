
  Feature: US_006 homepage sosyal ağların ikonlarının görünür ve aktif olduğu testi

    """
    Bir ziyaretçi olarak; Anasayfa Footer kısmında, About Loantech bölümünde;
    Facebook, X, Google, Youtube, Linkedin, Instagram sosyal ağlarının
    ikonlarının görünür olduğu test edilir.
    """

    Scenario: US_006_TC_01 homepage sosyal ağların ikonlarının görünür olduğunu test eder

   # homepage footer bolumunde google linki bulunmadığından gorunurluk ve aktiflik testi yapılamamıştır

    * kullanici "homepageUrl" ile browserdan siteye erişir
    * footer bölümüne gider
    * facebook linkinin görünür olduğunu test eder
    * X linkinin görünür olduğunu test eder
    * google linkinin görünür olduğunu test eder
    * youtube inkinin görünür olduğunu test eder
    * linkedin  linkinin görünür olduğunu test eder
    * instagram linkinin görünür olduğunu test eder
    * browser kapatilir


    Scenario: US_006_TC_02 homepage sosyal ağların ikonlarının aktif olduğunu test eder

       # homepage footer bolumunde google linki bulunmadığından gorunurluk ve aktiflik testi yapılamamıştır

      * kullanici "homepageUrl" ile browserdan siteye erişir
      * footer bölümüne gider
      * facebook linkinin aktif olduğunu test eder
      * X linkinin aktif olduğunu test eder
      * google linkinin aktif olduğunu test eder
      * youtube inkinin aktif olduğunu test eder
      * linkedin  linkinin aktif olduğunu test eder
      * instagram linkinin aktif olduğunu test eder
      * browser kapatilir
