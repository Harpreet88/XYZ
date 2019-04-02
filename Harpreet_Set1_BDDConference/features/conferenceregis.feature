Feature: Registeration for conference

Scenario: Verify the title of registeration page
Given user is on registeration page
Then check the title of that page

Scenario: Check that alert box pops out for empty firstname field
Given user is on registeration page
When user leaves first name field empty and submits
Then display alert box with message 'Please fill the first Name'

Scenario: Check that alert box pops out for empty lastname field
Given user is on registeration page
When user leaves last name field empty and submits
Then display alert box with message 'Please fill the Last Name'

Scenario: Check that alert box pops out for empty email field
Given user is on registeration page
When user leaves email field empty and submits
Then display alert box with message 'Please fill the Email'

Scenario:  Check that alert box pops out for wrong email
Given user is on the registeration page
When user enters wrong email format and submits
Then display alert box with message 'Please fill the Email'

Scenario: Check that alert box pops out for empty contact no
Given user is on the registeration page
When user leaves contact number blank and submits
Then display alert box with message 'Please fill the Contact No'

 Scenario: Check that alert box pops out for invalid contact no format
Given user is on the registeration page
When user enters invalid contact no format and submits
Then display alert box with message 'Please enter valid Contact no'
 
Scenario: Check that alert box pops out for empty number of people attending option
Given user is on the registeration page
When user leaves number of people attending blank and submits
Then display alert box with message 'Number of people attending'

Scenario:Check that alert box pops out  for empty building and room no
Given user is on the registeration page
When user leaves building and room no blank and submits
Then display alert box with message 'Please fill the Building & Room No'

Scenario: Check that alert box pops out for empty area name
Given user is on the registeration page
When user leaves area name blank and submits
Then display alert box with message 'Please fill the Area name'

Scenario: Check that alert box pops out for empty city name
Given user is on the registeration page
When user leaves city name blank and submits
Then display alert box with message 'Please select city'

Scenario: Check that alert box pops out for empty state column
Given user is on the registeration page
When user leaves state column blank and submits
Then display alert box with message 'Please select state'

Scenario: Check that alert box pops out for empty membership status
Given user is on the registeration page
When user leaves membership status blank and submits
Then display alert box with message 'Please select Membership status'
Scenario: Check that alert box pops out for valid data
Given user is on the registeration page
When user enters all valid data and submits
Then display alert box with registration success message
And navigate to payment page

 