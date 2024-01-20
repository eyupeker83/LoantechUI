Feature:Kullanici user olarak siteye login olup para cekme Withdraw gercektestirir
  """
Dashboard sayfasında para çekme işlemlerini yönetebilmek için "Withdraw" buton bulunur.
Withdraw buton tıklandığında "Withdraw Money" sayfasına yönlendirilir.
"Method" dropdown menuden method name seçilebilir.
Amount textbox'a 300.00 USD - 8000.00 USD aralığında bir deger girilebilir.
Submit butona tıklandığında "Withdraw Via Method 5 Updatedé yazısı görüntülenebilir
Submit buton tıklanabilir olmalı ve "Withdraw request sent successfully" yazısı görüntülenebilir
Withdraw History sayfasında gerçekleştirilen para çekme işlemi accordion table'da görünür.
accordion table da seçilen bir withdraw işleminde Charge-After Charge-Conversion-Status değerleri görüntülenir
Withdraw History sayfasında "Withdraw Money " Butonuna tıklandığında "Withdraw Money"sayfasına geçilir.
"Withdraw Money" sayfasında "Withdraw Log" butonuna tıklandığında Withdraw History sayfasına geçilir.
  """
  Scenario:TC
    Given belirlenen site 'userloginUrl' i ile browserdan siteye erisilir .
    And acilan login sayfasinda username kutusuna gecerli bir "EyupUsrName" girilir .
    And login sayfasinda Your password kutusuna kullanici "EyupUsrPass" girilir .
    And login olur
    Then withdraw butonuna tiklanir
    And dropdown menuden bir method secilir
    Then amount textboxa belirtilen aralikta bir tutar girilir
    And accordion table de Charge-After Charge-Conversion-Status degerleri goruntulenir
    Then withdraw money butonuna tiklanip withdraw money sayfasina gecilir
    And withdraw Money sayfasinda withdraw log butonuna tiklandiginda withdraw history sayfasina gecilir