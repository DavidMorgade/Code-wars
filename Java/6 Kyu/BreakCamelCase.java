/*

Complete the solution so that the function will break up camel casing, using a space between words.
Example

"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""

*/


class Solution {
  public static String camelCase(String input) {
    char camelLetter;
    String result = input;
    for(int i = 0; i < result.length(); i++) {
      camelLetter = result.charAt(i);
      if((int) camelLetter >= 65 && (int) camelLetter <= 90) {
        result = addChar(result, ' ', i);
        i++;
      }
    }
    System.out.println(result);
    return result;
  }
  public static String addChar(String str, char ch, int position) {
      return str.substring(0, position) + ch + str.substring(position);
  }
}