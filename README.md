## OOAD Project 3 
#### Team members:
Ruijiang Ma chma2866@colorado.edu</br>Tongxin Zhu tozh3775@colorado.edu
#### Language and environment:
Java</br>
IntelliJ IDEA
#### Comments or assumptions made for development:
In this project, we have a Store file which basically defines functions our store suppose to have like printing out daily summary or check if there is anything left. We have a Roll class including Spring roll, Sausage roll, Pastry roll, Jelly roll, and Egg roll subclassess which define number and price of each type of rolls. We have a Customer class including Casual customers, Business customers, and Catering customers which define how many and what type of rolls does each type of customers want. We use Factory, Decorator, and Observer design patterns as we discussed in class and we make comments in files which could help clarifying how we are using them. We have a Customer Factory and a Roll Factory generate different customers and rolls based on their type. We have a Counter class which is our observer keeps other objects informed about the number each type of rolls selled by each type of customers. And we have a Main file which is the entry that users can run our project. 
#### Issues encountered during development:
It is our first time to use JUnit test methods so It is hard for us to unit tests.
#### Any special instructions to run the application:
Users can navigate to the main class, hit the play button in IntelliJ IDEA, and input the a number of days, then the outputs should be displayed in the output panel.
