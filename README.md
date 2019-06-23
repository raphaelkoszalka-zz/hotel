## How to
Just import the project into IntelliJ and let Gradle do the rest.
To run, go to Gradle Tab and bootRun the application.

## To Do List (if I had more time)
- Security with Spring Security or Apache Shiro

## Project dependencies

- Gradle
- JDK 11
- Liquibase (Optional, but preferable if you would like to use other database than PostegreSQL)
- Spring Boot;
- Spring Boot Web;
- Spring Boot JPA;
- Any database, for this test I chose PostegreSQL for example.

## Endpoints
- /check-in/all (retrieve all check in) response:
```  
{
        "enterDate": "2019-01-30T08:00:00",
        "leaveDate": "2019-01-30T08:00:00",
        "vehicle": true,
        "bill": 0,
        "person": {
            "person_id": 1,
            "personName": "Raphael",
            "personDocument": "777.777.777-77",
            "personPhone": "77777-7777"
        }
    }
```
- /check-in/{check_in_id} (retrieve a single check in) response:
```  
{
        "enterDate": "2019-01-30T08:00:00",
        "leaveDate": "2019-01-30T08:00:00",
        "vehicle": true,
        "bill": 0,
        "person": {
            "person_id": 1,
            "personName": "Raphael",
            "personDocument": "777.777.777-77",
            "personPhone": "77777-7777"
        }
    }
```
- /check-in/post (post a new check in)

## Methods

##### Check-In POST example

```
{
  "enter_date" : "2019-06-21T08:00:00",
  "leave_date" : "2019-06-27T08:00:00",
  "vehicle" : false,
  "person_id" : 9,
  "bill" : 0,
  "name" : "Raphael Koszalka",
  "document" : "777.777.777-77",
  "phone" : "7777-7777"
}
```

## Project structure

- com.raphael.hotel
- com.raphael.hotel.persistence
- com.raphael.hotel.persistence.entities
- com.raphael.hotel.persistence.repositories
- com.raphael.hotel.core.controllers
- com.raphael.hotel.core.bo (business rules objects)

## Use of Lombok and Model Mapper
Since of other people might run the project without Lombok installed and 
also having only two small entities I chose to write my own getter and setters, 
otherwise I would have utilized @Getter and @Setter from Project Lombok.

And about ModelMapper, does not make sense to add another dependency
 to the project with such small entities.

## Agnostic database creation with Liquibase

In this project I chose to use Liquibase, an agnostic database update tool, where I have written
an YAML file containing all database tables. To run you must download Liquibase at https://www.liquibase.org/

And run the following command line:
```
java - jar liquibase {liquibase jar path} 
  --driver={database driver} 
  --classpath={database driver classpath}
  --changeLogFile={changeLog.yml path (the same file in this project root) 
  --url="jdbc:{jdbc driver url}/hotel" 
  --username={username} 
  --password={password}
update
```

### Any doubts
rmkoszalka@gmail.com