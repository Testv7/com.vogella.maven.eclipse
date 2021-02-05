Feature: Uber Booking Feature

Scenario:Booking Cab

Given User wants to select a car type "Swift" from uban
When User selects car "Swift" and pick up point "Bangalore" and drop at "Pune"
And Driver starts the journey
Then User pays 1000 USD
