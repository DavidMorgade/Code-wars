/*

Description:

We want to generate a function that computes the series starting from 0 and ending until the given number.

Example:
Input:

> 6
Output:

0+1+2+3+4+5+6 = 21

Input:

> -15
Output:

-15<0

Input:

> 0
Output:

0=0

*/

using System;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Hello World");
		string sequence = ShowSequence(0);
		Console.WriteLine(sequence);
	}
	public static string ShowSequence(int n)
	{   
		string sequence = "";
		int sum = 0;
		if(n == 0)
		{
			return "0=0";
		}
		if(n < 0)
		{
			return $"{n}<0";
		}
		for(int i = 0; i <= n; i++)
		{
			if(i == 0)
			{
				sequence = sequence += i;
			}
			else 
			{
				sum+=i;
				sequence = sequence += $"+{i}";
			}
		}
		sequence += $" = {sum}";
		return sequence;
	}
}
