/*
Take an array and remove every second element from the array. Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
*/


using System;
using System.Collections.Generic;
					
public class Program
{
	public static void Main()
	{
		Console.WriteLine("Hello World");
		object[] prueba = {5, 4, 3, 4, 3, 4};
		object[] prueba2 = RemoveEveryOther(prueba);
		foreach(object p in prueba2)
		{
			Console.WriteLine(p);
		}
	}
	
	public static object[] RemoveEveryOther(object[] arr)
    {
    	List<object> result = new List<object>();
		for(int i = 0; i < arr.Length; i++)
		{
			if(i % 2 == 0)
			{
				result.Add(arr[i]);
			}
		}
		return result.ToArray();
    }
}
