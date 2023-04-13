Feature: Validate the functionality of Adactin Website

  Background: 
    Given User launch Adactin Website URL
    Then User verify Adactin login page is displayed

  Scenario: TC_01 Validate Adactin website functionalities completely with valid credentials
    When User enters valid username and valid password
    And User clicks Login button
    Then User verify SearchHotel Page is displayed
    When User selects any location from Location dropdown
    When User selects any Hotel from Hotel dropdown
    When User selects any RoomType from Room Type dropdown
    When User selects Number of rooms from Number of rooms dropdown
    When User enters valid Check In Date
    When User enters valid Check Out Date
    When User selects  Adults per Room from Adults per Room dropdown
    When User selects Children per Room from Children per Room dropdown
    And User clicks Search button
    Then User verify Select Hotel Page is displayed
    When User clicks the Select radiobutton
    And User clicks Continue button
    Then User verify Book a Hotel Page is displayed
    When User enters valid First Name
    When User enters valid Last Name
    When User enters valid Billing address
    When User enters valid Credit card number
    When User selects valid Credit card type from Credit card type dropdown
    When User selects valid Expiry month from Select Month dropdown
    When User selects valid Expiry year  from Select Year dropdown
    When User enters valid CVV number
    And User clicks Book Now button

  Scenario Outline: TC_02 Validate Adactin website with multiple data
    When User enters valid username and valid password
    And User clicks Login button
    When User selects any "<location>" from Location dropdown
    When User selects any "<Hotel>" from Hotel dropdown
    When User selects any "<RoomType>" from Room Type dropdown
    When User selects "<Number of rooms>"  from Number of rooms dropdown
    When User enters valid "<Check In Date>"
    When User enters valid "<Check Out Date>"
    When User selects  "<Adults per Room>" from Adults per Room dropdown
    When User selects "<Children per Room>" from Children per Room dropdown
    And User clicks Search button
    Then User verify Select Hotel Page is displayed
    When User clicks the Select radiobutton
    And User clicks Continue button
    Then User verify Book a Hotel Page is displayed
    When User enters valid first name "<First Name>"
    When User enters valid last name"<Last Name>"
    When User enters valid address"<Billing address>"
    When User enters valid card number "<Credit card number>"
    When User selects valid "<Credit card type>" from Credit card type dropdown
    When User selects valid "<Expiry month>" from Select Month dropdown
    When User selects valid "<Expiry year>"  from Select Year dropdown
    When User enters valid cvv "<CVV number>"
    And User clicks Book Now button

    
    Examples: 
      | location | Hotel          | RoomType | Number of rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing address | Credit card number | Credit card type | Expiry month | Expiry year | CVV number |
      | Paris    | Hotel Sunshine | Standard |               3 | 15/04/2023    | 18/04/2023     |               1 |                 0 | Rosemi     | K         | Tuticorin       |   1234567812345678 | VISA             | 2          |        2021 |       4444 |
      | Sydney   | Hotel Cornice  | Deluxe   |               1 | 15/04/2023    | 18/04/2023     |               3 |                 0 | Nicemi     | K         | Chennai         |   1234567812345600 | Master Card      | 4         |        2021 |       5555 |
      | New York | Hotel Creek    | Double   |               2 | 15/04/2023    | 18/04/2023     |               3 |                 0 | Valar      | K         | Tuticorin       |   1234567812345655 | VISA             | 7          |        2021 |       4444 |
      | London   | Hotel Sunshine | Deluxe   |               1 | 15/04/2023    | 18/04/2023     |               3 |                 0 | Rio        | K         | Tirunelveli     |   1234567812345677 | American Express | 8          |        2021 |       7777 |
