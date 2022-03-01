# RESTAPITest
This project is developed with Rest Assured Libraryfor API Testing

**IDE** : Eclipse,<br />
**Programming Language** : Java,<br />
**Library Used** : Rest Assured , TestNG<br />
**Build Tool** : Maven<br />


## How to Clone project:
1. Download and Install Git from https://git-scm.com/downloads,<br />
2. Navigate to computer drive<br />
3. Open command prompt<br />
3. Enter command git clone <br />

## Install Maven build tool
1. Download Apache Maven<br />
2. Set enviornment variable path<br />

## How to Run Project:
**First Way**
1. Open command prompt <br />
2. Navigate to the project directory, where you are able to see project files and pom.xml<br />
3. Execute pom. xml file with command **mvn clean test** <br />

**Second Way**
1. Import the maven existing project in eclipse editor<br />
2. Right click on project and run as with mvn test<br />

**Third Way**
1. Right click on project and run as with testng test<br />


## How to access report
1. Once the execution is done<br />
2. if project is run with maven then go to project directory>target>surefire-reports>index.html<br />
3. if project is run with maven then go to project directory>test-output>index.html<br />
4. for now we are using default testng report but we can use extent report library<br />

## Project Structure:

1. com.APITests : Test cases<br />
2. com.base : base folder whicch contains base class<br />
3. com.Resources : Payload json file<br />
5. com.Utility : Reusable utility<br />
6. testng.xml : testng executable file<br />
