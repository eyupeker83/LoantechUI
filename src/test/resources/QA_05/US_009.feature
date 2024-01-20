Feature: Bir ziyaretci olarak şirket ile iletişime geçebilmek için sitede, içerisinde iletişim bilgilerinin olduğu Contact sayfasının olmasını istiyorum

"""
  Anasayfa menü başlığından Contact başlığı tıklandığında 'Contact Us' sayfasına erişilebilir.
Anasayfa Footer Bölümünde Important Link Başlığı altında 'Contact Us'Linki görünür ve aktiftir ,tıklandığında 'Contact Us'sayfasına yönlendirilir
Contact Us sayfasında şirket konumunu gösteren haritada adres bilgisi(105 Evergreen Ave, Brooklyn, NY 11206, Amerika Birleşik Devletleri) görünür.
Contact Us sayfasında Şirkete ait email,telefon ve adres iletişim bilgileri görünür durumdadır.
Contact Us sayfasında Şirkete mesaj gönderilebilecek Form görünür durumdadır ve formdaki tüm kutular doldurulup mesaj gönderilebilir.
  """

  Scenario: TC_01 Anasayfa menü başlığından Contact başlığı tıklandığında 'Contact Us' sayfasına erişilebilir.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then menuden contact linkine tiklanir
    And contact sayfasinda oldugu dogrulanir
    And sayfa kapatilir

  Scenario: TC_02 Anasayfa Footer Bölümünde Important Link Başlığı altında 'Contact Us'Linki görünür ve aktiftir ,tıklandığında 'Contact Us'sayfasına yönlendirilir
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then sayfanın footer bolumunden Contact Us linki gorunur ve tiklanir
    And contact sayfasinda oldugu dogrulanir
    And sayfa kapatilir

  Scenario:TC_03 Contact Us sayfasında şirket konumunu gösteren haritada adres bilgisi(105 Evergreen Ave, Brooklyn, NY 11206, Amerika Birleşik Devletleri) görünür.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then menuden contact linkine tiklanir
    And sirket adresi gorunur ve belirtilen adresle ayni oldugu dogrulanir
    And sayfa kapatilir

  Scenario: TC_04 Contact Us sayfasında Şirkete ait email,telefon ve adres iletişim bilgileri görünür durumdadır.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then menuden contact linkine tiklanir
    And contact sayfasinda adress -email ve telefon numarasi gorunur olmali
    And sayfa kapatilir

  Scenario: TC_05 Contact Us sayfasında Şirkete mesaj gönderilebilecek Form görünür durumdadır ve formdaki tüm kutular doldurulup mesaj gönderilebilir.
    Given belirlenen site 'homepageUrl' ile browserden siteye erisilir .
    Then sayfanın footer bolumunden Contact Us linki gorunur ve tiklanir
    And acilan sayfada sirkete mesaj yazilip gonderilir