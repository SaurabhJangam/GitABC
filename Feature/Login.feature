Feature: Login

Scenario: Successful login with valid credentials
         Given User launches Chrome browser
         When User opens url "https://admin-demo.nopcommerce.com/login"
         And User Enters Email as "	" and password as "admin"
         And Click on Login
         Then Page Title should be "Dashboard/ nopCommerse administration"
         When User clicks on the logout Link
         Then the Page title should be "Your store.login"
         And Close Browser