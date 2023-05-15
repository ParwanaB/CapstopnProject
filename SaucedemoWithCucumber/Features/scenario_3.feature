Feature: Third Scenario
Scenario: user should be able to interact with application successfully
Given user is available on the landing page of saucedemo.com
When Enter user name problem_user
And user enter the password secret_sauce
And Click on login button 
And first product added to the cart
And he clicked on the cart icon at top right corner
And Click on checkout button
And Enter the first name
And Enter your last name 
And Enter postal code
And he clicked on continue button
Then an error message is displayed Error: Last Name is required

