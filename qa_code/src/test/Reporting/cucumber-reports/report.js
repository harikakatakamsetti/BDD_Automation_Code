$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/cart.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Harika"
    }
  ],
  "line": 4,
  "name": "As a user,I want to be able to add 2 items to the cart and place an order",
  "description": "",
  "id": "as-a-user,i-want-to-be-able-to-add-2-items-to-the-cart-and-place-an-order",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "duration": 10402102663,
  "status": "passed"
});
formatter.background({
  "line": 6,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 7,
  "name": "user is on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters product name \"Blouse\" on search bar",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user clicks on search icon",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "verify user is on product listing page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user selects the first product \"Blouse\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "verify user is on product details page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify cart pop up is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user selects \"Continue shopping\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "verify user is on product details page",
  "keyword": "Then "
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_is_on_the_homepage()"
});
formatter.result({
  "duration": 6068390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 26
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_enters_product_name_on_search_bar(String)"
});
formatter.result({
  "duration": 104730106,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_search_icon()"
});
formatter.result({
  "duration": 1519141692,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_product_listing_page()"
});
formatter.result({
  "duration": 749219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Blouse",
      "offset": 32
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_selects_the_first_product(String)"
});
formatter.result({
  "duration": 2360031200,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_product_details_page()"
});
formatter.result({
  "duration": 36313304,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_button()"
});
formatter.result({
  "duration": 87475223,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_cart_pop_up_is_displayed()"
});
formatter.result({
  "duration": 42560367,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Continue shopping",
      "offset": 14
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_selects(String)"
});
formatter.result({
  "duration": 1324656985,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_product_details_page()"
});
formatter.result({
  "duration": 26377529,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "As a user,I want to be able to add 2 items to the cart and place an order",
  "description": "",
  "id": "as-a-user,i-want-to-be-able-to-add-2-items-to-the-cart-and-place-an-order;as-a-user,i-want-to-be-able-to-add-2-items-to-the-cart-and-place-an-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@registered_user"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "user enters product name \"dresses\" on search bar",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on search icon",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "verify user is on product listing page",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "user selects the second product \"Faded Short Sleeve T-shirts\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "verify user is on product details page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user clicks on add to cart button",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "verify cart pop up is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "user selects \"Proceed to checkout\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify user is on cart page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "verify products and total are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user clicks on \"Proceed to checkout\"",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "verify user is on sign in page",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "user login with registered \"tester01@gmail.com\" and \"tester\"",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "verify user is on billing address page",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "verify saved billing address,invoice address,email are displayed",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user clicks on \"Proceed to checkout\"",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "verify user is on shipping page",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user clicks on terms and conditions",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user clicks on \"Proceed to checkout\"",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "verify user is on payment page",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "user selects the payment option \"Pay by bank wire\"",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "verify user is able to see payment details",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "user clicks on \"I confirm my order\"",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "verify user is on order confirmation page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "user is able to see successful order message",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user clicks on logut",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "verify user is on signin page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "dresses",
      "offset": 26
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_enters_product_name_on_search_bar(String)"
});
formatter.result({
  "duration": 145657682,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_search_icon()"
});
formatter.result({
  "duration": 1973345363,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_product_listing_page()"
});
formatter.result({
  "duration": 18194,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Faded Short Sleeve T-shirts",
      "offset": 33
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_selects_the_second_product(String)"
});
formatter.result({
  "duration": 2057331075,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_product_details_page()"
});
formatter.result({
  "duration": 31361744,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_button()"
});
formatter.result({
  "duration": 71821408,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_cart_pop_up_is_displayed()"
});
formatter.result({
  "duration": 27421116,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to checkout",
      "offset": 14
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_selects(String)"
});
formatter.result({
  "duration": 3558470531,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_cart_page()"
});
formatter.result({
  "duration": 62082967,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_products_and_total_are_displayed()"
});
formatter.result({
  "duration": 48169710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to checkout",
      "offset": 16
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_clicks_on(String)"
});
formatter.result({
  "duration": 4091633245,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_page()"
});
formatter.result({
  "duration": 33129359,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tester01@gmail.com",
      "offset": 28
    },
    {
      "val": "tester",
      "offset": 53
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_enters_registered_and(String,String)"
});
formatter.result({
  "duration": 2742453117,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_billing_address_page()"
});
formatter.result({
  "duration": 1880977,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_saved_billing_address_invoice_address_email_are_displayed()"
});
formatter.result({
  "duration": 163903904,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to checkout",
      "offset": 16
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_clicks_on(String)"
});
formatter.result({
  "duration": 2791153717,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_shipping_page()"
});
formatter.result({
  "duration": 1263315,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_terms_and_conditions()"
});
formatter.result({
  "duration": 96247517,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Proceed to checkout",
      "offset": 16
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_clicks_on(String)"
});
formatter.result({
  "duration": 3610893431,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_payment_page()"
});
formatter.result({
  "duration": 44592028,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Pay by bank wire",
      "offset": 33
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_selects_the_payment_option(String)"
});
formatter.result({
  "duration": 2762098875,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_able_to_see_payment_details()"
});
formatter.result({
  "duration": 34762151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "I confirm my order",
      "offset": 16
    }
  ],
  "location": "OrderPlacingStepDefinitons.user_clicks_on(String)"
});
formatter.result({
  "duration": 4568580782,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_order_confirmation_page()"
});
formatter.result({
  "duration": 773010,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_is_able_to_see_successful_order_message()"
});
formatter.result({
  "duration": 32826592,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.user_clicks_on_logut()"
});
formatter.result({
  "duration": 3156569401,
  "status": "passed"
});
formatter.match({
  "location": "OrderPlacingStepDefinitons.verify_user_is_on_signin_page()"
});
formatter.result({
  "duration": 27105754,
  "status": "passed"
});
formatter.after({
  "duration": 2066937493,
  "status": "passed"
});
});