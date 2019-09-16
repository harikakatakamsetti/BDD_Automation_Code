#Author: Harika
@weather
Feature: As a user,I want to view weather forecast

 Scenario Outline: A happy holidaymaker
  Given user is able to access weather api
  When user send request for "<city>" 
 Then I receive the weather forecast as "<status>" 
 And user should see the response contains "<city>" 
 
 Examples:weather_cities
      | city  | status|
      | sydney | 200|
      |london|200|
