Feature: US_024_OPD user olarak dashboardta yapilan ödemeleri,para çekme işlemleri ve toplam kredileri görme ve yönetebilme test edilir

 Scenario: TC_01  dashboardta yapilan ödemeleri,para çekme işlemleri ,toplam kredileri görme ve yönetebilme testi

 Given belirlenen site 'userloginUrl' i ile browserdan siteye erisilir .
 Then homepagede header bolumunde login sekmesine  tiklanir .
  And acilan login sayfasinda username kutusuna gecerli bir "usernameQA9" girilir .
 And login sayfasinda Your password kutusuna kullanici "userpasswordQA9" girilir .
 Then giris yapabilmek için login butonuna tiklanir .
 Then dashboard sayfasinda bulunan   Successful Deposits basligi görüntülendigi test edilir .
 And dashboard sayfasinda bulunan  Successful Withdrawals basligi görüntülendigi test edilir .
 And dashboard sayfasinda bulunan   Total Loan basligi görüntülendigi test edilir .
 Then dashboard sayfasında bulunan basliklarin altindaki  Toplam tutar görüntülendigi test edilir .
  Then dashboard sayfasında bulunan basliklarin altindaki Submitted tutarin görüntülendigi test edilir .
  Then dashboard sayfasında bulunan basliklarin altindaki Pending  tutarin görüntülendigi test edilir .
 Then dashboard sayfasında bulunan basliklarin altindaki Rejected tutarin görüntülendigi test edilir .
  Then  dashboard sayfasında bulunan basliklarin altindaki  kredi adetlerinin görüntülendigi test edilir .
  And browser kapatilir .

