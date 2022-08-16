Feature: Functionality of Myntra Application 

Scenario: validation of all top menu's at HomePage 

	Given user launch the browser 
	When user opens an url 
	Then clicking on Men menu should be ridirected to mens product Page 	
	And clicking on Women menu should be ridirected to Womens product Page
	And clicking on Kids menu should be ridirected to Kids product Page
	And clicking on Home&Living menu should be ridirected to Home&Living product Page
	And clicking on Beauty menu should be ridirected to Kids product Page
	Then clicking on Studio menu should be ridirected to Studio product Page
	
Scenario: validation of SearchProduct Functionality 

	Given user launch the browser 
	When user opens an url  
	Then click on search box in Home page
	And Enter Search product name as <product> in the field 
	And select checkbox to filter color Blue in the product page
	And click on first Men polo collor tshirt in the product page
	And select size of the tshirt in the product page
	And click on add to bag in the product page
	And click on go to bag in the product page
	Then view details in the order page
	
	Examples: 
	|product|
	|'mens tshirt'|
