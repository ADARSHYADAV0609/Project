Feature: Performs all operations in the cart
 
 
Scenario: A user must be able to perform in the Cart
 
Given a user is in the LandingPage on Firstcry
When User login on firstcry
And User search for Shirt
And User clicks on first result
And User clicks on Add to Cart option
And User clicks on Cart option
And User clicking on Change buttton 
And User Click on Edit and Update BuildingName, StreetName and PinCode
And User Click on the Save Address button
And User clicks on quantity
And User clicks on two 
And User click on Remove option
And User click on MoveToShortList option
And User click on View all coupons offer
And User click on Apply Coupons
And User click on the Place order button
Then User must be able to see Payment option  




#Feature: Performs all operations in the cart
#
#
  #@UpdateQuantity
  #Scenario: Update the quantity of a product in the cart
    #Given the user has added products to the cart
    #When the user changes the quantity of a product
    #And clicks on the Quantity button
    #And Select the number he wants to Update
    #Then the quantity of the product should be updated in the cart
    #
    #
  #@Remove
  #Scenario: Remove a product from the cart
    #Given the user has added products to the cart
    #When the user clicks on the Remove button next to a product
    #Then the product should be removed from the cart
    #And the cart total should be updated accordingly
#
  #
    #
#
  #@MoveToShortList
  #Scenario: Move a product to the shortlist
    #Given the user has added products to the cart
    #When the user clicks on the Move to Shortlist button next to a product
    #Then the product should be moved to the shortlist
    #And the product should be removed from the cart
    #And the cart total should be updated accordingly
  #
  #@UpadteAddress
  #Scenario Outline: Update the delivery address
    #Given the user is on the cart page
    #When the user clicks on the CHANGE button
    #And clicks on the EDIT button
    #And enters a new <BuildingAddress>
    #And enters a new <StreetName>
    #And enters a new <PinCode>
    #And clicks on the SaveAddressButton button
    #Then the delivery address should be updated
    #And the new address should be displayed on the cart page
   #
   #Examples:
   #|BuildingAddress|StreetName|Pincode|
   #|12D/34 Tukaramnagar|Kharadi Pune|411014|
   #
  #@CheckOut
  #Scenario: Checkout process
    #Given the user has products in the cart
    #And the user has a valid delivery address
    #When the user clicks on the PlaceOrder button
    #And enters payment details
    #And confirms the order
    #Then the order should be placed successfully
    #And the user should see an order confirmation message
    #And the cart should be emptied
#
   #
#
  #@UpdateProductQuantity
  #Scenario: User updates the quantity of a product in the cart
    #Given the user has added a product to the cart
    #When the user navigates to the Cart Page
    #And the user increases the quantity of the product to "2"
    #Then the cart should display the updated quantity "2"
    #
  #@RemoveProduct
  #Scenario: User removes a product from the cart
    #Given the user has added multiple products to the cart
    #When the user navigates to the Cart Page
    #And the user clicks on the "Remove" button for a specific product
    #Then the product should be removed from the cart
    #
#
  #@MoveToShortList
  #Scenario: User moves a product to the shortlist
    #Given the user has added a product to the cart
    #When the user is on the Cart Page
    #And the user clicks on the "Move to Shortlist" button for that product
    #Then the product should be removed from the cart and user should see a confirmation message "Product moved to Shortlist"
    #
   #
#
  #
#
  #@Checkout
  #Scenario: User proceeds to checkout successfully
    #Given the user has added products to the cart
    #When the user navigates to the Cart Page
    #And the user clicks on the "Proceed to Checkout" button
    #Then the user should be redirected to the Checkout Page
   #
#
  #@PlaceOrder
  #Scenario: User places an order with valid details
    #Given the user is on the Checkout Page
    #And the user has entered valid shipping information
    #And the user has selected a payment method
    #When the user clicks on the "Place Order" button
    #Then the user should see a confirmation message "Order placed successfully"
   