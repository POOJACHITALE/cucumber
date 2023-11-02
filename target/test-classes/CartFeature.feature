Feature: Cart Testcases 



Scenario: Verify product name text gets displayed after a product to cart
Given Open the the app url
When Search for Falcon Product
Then Click on Add to Cart for falcon heavy
Then Click on View Cart For Falcon Heavy
Then Product Name text should get displayed
