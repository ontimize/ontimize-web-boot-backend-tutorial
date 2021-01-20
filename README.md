
# Ontimize Boot
This branch contains the project that generates the Ontimize Boot backend.

- The command to create an application using this archetype is the following:

	    mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generate -DgroupId=YOUR_GROUP_ID -DartifactId=YOUR_ARTIFACT_ID -Dversion=YOUR_VERSION -DarchetypeGroupId=com.ontimize -DarchetypeArtifactId=ontimize-boot -DarchetypeVersion=1.0.0 -DinteractiveMode=false -DarchetypeCatalog=https://artifactory.imatia.com/public-artifactory/ontimize-archetypes/archetype-catalog.xml

- Enter the parent directory and run an install:
	
		mvn install

## Start the database

 Enter the `model` folder and execute the command

		mvn exec:java -Prun_database
	
## Start the server: 
 - Go to the `boot` folder and run the command

		mvn spring-boot:run
	
Use the following URL to access the [https://localhost:33333/](https://localhost:33333/) application 
