# Setting Up Your Development Environment

## Installing Eclipse and Tomcat

- I installed JDK 8 on my machine and added set the Java Path variable from this tutorial: https://www.geeksforgeeks.org/how-to-set-java-path-in-windows-and-linux/

- I installed the latest version eclipse for enterprise developers

- I installed Tomcat 9 to use as a webserver as recommended by the course

- I had to enable the server view in perspective which then brought up the window which enabled me to connect to the Tomcat server

## Spring 5 Jar Files

- We will not use Maven yet for simplicity

I created a Java project in the section-03-setting-up-dev-environment directory using Java 11 RTE.

- I downloaded the dependencies from [here](https://repo.spring.io/ui/repos/tree/General/) and navigated to libs-release>org>springframework>spring>5.3.8>spring-5.3.8-dist.zip


- I unzipped the folder and took the files from the lib folder and added it to the lib folder in spring-demo-one folder

- I created a new Java project with name 'spring-demo-one' and create a folder named 'lib' to be alongside src folder