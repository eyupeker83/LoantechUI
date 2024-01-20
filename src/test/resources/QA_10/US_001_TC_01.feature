Feature: QA_10_US001 Web Sitesine Erişim.

  @wip
  Scenario: TC01 qa.loantechexper.com sitesine erişim kontrolu

    Given Ziyaretçi "homepageUrl" anasayfaya gider.
    When web sitesine erişebildiğini test eder.
    Then web sitesinde anasayfanın görünür olduğu doğrulanır.
    And Browser kapatilir.



