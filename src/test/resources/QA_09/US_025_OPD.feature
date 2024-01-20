Feature: US_025_OPD kredi islemlerinin yonetebilecegi sayfalara erisme testi

Scenario: TC_01 admin olarak kullanici kredi islemlerini gorebilecegim sayfalara erisebilmek icin admin panel uzerinde krediler menusunun olmali
    Given  belirlenen site "adminloginUrl" i ile browserdan admin siteye erisilir .
    Then açılan admin login sayfasinda username kutusuna gecerli bir "adminnameQA9" kullanici adi  girilir .
    And admin login sayfasinda password kutusuna "adminpasswordQA9" girilir .
    And giris yapabilmek icin login butonuna tiklanir .
    Then admin panel side bar uzerinde Loans menu basligi görüntülenir.
    And admin panel side bar uzerinde Loans menu basligi tiklanir.
    And loans menu basligi altinda Pending Loans sayfa basligi görüntülenir.
    Then loans menu basligi altinda Running Loans sayfa basligi görüntülenir.
    Then loans menu basligi altinda Due Loans sayfa basligi görüntülenir.
    And loans menu basligi altinda Paid Loans sayfa basligi görüntülenir.
    Then loans menu basligi altinda Rejected Loans sayfa basligi görüntülenir.
    Then loans menu basligi altinda  All Loans sayfa basligi görüntülenir.
    And browser kapatilir .



Scenario: TC_02 admin olarak kullanici kredi islemlerini yönetebilecegim sayfalara erisebilmek icin admin panel uzerinde krediler menusunun olmali

    Given  belirlenen site "adminloginUrl" i ile browserdan admin siteye erisilir .
    Then açılan admin login sayfasinda username kutusuna gecerli bir "adminnameQA9" kullanici adi  girilir .
    And admin login sayfasinda password kutusuna "adminpasswordQA9" girilir .
    And giris yapabilmek icin login butonuna tiklanir .
    Then admin panel side bar uzerinde Loans menu basligi tiklanir.
    And loans menu basligi altinda Pending Loans sayfa basligi tiklanir
    And Pending Loans sayfasina ulasildigi test edilir .
    Then loans menu basligi altinda Running Loans sayfa basligi tiklanir
    And Running Loans sayfasina ulasildigi test edilir .
    And loans menu basligi altinda Due Loans sayfa basligi tiklanir
    And Due Loans sayfasina ulasildigi test edilir  .
    And loans menu basligi altinda Paid Loans sayfa basligi tiklanir
    And Paid Loans sayfasina ulasildigi test edilir  .
    Then loans menu basligi altinda Rejected Loans sayfa basligi tiklanir
    And Rejected Loans sayfasina ulasildigi test edilir   .
    Then loans menu basligi altinda  All Loans sbasligi tiklanir
    And All Loans sayfasina ulasildigi test edilir  .
    And browser kapatilir .