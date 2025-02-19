/*
Task:
Given a list of integers, determine whether the sum of its elements is odd or even.

Give your answer as a string matching "odd" or "even".

If the input array is empty consider it as: [0] (array with a zero).

Examples:
Input: [0]
Output: "even"

Input: [0, 1, 4]
Output: "odd"

Input: [0, -1, -5]
Output: "even"
Have fun!
*/


using System;
					
public class Program
{
	public static void Main()
	{
		int[] nums = {2, 3, 3};
		String result = OddOrEven(nums);
		Console.WriteLine(result);
	}
	public static string OddOrEven(int[] array)
	{
		int sum = 0;
		foreach(int num in array)
		{
			sum += num;
		}
		return sum % 2 == 0 ? "even" : "odd";
	}
}
