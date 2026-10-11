# Spring Java-Based Configuration - Employee Management

## Project Description

This project demonstrates Java-based configuration in the Spring Framework using the `@Configuration` and `@Bean` annotations.

The application creates an Employee object, assigns employee details such as ID, name, and salary, and displays the details using the Spring IoC container.

## Technologies Used

- Java
- Spring Framework
- Spring IoC Container
- Java-Based Configuration
- Eclipse IDE
- Maven

## Package Structure

```text
javacon.demo
│
├── MainApp.java
├── Employee.java
└── Addconfig.java
```

## Classes Description

### 1. MainApp.java

- Contains the `main()` method.
- Creates the Spring IoC container using `AnnotationConfigApplicationContext`.
- Loads the `Addconfig` configuration class.
- Retrieves the Employee bean using `getBean(Employee.class)`.
- Calls the `display()` method to print employee details.

### 2. Employee.java

- Defines the Employee class.
- Contains three properties: `id`, `name`, and `salary`.
- Uses setter methods to assign employee details.
- Contains the `display()` method to print the employee information.

### 3. Addconfig.java

- Uses the `@Configuration` annotation to declare a Spring configuration class.
- Uses the `@Bean` annotation to register the Employee object as a Spring bean.
- Creates an Employee object and assigns the following values:
  - Employee ID: 101
  - Employee Name: Artha
  - Employee Salary: 40000

## How It Works

1. The application starts from the `main()` method in `MainApp.java`.
2. `AnnotationConfigApplicationContext` loads the `Addconfig` class.
3. Spring executes the `employee()` method to create and register the Employee bean.
4. `getBean(Employee.class)` retrieves the Employee bean from the Spring container.
5. The `display()` method prints the employee details.

## Output

```text
emp id: 101
emp name :Artha
emp salary : 40000.0
```

## Key Concepts

- **Spring IoC Container:** Creates and manages Spring beans.
- **`@Configuration`:** Marks a class as a source of bean definitions.
- **`@Bean`:** Registers the object returned by a method as a Spring bean.
- **`AnnotationConfigApplicationContext`:** Creates a Spring application context using Java configuration.
- **`getBean()`:** Retrieves a bean from the Spring container.

## How to Run the Project

1. Open the project in Eclipse IDE.
2. Ensure that the required Spring dependencies are configured in `pom.xml`.
3. Verify that all three Java classes are in the `javacon.demo` package.
4. Open `MainApp.java`.
5. Run the program as a Java Application.
6. Check the Console to view the employee details.

## Conclusion

This project demonstrates how to configure and manage Java objects using Spring Java-based configuration. The `@Configuration` and `@Bean` annotations allow Spring to create and manage the Employee object without using an XML configuration file.
