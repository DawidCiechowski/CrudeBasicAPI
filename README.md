# Crude Basic API

## Table of Contents

- [ Introduction ](#intro)
- [ Technologies ](#tech)
- [ Usage ](#usage)

<a name="intro"></a>
## Introduction
This project is my first attempt in creating an API using SpringBoot framework, to understand the basic REST concepts and use them in the future, when creating other forms of API.
The project itself is a databsae of employees and revolves around obtaining information about them, as well as updating, adding new ones, etc.

<a name="tech"></a>
## Technologies

- Java 11
- SpringBoot 2.3.1
- Javax Persistence 2.2
- Maven Build

<a name="usage"></a>
## Usage

The build itself does not connect to any database, but rather uses a List of objects, acting as pseudo database, without any persistence. Hence in ** LoadDatabase.java ** file, there are always two entries added, when the application has been ran.

### Clone the repository

To use the project, first clone the project into the repository on your system.
```
$ git clone https://github.com/DawidCiechowski/CrudeBasicAPI.git
```
After you've done that, the project can be run locally. 

### Testing the application

By default, SpringBoot applications run on port 8080. This can be changed in application.properties via:
Personally, I would recommend POSTMAN application for testing the application, however all the methods can be executed via CURL command in the commmand propmt.

```
server.port = {YOUR_PORT_NUMBER_HERE}
```

#### GET Request ALL Employees

```
$ curl localhost:8080/employees
```

#### GET Request Single Employee

```
$ curl localhost:8080/employees/{employee_id}
```

#### POST Request Add Employee

```
$ curl -d "name="Dawid Ciechowski&role="Software Developer" -X POST localhost:8080/employees
```

#### DELETE Request Employee by ID

```
$ curl -X DELETE localhost:8080/employees/{id}
```

### UPDATE Request Employee by ID

```
% curl -d "name=Dawid Ciechowski"&role="New Role" -X PUT localhost:8080/employees/{id}
```

