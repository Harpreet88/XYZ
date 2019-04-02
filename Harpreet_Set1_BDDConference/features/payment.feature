
Feature: ConferencePayment

Background: user wants to make the payment for conference so navigated to payment page

Scenario: check the title of the payment page
Given user is on the payment page
Then check the title of the payment page

Scenario: check whether alert box is coming for empty CardHolder Name
Given user is on the payment page
When user leaves CardHolder Name blank and clicks on Make Payment
Then display alert box with CardHolder Name empty message

Scenario: check whether alert box is coming for empty DebitCard Number
Given user is on the payment page
When user leaves DebitCard Number blank and clicks on Make Payment
Then display alert box with DebitCard Number empty message

Scenario: check whether alert box is coming for empty Expiration Month
Given user is on the payment page
When user leaves Expiration Month blank and clicks on Make Payment
Then display alert box with Expiration Month empty message

Scenario: check whether alert box is coming for empty Expiration Year
Given user is on the payment page
When user leaves Expiration Year blank and clicks on Make Payment
Then display alert box with Expiration Year empty message

Scenario: check whether alert box is coming for successful payment
Given user is on the payment page
When user enters valid details and clicks on Make Payment
Then display alert box with payment success message