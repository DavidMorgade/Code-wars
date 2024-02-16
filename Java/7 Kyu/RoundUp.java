/*

Given an integer as input, can you round it to the next (meaning, "greater than or equal") multiple of 5?

Examples:

input:    output:
0    ->   0
2    ->   5
3    ->   5
12   ->   15
21   ->   25
30   ->   30
-2   ->   0
-5   ->   -5
etc.
Input may be any positive or negative integer (including 0).

You can assume that all inputs are valid integers.
*/

package com.codewars.hwtdstrngls;

public class RoundToTheNextMultipleOf5 {

  public static int roundToNext5(int number) {
    boolean finish = number % 5 == 0;
    while(!finish) {
      if(number % 5 == 0) return number;
      number++;
    }
    return number;
  }
}
