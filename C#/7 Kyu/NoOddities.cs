/*
Write a small function that returns the values of an array that are not odd.

All values in the array will be integers. Return the good values in the order they are given.
*/


using System.Collections.Generic;


public class NoOddities
{
    public static int[] NoOdds(int[] values) 
    {
        List<int> resultado = new List<int>();
        foreach(int n in values) {
          if(n % 2 == 0) {
            resultado.Add(n);
          }
        }
        return resultado.ToArray();
    }
}
