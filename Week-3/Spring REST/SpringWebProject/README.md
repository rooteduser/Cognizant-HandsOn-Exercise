# SpringWebProject — Spring REST Handson 1

## Exercises Covered
- **Create a Spring Web Project using Maven**
- **Spring Core – Load Country from Spring Configuration XML**

## Overview
Demonstrates creating a Maven project and loading a `Country` bean from an
XML-based Spring configuration file (`applicationContext.xml`).

## How to Run
```bash
mvn compile exec:java -Dexec.mainClass="com.cognizant.rest.Main"
```

## Expected Output
```
=== Spring Core – Load Country from XML Config ===
Country loaded from Spring context:
Country{code='IN', name='India', capital='New Delhi'}
```

## Project Structure
```
SpringWebProject/
  pom.xml
  src/main/java/com/cognizant/rest/
    Country.java        ← Bean class
    Main.java           ← Loads context and prints bean
  src/main/resources/
    applicationContext.xml  ← Bean defined via XML
```
