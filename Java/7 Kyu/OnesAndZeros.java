/*
Given an array of ones and zeroes, convert the equivalent binary value to an integer.

Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1.

Examples:

Testing: [0, 0, 0, 1] ==> 1
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 0, 1] ==> 5
Testing: [1, 0, 0, 1] ==> 9
Testing: [0, 0, 1, 0] ==> 2
Testing: [0, 1, 1, 0] ==> 6
Testing: [1, 1, 1, 1] ==> 15
Testing: [1, 0, 1, 1] ==> 11
However, the arrays can have varying lengths, not just limited to 4.
*/


import java.util.List;


public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
      String number = "";
      for(Integer num : binary) {
        number+= String.valueOf(num);
      }
      return StringBinaryToDecimal(number);
    }
      public static int StringBinaryToDecimal(String s)
    {
        int ans = 0, i, p = 0;
 
        // length of String
        int len = s.length();
 
        // Traversing the String
        for (i = len - 1; i >= 0; i--) {
 
            if (s.charAt(i) == '1') {
                // Calculating Decimal Number
                ans += Math.pow(2, p);
            }
            // incrementing value of p
            p++;
        }
        return ans;
    }
}
