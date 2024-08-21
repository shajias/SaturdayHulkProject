@regression @api
Feature: Petstore  API Testing

Scenario: Pet CRUD API
	
	Given Create user
	And Get user
	When Update user
	Then Delete user
	