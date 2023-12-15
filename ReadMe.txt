# Table of Contents
1. General Project Info
2. Goals
3. Assumptions
4. Deliverables
5. Technologies Used
6. Running the Application
7. Answers to Project Questions

General Info:

This is the MagMutual Take Home Project, coded by Aleks Belotserkovskaya.

Goals:

1. Build Microservice that exposes endpoints to return the following info:

- Endpoint to return a specific user + all associated user information.
- Endpoint to return a list of users created between a date range.
- Endpoint to return a list of users based on a specific profession.
- Custom Endpoint (I chose to return a list of users from a specific country).

2. Read the given CSV file as input.

3. Build a simple UI to display the information.

Assumptions:

You can build it in any language/framework combination.

Deliverables:

- Source code.
- Answers to project questions.

Technologies:

A list of technologies used within the project:

- Java (backend logic + mapping endpoints)
- Spring Framework (created a Spring Boot application)
- HTML (very basic UI)
- thymeleaf (Java XML/XHTML/HTML5 template engine)
- JUnit + Jupiter for Unit Tests
- GitHub for version control. 

Running the Application:

cd into the project's root directory in terminal 
and run the following command: 

./mvnw spring-boot:run

Answers to Project Questions:

1. What did you think of the project?

The project was a good exercise in building a small web application from the ground up. 
It was a manageable amount of work for the given timeline. 

There are definitely some changes and updates I would implement if given more time to work on it, 
but those will be outlined in the below answers. 

2. What didn’t you like about the project?

There was not a set rubric or way of knowing if I am meeting the project criteria, 
other than the basic list of deliverables. 

Otherwise, the project was pretty similar to the type of work I am used to doing day-to-day, 
so not an unreasonable ask. 

3. How would you change the project or approach?

Future Changes / Additions to my Approach:

Most of what I would change about my approach would just be cleaning up and making the code more scalable. 

With the given timeline, I did not have time to successfully pull the list of countries and list of professions 
for the dropdown menus, so instead, I had to hardcode those select options, which of course is not ideal. 
In the long run, I would instead make this info based off of the CSV file data, so that the options can change if needed. 

Other than making more of the data dynamic instead of hardcoded, 
I would add more input validation and error / exception management. 
For example, I would want to check for errors in input and allow for a wider range of CSV files as input, 
rather than assuming that certain columns hold specific data. 
I would also want to make inputting multiple CSV files an option.

Data Storage: 

In terms of data storage, once the data is read into the StoreUserData class, 
it is then held in a mix of ArrayLists and HashMaps. 
If this program were to be used in the long run, I would definitely replace that structure 
with use of a database that could be queried for this same information. 

Testing: 

I created some JUnit tests but did not flesh them out as in-depth as I wanted to. 
Given more time, I would go more into detail with these tests and check all possible edge cases. 

User Interface: 

Finally, I would definitely make the UI look better - I did not use CSS or much Javascript here 
since the project asked for a simple UI. I just focused on the logic and making sure the endpoints worked as expected. 

4. Anything else you would like to share?

More thoughts:

Ideas for additional endpoints, verification and error messages: 

- incorrect city/country combo in CSV file
- how to allow for user to input csv file + check for incorrect columns or data or format
- no user found, wrong spelling of name, etc.
- endpoints to mix search options, such as search for users by profession AND country 
	
Ideas for improving UI: 
 
- add more buttons to screen for ease of usability 
- add CSS to make it easier to use and more aesthetically pleasing 
	
Ideas for additional functionality:

- maybe when a list appears, a user could click button next to each listed user to see their full info 
  (probably too complex to do by project deadline)
	
Overall future TO DO's: 

- change drop downs to not be static and instead of pulling info from csv file (for countries + professions)
- add database storage instead of storing inside of the StoreUserData class.