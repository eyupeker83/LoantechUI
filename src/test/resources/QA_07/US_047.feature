Feature: US_047  Bir yönetici olarak; kullanıcıların detaylı bilgilerine erişebildiği, siteye erişimi engelleyebildiği,
                site erişim durumunu ve detaylı bilgileri görüntüleyebildiği test edilir.


  Scenario: TC_01 Bir yönetici olarak; kullanıcıların siteye erişimi engelleyebildiği ve detaylı bilgileri görüntüleyebildiği test edilir.

   * kullanici "adminloginUrl" ile browserdan siteye erisir.
   * acilan admin login sayfasinda username kutusuna gecerli bir admin kullanici adi  girilir.
   * acilan admin login sayfasinda password kutusuna gecerli bir admin sifre girilir.
   * Login butonuna tiklanir.
   * acilan pencerede soldaki menude Manage Users kismina tiklanir.
   * aktif kullanicilar butonuna tiklanir.
   * arama kutusuna "kaan" yazilir.
   * islem yapilacak kullaniciya ait details butonuna tiklanir.
   * ban user butonuna tiklanir.
   * aciklama kismina yasaklama sebebi hakkinda bilgi girilir.
   * submit butonuna tiklanir.
   * isleminin onaylandiğina yonelik uyari mesajinin goruldugu test edilir.
   * banner users butonuna tiklanir.
   * arama kutusuna "kaan" yazilir.
   * engellenen  kullanicinin user bilgisinin listede  gorunur oldugu test edilir.
   * acilan listeden, islem yapilacak kullaniciya ait details butonuna tiklanir.
   * kullanicinin engellenmis olduğunun goruldugu test edilir.
   * admin kullanici adina tiklanir.
   * logout butonuna tiklanir.
   * browser kapatilir.




