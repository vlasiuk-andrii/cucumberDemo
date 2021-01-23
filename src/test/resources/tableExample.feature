@TableTag
Feature: File upload is working

    Scenario: Table
    Given I open my application
    And I login with following credentials
      | admin | pass1234 |

  Scenario: Table2
    Given I open my application
    And I use data
      | First Name   | Last Name | Phone No   | Password | DOB Day  | DOB Month  | DOB Year  | Gender |
      | Test FN 	 | Test LN 	 | 0123123123 | Pass1234 | 01 		| Jan 		 | 1990 	 | Male   |
