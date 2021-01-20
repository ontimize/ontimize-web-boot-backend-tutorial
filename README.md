
# Ontimize Boot
This branch contains the project that generates the Ontimize Boot backend for Ontimize Web Tutorial.

- Enter the parent directory and run an install:
	
		mvn install

## Start the database

 Enter the `model` folder and execute the command

		mvn exec:java -Prun_database
	
## Start the server: 
 - Go to the `boot` folder and run the command

		mvn spring-boot:run
	
Use the following URL to access the [https://localhost:8080/bankmanager-jee/services/rest/](https://localhost:8080/bankmanager-jee/services/rest/) application 
