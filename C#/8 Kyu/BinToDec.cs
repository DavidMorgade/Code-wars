/*
Complete the function which converts a binary number (given as a string) to a decimal number.
*/

using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Hello World");
	}
	public static int binToDec(string s)
    {
      return Convert.ToInt32(s, 2);
    }
}
