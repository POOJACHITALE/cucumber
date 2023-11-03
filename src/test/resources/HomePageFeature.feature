Feature: Home Features here
Scenario: Search for Falcon product and click on View cart for Falcon Heavy product
Given Open the the app url
When Search for Falcon Product
Then Click on Add to Cart for falcon heavy
Then Click on View Cart For Falcon Heavy

Scenario: Search for Falcon product and click on View cart for Falcon9 product
Given Open the the app url
When Search for Falcon Product
Then Click on Add to Cart for falcon9
Then Click on View Cart For falcon9

Scenario: Verify Product title gets displayed
Given Open the the app url
When Search for Falcon Product
Then Verify Falcon Heavy Product Title is Displayed

Scenario: Verify Product title gets displayed
Given Open the the app url
When Search for Falcon Product
Then Verify Falcon9 Product Title is Displayed

Scenario: Verify Product titles Falcon should get displayed
Given Open the the app url
When Search for Falcon Product
Then Verify Falcon Product Titles are Displayed

Scenario: Verify Product titles Proton should get displayed
Given Open the the app url
When Search for Proton Product
Then Verify Proton Product Titles are Displayed