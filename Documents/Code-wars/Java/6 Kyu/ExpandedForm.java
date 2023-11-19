/*
 * Write Number in Expanded Form

You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"

NOTE: All numbers will be whole numbers greater than 0.

If you liked this kata, check out part 2!!

 */

public class ExpandedForm {

  public static String expandedForm(int num) {
    String numStr = String.valueOf(num);
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < numStr.length(); i++) {
      int digit = Character.getNumericValue(numStr.charAt(i));
      if (digit != 0) {
        int zeros = numStr.length() - i - 1;
        result.append(digit * (int) Math.pow(10, zeros));
        if (i < numStr.length() - 1 && num % 10 != 0) {
          result.append(" + ");
        }
      }
    }

    return result.toString();
  }
}
