Feature: fifth Sceanrio
Scenario: User should be able to finish all the process of buying successfully 
Given user visiting the landing page of saucedemo.com
When Enter the user name standard_user
And Enter the password secret_sauce
And login button was clicked by him 
And Add the first and third products to the cart
And remove the first product from the cart
And Click on cart icon at top right corner
And verify the text Your cart is displayed at the top left corner of the page
And Click on continue shopping 
And item was sorted from high to low
And Add the most expensive item to cart
And Click on cart icon
And verify two items in the cart
And checkout button is being process
And first name was entered
And last name is being entered
And postal code was entered by him
And continue button was clicked 
And  finish button was checked
Then verify the success message Thank you for your order

