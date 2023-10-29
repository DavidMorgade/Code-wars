/*
 * Create a method that takes as input a name, city, and state to welcome a person. Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

Example:

['John', 'Smith'], 'Phoenix', 'Arizona'

This example will return the string Hello, John Smith! Welcome to Phoenix, Arizona!

 */

public class WelcomeCity {

  public String sayHello(String[] name, String city, String state) {
    String finalName = "";
    for (int i = 0; i < name.length; i++) {
      if (i == name.length - 1) {
        finalName += name[i];
      } else {
        finalName += name[i] + " ";
      }
    }
    return "Hello, " + finalName + "! Welcome to " + city + ", " + state + "!";
  }
}
