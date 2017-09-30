Getting Started: These instructions will get you a copy of the project up and running on your local machine for development and testing purposes To get started, you can download the project (zip).

Prerequisites: What things you need to install to run this test?

Java ? Install JDK and JRE ? Setup JDK path into IDE ? Set System Variable for JDK
Intellij IDE with ? Maven Integration ? Set java as your project SDK
WebDriver (Chrome, Firefox, IE, etc) ? Install selenium-server-standalone 2.53.1 jar file
Drivers ? Chromedriver (now is packaged with the project) ? Firefox driver IS actually packaged with the Selenium jar. ? IEDriver (now is packaged with the project)
How to run the test: ? Launch your IDE, and locate the file "Valtech\src\test\java\com\Valtech\TestSuit.java". ? This is a very short simple test. Right click the file “TestSuit” file and run the Test.  By default it will run into chrome browser. ? To swtich the driver, go into config.properties file and change the browser property to firefox or IE



Summery of my automation framework:-

I Have used PageObjectModel for Automation

BrowserSelectorClass helps to create Selenium Browser instance.

Utils  class holds all the reusable methods

BaseTest class holds Before and After methods - which will run with each test

All the tests can be executed from TestSuit class
