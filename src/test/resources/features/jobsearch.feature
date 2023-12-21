Feature: JobSearch Test

  Scenario Outline: Search the job and verify result
    Given I am on the Homepage
    When I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I enter distance "<distance>"
    And I click on more search Options link
    And I enter salaryMin "<salaryMin>"
    And I enter salaryMax "<salaryMax>"
    And I select salaryType "<salaryType>"
    And I select jobType "<jobType>"
    And I click on Find Jobs button
    Then I verify the result "<result>"
    Examples:
      | jobTitle      | location         | distance | salaryMin | salaryMax | salaryType | jobType   | result                                      |
      | Tester        | Harrow           | 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow             |
      | Test Engineer | Derby            | 10 miles | 25000     | 45000     | Per annum  | Part Time | Part Time Test Engineer jobs in Derby       |
      | Test Analyst  | Edenbridge, Kent | 25 miles | 25000     | 45000     | Per annum  | Permanent | Permanent Test Analyst jobs in Edenbridge   |
      | Test Manager  | Hampshire        | 35 miles | 35000     | 65000     | Per annum  | Permanent | Permanent Test Manager jobs in Hampshire    |
      | Developer     | Basildon         | 25 miles | 40000     | 60000     | Per annum  | Contract  | Contract Developer jobs in Basildon         |




