#Author: Harika

@smoke
Feature: As a user,I want to be able to add 2 items to the cart and place an order

  Background: 
    Given user is on the homepage
    And user enters product name "Blouse" on search bar
    When user clicks on search icon
    Then verify user is on product listing page
    When user selects the first product "Blouse"
    Then verify user is on product details page
    When user clicks on add to cart button
    Then verify cart pop up is displayed
    And user selects "Continue shopping"
    Then verify user is on product details page

  @registered_user
  Scenario: As a user,I want to be able to add 2 items to the cart and place an order
    And user enters product name "dresses" on search bar
    When user clicks on search icon
    Then verify user is on product listing page
    When user selects the second product "Faded Short Sleeve T-shirts"
    Then verify user is on product details page
    When user clicks on add to cart button
    Then verify cart pop up is displayed
    And user selects "Proceed to checkout"
    Then verify user is on cart page
    And verify products and total are displayed
    When user clicks on "Proceed to checkout" 
    Then verify user is on sign in page
    And user login with registered "tester01@gmail.com" and "tester"
    Then verify user is on billing address page
    And verify saved billing address,invoice address,email are displayed
    When user clicks on "Proceed to checkout"
    Then verify user is on shipping page
    And user clicks on terms and conditions
    When user clicks on "Proceed to checkout"
    Then verify user is on payment page
    And user selects the payment option "Pay by bank wire" 
    Then verify user is able to see payment details
    When user clicks on "I confirm my order"
    Then verify user is on order confirmation page
    And user is able to see successful order message
    When user clicks on logut
    Then verify user is on signin page
