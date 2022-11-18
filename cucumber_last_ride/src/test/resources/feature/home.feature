
Feature: Internet banking project

@Smoke
  Scenario: Bank manager login
    Given Open a Browser
    When Enter URl
    And User click on Bank Manager login
    And User click on add customer feature
    And User enter frist name
    And User enter last name
    And User enter postan code
    And User click on add customer
    And user verified Alert massege
    And user click on ok button
    Then User click on home
    Then user close a browser
    
  @Sanity
  Scenario: Customer Login
    Given Open a Browser
    When Enter URl
    And User click on custmor login
    And User select name
    And User click on login button
    And User click on deposite feature
    And User Enter deposite ammount
    And User click on deposite
    And User click on withdrawl feature
    And User Enter withdrawl ammount
    And User click on withdrawl
    And User click on logout button
    Then user close a browser

  

  
