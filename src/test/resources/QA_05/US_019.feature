Feature:Kayıtlı bir kullanıcı olarak Dashboard sayfasında işlemleri yapabilmeli

  """
  Dashboard sayfasındaki Navbar'da "Transactions" linki görünür ve aktif olmalıdır
Transactions linki tıklandığında "My Transactions History" sayfasına yönlendirmeli
Sayfada "Transactions Number" Search Box ,Type (All,Plus,Minus) menü ,"remark" altında(Any, Application fee, Balance add,Deposit, Loan taken, Withdraw, Withdraw reject)görünür ve aktif olmalı,filtreleme yapılabilmelidir.
Listedeki bir işlem seçildiğinde Title,Amount,charge,Post Balance,Details Bilgileri görünür olmalı
  """

  Scenario: US_019 TC
    Given belirlenen site 'userloginUrl' i ile browserdan siteye erisilir .
    And acilan login sayfasinda username kutusuna gecerli bir "EyupUsrName" girilir .
    And login sayfasinda Your password kutusuna kullanici "EyupUsrPass" girilir .
    And login olur
    Then transactions linkine tiklanir
    And my transactions history sayfasina yonlendirilir
    Then sayfada transaction number ile arama yapabilmeli
    And type ve remark dropdown elementlerindeki secenekler belirtildigi gibi olmalidir
    Then sayfa kapatilir