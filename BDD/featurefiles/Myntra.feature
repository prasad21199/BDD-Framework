@myntra
Feature: Add To cart
Scenario Outline: Add and remove an item
Given User should be present in home page of Myntra
When He searches for "<Item>"
Then Product List page should be displayed
When He clicks on the first Product
Then Selected product should be displayed in the New tab
When He selects the size as "<Size>"
And He clicks on Add to bag button
And He clicks on bag icon
Then The product should be displayed in the bag
When he clicks on apply coupon
And he selects the apply button
When he clicks on remove button
And he clicks on remove option
Then Empty bag should be displayed

Examples:
|Item|Size|
|Mens Shoes|8|
|Mens Tshirts|L|
|Mens jeans|32|
|Women Hoodies|M|

