Feature: Admin
 @chintu
Scenario: Login with valid Credentials
    Given User Launch Chrome Browser
    Given Chrome Browser is maximize
    When  User Open URL "https://admin-demo.nopcommerce.com/login"
    When User enter Email Id as "admin@yourstore.com" and Password as "admin"
    When User click on LOGIN button
    Then user verify page title should be "Dashboard / nopCommerce administration"
    Then close Browser
    
 @sri
 Scenario Outline: Login Data Driven
 Given User Launch Chrome Browser
 Given Chrome Browser is maximize
 When  User Open URL "https://admin-demo.nopcommerce.com/login"
 When  User enter Email Id as "<email>" and Password as "<password>"  
 When   User click on LOGIN button
 Then user verify page title should be "Dashboard / nopCommerce administration"
 Then close Browser
 Examples:
|email                  |password  |
|admin@yourstore.com    |admin     |
|admin123@yourstore.com |admin123  |

