/*

Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').

Examples:

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']

*/



public class SplitStrings {
    public static String[] solution(String s) {
      if(s.length() % 2 != 0) s += "_";
      return s.split("(?<=\\G.{2})");
    }
}