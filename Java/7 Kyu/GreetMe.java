/*
Write a method that takes one argument as name and then greets that name, capitalized and ends with an exclamation point.

Example:

"riley" --> "Hello Riley!"
"JACK"  --> "Hello Jack!"
*/

public class GreetMe{
  public static String greet(String name) {
    String firstLetterUpperCase = name.substring(0, 1).toUpperCase();
    String nameCapitalized = firstLetterUpperCase + name.substring(1).toLowerCase();
    return "Hello " + nameCapitalized + "!";
  }
}
