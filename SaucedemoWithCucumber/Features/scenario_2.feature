Feature: First scenario
Scenario: User should be able to buy product successfully
Given user is on the landing page of saucedeme.com
When he enters the user name locked_out_user
And he enters the password secret_sauce
And he clicks on login button
Then he verifys the error message Epic sadface: Sorry this user has been locked out.
