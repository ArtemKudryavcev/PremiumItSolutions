Feature: LoginFeature

  Scenario Outline: Navigate to the main page and click on a department
    Given navigate to the main page
    And click on department <department>
    Then should see the department page

    Examples:
      | department |
      | Apple      |