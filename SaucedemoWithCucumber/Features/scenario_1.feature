Feature: First Scenario
Scenario: user should be able to click on all options
Given user will go to landing page of saucedemeo.com
When standard_user is entered
And enters secret_sauce password
And login button clicked by him
And first two products added to the cart
And Click on the cart icon at top right corner 
And Checkout button clicked
And Enter your first name in first name textbox
And Enter the last name in the last name textbox
And Postal Code entered in postal code textbox
And Click on continue button 
And Click on finish button
And Verify the success message Your cart has been dispatched, and will arrive just as fast as the pony can get there!
Then close the browser
