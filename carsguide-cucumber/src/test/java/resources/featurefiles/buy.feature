Feature: Search functionality

  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hover on 'buy + sell' tab
    And I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make    | model   | location           | price    | make    |
      | Holden  | Belmont | NSW - Central West | $70,000  | Holden  |
      | Mazda   | B4000   | NSW - Far West     | $90,000  | Mazda   |
      | Suzuki  | Jimny   | NSW - Riverina     | $30,000  | Suzuki  |
      | Toyota  | Altezza | NSW - South Coast  | $60,000  | Toyota  |
      | Alpine  | A110    | NSW - Sydney       | $45,000  | Alpine  |
      | Hyundai | I30     | QLD - All          | $150,000 | Hyundai |

  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hover on 'buy + sell' tab
    And I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<make>" in results
    Examples:
      | make    | model   | location           | price    | make    |

      | make    | model   | location           | price    | make    |
      | Holden  | Belmont | NSW - Central West | $70,000  | Holden  |
      | Mazda   | B4000   | NSW - Far West     | $90,000  | Mazda   |
      | Suzuki  | Jimny   | NSW - Riverina     | $30,000  | Suzuki  |
      | Toyota  | Altezza | NSW - South Coast  | $60,000  | Toyota  |
      | Alpine  | A110    | NSW - Sydney       | $45,000  | Alpine  |
      | Hyundai | I30     | QLD - All          | $150,000 | Hyundai |