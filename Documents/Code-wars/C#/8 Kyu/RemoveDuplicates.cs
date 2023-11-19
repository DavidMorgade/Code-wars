/*
Define a function that removes duplicates from an array of non negative numbers and returns it as a result.

The order of the sequence has to stay the same.

Examples:

Input -> Output
[1, 1, 2] -> [1, 2]
[1, 2, 1, 1, 3, 2] -> [1, 2, 3]
*/

using System;
using System.Collections.Generic;

namespace Solution
{
  public static class Program
  {
    public static int[] distinct(int[] a)
    {
        HashSet<int> uniqueNumbers = new HashSet<int>(a);
      
        return new List<int>(uniqueNumbers).ToArray();     
    }
  }
}
