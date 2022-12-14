## Spring Inversion of Control

### What is Inversion of Control?

- The approach of outsourcing the construction and management of objects

### Coding Scenario

- We will build a MyApp class which executes a getDailyWorkout() method from a BaseballCoach class
- The app should be configurable and the BaseballCoach should substitutable

### Code Demo

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

The code was then refactored to use a Coach interface which the BaseballCoach implemented

This change allows the coach to be substitutable but the app is not configurable, i.e. we should be able to change configuration rather than source code