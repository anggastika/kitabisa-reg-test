import { Given, Then, When} from 'cypress-cucumber-preprocessor/steps';

    const USER = {
        "name": "morpheus",
        "job": "leader"
    }

// Given(/^I access api request end point to get single user only$/, () => {

// 	cy.request(`${Cypress.env('URL')}api/users`)	
 
// });


Then(/^Post data and Verify the response$/, () => {	 
	cy.request({
        method: 'POST',
        url: `${Cypress.env('URL')}api/users`,
        body: USER
      })
      .then((response) => {
        expect(response.status).to.equal(201)
      })	
    
});