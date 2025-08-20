# UserDataPortal  

**GitHub**: [aabdullahsayed](https://github.com/aabdullahsayed)  

---

## Overview  
**UserDataPortal** is a Java web application that allows users to submit their **name** and **email** through an HTML form. The data is processed by a **Java Servlet** and stored in a **MySQL database**. The project runs on **Apache Tomcat 10+** and uses **JDBC** for database connectivity.  

---

## Technologies Used  
- Java Servlet (Jakarta Servlet API 6.0.0)  
- Apache Tomcat 10.1.43  
- MySQL  
- JDBC (Java Database Connectivity)  
- HTML  

---

## Project Structure  

The project folder **YourApp** is structured as follows:  

## Project Structure  

The **YourApp** project consists of the following main components:

- **index.html**: The static front-end form where users can input their name and email.  
- **src/com/example/UserServlet.java**: The Java servlet that handles form submissions and interacts with the database.  
- **WEB-INF/web.xml**: The deployment descriptor that maps URLs to servlets.  
- **WEB-INF/classes/com/example/UserServlet.class**: The compiled servlet generated from the Java source file.  
- **WEB-INF/lib/**: Contains required libraries including `mysql-connector-java.jar` (JDBC driver) and `jakarta.servlet-api.jar` (Servlet API).  

## Servlet Compilation  

To compile the servlet, run the following command:  

```bash
javac -cp .:mysql-connector-java.jar:jakarta.servlet-api.jar src/com/example/UserServlet.java
 
```

## Servlet Compilation  

To compile the servlet, run the following command:  

```bash
javac -cp .:mysql-connector-java.jar:jakarta.servlet-api.jar src/com/example/UserServlet.java

```
Note (Windows): Replace colons (:) with semicolons (;).

## How It Works  

1. User opens the form and submits data.  
2. Apache Tomcat receives the **POST** request.  
3. `web.xml` maps the request to **UserServlet**.  
4. The servlet extracts form data and connects to **MySQL**.  
5. A SQL `INSERT` query adds the user data to the database.  
6. The servlet returns a confirmation message.  

---

## Servlet Behavior  

- Checks database connection.  
- Uses `PreparedStatement` for secure queries.  
- Prints confirmation message based on insertion result.  
- Displays errors if any occur.  

---

## Getting Started  

1. Ensure **Apache Tomcat 10.1.43** and **MySQL** are installed.  
2. Place `mysql-connector-java.jar` and `jakarta.servlet-api.jar` in the `WEB-INF/lib/` directory.  
3. Compile the servlet using the provided command.  
4. Deploy the `YourApp` folder to Apache Tomcat’s `webapps` directory.  
5. Access the application via:  

## How It Works  

1. User opens the form and submits data.  
2. Apache Tomcat receives the **POST** request.  
3. `web.xml` maps the request to **UserServlet**.  
4. The servlet extracts form data and connects to **MySQL**.  
5. A SQL `INSERT` query adds the user data to the database.  
6. The servlet returns a confirmation message.  

---

## Servlet Behavior  

- Checks database connection.  
- Uses `PreparedStatement` for secure queries.  
- Prints confirmation message based on insertion result.  
- Displays errors if any occur.  

---

## Getting Started  

1. Ensure **Apache Tomcat 10.1.43** and **MySQL** are installed.  
2. Place `mysql-connector-java.jar` and `jakarta.servlet-api.jar` in the `WEB-INF/lib/` directory.  
3. Compile the servlet using the provided command.  
4. Deploy the `YourApp` folder to Apache Tomcat’s `webapps` directory.  
5. Access the application via:  

http://localhost:8080/UserDataPortal
