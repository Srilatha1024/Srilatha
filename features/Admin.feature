Feature: Admin
 
Scenario: Login with valid Credentials
    Given User Launch Chrome Browser
    When  User Open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email Id as "admin@yourstore.com" and Password as "admin"
    When User click on LOGIN button
    Then close Browser

