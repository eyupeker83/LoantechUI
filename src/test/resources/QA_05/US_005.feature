Feature: Bir ziyaretci olarak About linkine tiklayip ilgili sayfaya yonlendirmeli ve anasayfaya geri donebilmeli

  """
Anasayfadaki menü başlığından About tıklandığında 'About 'sayfasına yönlendirilir.
Anasayfadaki Footer Bölümünden About sayfasına yönlendirme bulunur.
About sayfasında ' Fulfilling Financial Dreams ' başlığı görülür.
About sayfasında ' Home | About ' ikonları görünür ve aktiftir .Home iconuna tıklandığında Anasayfaya geçilebilir.
  """

  Scenario:TC_01 Anasayfadaki menü başlığından About tıklandığında About sayfasına yönlendirilir.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then menu basligindan About butonuna tiklanir
    And acilan sayfanin about oldugu dogrulanir
    And browser kapatilir .

  Scenario:TC_02  Anasayfadaki Footer Bölümünden About sayfasına yönlendirme bulunur.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then sayfanin footer bolumunden About butonuna tiklanir
    And acilan sayfanin about oldugu dogrulanir
    And browser kapatilir .

  Scenario:  TC_03 - TC_04 About sayfasında ' Fulfilling Financial Dreams ' basligi gorulur. About sayfasında ' Home | About ' ikonları görünür ve aktiftir .Home iconuna tıklandığında Anasayfaya geçilebilir.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then menu basligindan About butonuna tiklanir
    And acilan sayfadaki Fulfilling Financial Dreams basliginin gorundugu dogrulanir
    Given Home | About linkleri gorunur oldugu test edilir
    And Home linkine tiklanir ve anasayfada oldugumuz dogrulanir