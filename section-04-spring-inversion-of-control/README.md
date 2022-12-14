## Spring Inversion of Control

### What is Inversion of Control?

- The approach of outsourcing the construction and management of objects

### Coding Scenario

- We will build a MyApp class which executes a getDailyWorkout() method from a BaseballCoach class
- The app should be configurable and the BaseballCoach should substitutable

#### Code Demo 1

A BaseballCoach class was created:


		public class BaseballCoach {
			public String getDailyWorkout() {
				return "Spend 30 minutes on batting practice";
			}
		}

A MainApp class was created:

		public class MyApp {
			public static void main(String[] args) {
				
				// create the object
				BaseballCoach theCoach = new BaseballCoach();
				
				// use the object
				System.out.println(theCoach.getDailyWorkout());
			}
		}

- The code was then refactored to use a Coach interface which the BaseballCoach implemented

- This change allows the coach to be substitutable but the app is not configurable, i.e. we should be able to change configuration rather than source code

#### Ideal Solution

- Spring provides a object factory using a Spring Container which is configurable

- We can configure a Spring container in 3 ways:

1) XML configuration (legacy but lots of apps use it)

2) Java annotations

3) Java Source Code

- Spring Development Process:

1) Configure your Spring Beans
2) Create a Spring Container
3) Retrieve Beans from Spring Container