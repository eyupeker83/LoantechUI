Feature: US_007_OPD ziyaretci Loan Planlara ulasabilmeli ve secebilmeli

  Scenario: TC_01 Loan Planlara ulasabilme testi

    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then homepage menü baslıgından Plans tiklanir .
    Then loan Plans sayfasına erisbildigi dogrulanir.
    Then homepage footer bolumunde Important Link baslıgı altında Loan Plans Linki görünür oldugu dogrulanır .
    And  homepage footer bolumunde Important Link baslıgı altında Loan Plans Linki aktif oldugu dogrulanır .
    Then Loan Plans Sayfasinda Basic Loan tiklanir .
    And basic Loan basligi altinda Loan Plan Cardlar görüntülendigi dogrulanır .
    Then cardlarin altinda bulunan Apply Now butonlarinin görünür oldugu dogrulanir.
    And cardlarin altinda bulunan Apply Now butonlarinin aktif oldugu dogrulanir
    And browser kapatilir .

  Scenario: TC_02 Loan Planlari secebilme testi
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then homepage menü baslıgından Plans tiklanir .
    Then loan Plans sayfasına erisbildigi dogrulanir.
    And loan Plans Sayfasinda Home linkine tiklanir .
    And homepage sayfasina gecis yapılabildigi dogrulanir .
    Then loan Plans Sayfasinda Loan Plans linkine tiklanir .
    Then  loan Plans sayfasina  gecis yapilabildiği dogrulanir
    And browser kapatilir .
