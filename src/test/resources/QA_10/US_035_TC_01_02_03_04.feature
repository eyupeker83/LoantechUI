Feature: QA_10_US035 Yönetici (Admin) Dashboard Sayfasinin İslevlerinin Testi

  @wip
  Scenario: TC01 'Total Users','Active Users','Email Unverified Users','Mobile Unverified Users' basliklari görünür olmalı, tıklandığında ilgili sayfaya yönlendirmeli

    Given Kullanici "adminloginUrl" anasayfasina gider.
    And Kutucuklara adminUsername ve adminPassword' u girer.
    Then Login butonuna tiklar.
    And Dashboard anasayfada 'Total Users','Active Users','Email Unverified Users','Mobile Unverified Users' basliklarinin görünür olduğu doğrulanır.
    And Anasayfada bulunan 'Total Users','Active Users','Email Unverified Users','Mobile Unverified Users' basliklari tiklandiginda ilgili sayfaya yonlendirdigi test edilir.
    And Browser kapatilir.

  @wip
  Scenario: TC02 'Total Users','Active Users','Email Unverified Users','Mobile Unverified Users' basliklari görünür olmalı, tıklandığında ilgili sayfaya yönlendirmeli

    Given Kullanici "adminloginUrl" anasayfasina gider.
    Then Kutucuklara adminUsername ve adminPassword' u girer.
    And Login butonuna tiklar.
    Then Dashboard anasayfada Running Loan, Pending Loan, Due Loan, Paid Loan,Total Deposited, Pending Deposits, Rejected Deposits, Deposited Charge,Total Withdrawn, Pending Withdrawals, Rejected Withdrawals, Withdrawal Charge basliklarinin gorunur oldugu dogrulanir.
    And Basliklarin sagindaki View All butonunun gorunur ve aktif oldugu test edilir.
    And Wiew All butonlari tiklandiginda ilgili sayfaya yonlendirdigi dogrulanir.
    And Browser kapatilir.

  @wip
  Scenario: TC03 Sayfadaki 'Monthly Deposit & Withdraw Report (Last 12 Month)','Transactions Report (Last 30 Days)' chart eğrileri görüntülenir.

    Given Kullanici "adminloginUrl" anasayfasina gider.
    Then Kutucuklara adminUsername ve adminPassword' u girer.
    And Login butonuna tiklar.
    Then Dashboard sayfasindaki Monthly Deposit & Withdraw Report (Last 12 Month), Transactions Report (Last 30 Days) chart egrilerinin gorundugu dogrulanir
    And Browser kapatilir.

  @wip
  Scenario: TC04 Sayfadaki 'Monthly Deposit & Withdraw Report (Last 12 Month)','Transactions Report (Last 30 Days)' chart eğrileri görüntülenir.

    Given Kullanici "adminloginUrl" anasayfasina gider.
    Then Kutucuklara adminUsername ve adminPassword' u girer.
    And Login butonuna tiklar.
    Then Dashboard sayfasindaki Login By Browser, Login By OS,Login By Country chart egrilerinin gorundugu test edilir.
    And Browser kapatilir.



