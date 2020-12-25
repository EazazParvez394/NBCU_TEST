## Demo Challenge

#### Instructions
1. Complete the project setup as listed below
2. Complete the Excerise
3. Email a synopsis of your work and the link to your git repo containing the completed exercise to: sqedemonstrationchallenge@nbcuni.com

#### Technologies
1. Java
2. Selenium
3. TestNG
4. Any other technologies you see fit.
5. Please do not use a BDD framework.

#### Project Setup
1. Clone this project to your git account in a public repo
2. Setup the project in your IDE
3. Open the index.html file from src/test/resource/files in a browser
4. Copy the url from the browser and update the url value in src/test/resource/config.properties to be the copied url.
5. In src/test/resources update the config.properties file platform for your OS.
6. From command line run mvn clean install -U -DskipTests
7. Make sure you can run the DemoTest and chrome launches.  You may need to update the chromedriver in /src/test/resources/chromedriver/ to the version that works with your browser
   https://chromedriver.chromium.org/

#### Expectations
We will be evaluating
1. Quality of test cases
2. Variety  of testing types (examples: boundary, happy path, negative, etc)
3. Code structure and organization
4. Naming conventions
5. Code readability
6. Code modularity

#### Exercise
1. Use the site at the index.html
2. There are helper locators provided for you in the src/test/resource/files/locators.txt file.
3. In the Test Cases section below:
  - List all of the test cases you think are necessary to test the sample page
  - Note any defects or issues observed
4. Code up a few examples of:
  - At least one happy path case placing an order
  - At least one error case
5. When complete please check your code into your public git repo

#### Test Cases

 1.  Test cases:
     
     Functional Test Cases:
     	
     1.  Check user is able to select pizza with different sizes
     2. Verify selecting toppings (Topping 1 and Topping 2)
     3. Verify dropdown is closing after selecting the pizza the and toppings
     4. Verify minimum and maximum number of quantities
     5. Verify user is allowed to select toppings based on the pizza selection
     6. Check cos is updating with pizza size and quantity
     7. Check mandatory fields are required (Name, Phone)
     8. Verify minimum and maximum length of the fields: Name, Email and Phone
     9. Check with Invalid email and phone number
     10. Check user is able to select only one radio button at a time
     11. Verify success message by clicking on place order 
     12. Verify data is resetting when clicking on reset button
     13. Verify popup window is displaying with appropriate message 
     14. Verify popup window has close button and it is displayed and enabled
     15. Enter mandatory fields and check the error message
     16. Verify total cost is reflecting on the pop up window
     17. Update page details before submitting the order
     18. Verify user data is not wiping out after page refresh 
     
     Ui test cases/ non-functional:
     1. Verify website is supporting in cross browser and cross device 
     2. Check styles/font/size and color of the page elements
     3. Verify page alignements 
     4. Check page background 
     5. Check mandatory fields are indicated with star icon
     6. Verify Place order and Reset buttons are displaying in Blue color
     7. Check page title is displayed in center or not
     8. Check page is scrollable
     
     Usability testing:
     1. Check webpage is user friendly
     
     Performance/ load test:
     1. Verify page load time 
     2. Check how much time it is taking to process the order
     3. Verify page load time after clicking place order and reset buttons
     4. Order continuously and see how website is behaving 
     
     Security:
     1. Check user data is secured
     2. Verify credit card information is encrypted and secured
     3. Check page calls secured 
     4. Check any network errors on the page
     5. Check credit card details are valid before confirming the order
     6. Check user entered valid email id or not
     
     Boundary tests:
     1. Enter invalid phone number and credit card information
     2. Enter string and numeric and special character in below fields: Quantity, name,  email and phone number fields
     3. Enter invalid credit card information/ expired 
     
     Defects:
     1. Unable to enter credit card details on the page
     2. Cost is not reflecting on the page
     3. User should not be allowed to select topping when pizza type does not has any toppings
     4. Clicking on reset button entire page is not resetting 
     5. User should not allow to select more than one radio button
     




