Feature:

Scenario Outline:

 Given User is on GreentKart landing page
 When User search for name <Name> 
 And User serach for the same name <Name> on Offers page
 Then User comepares the product
  Examples:
 |Name|
  |Tom|
 |str|
 
 
 
