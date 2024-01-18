/*
Given an array (a list in Python) of integers and an integer n, find all occurrences of n in the given array and return another array containing all the index positions of n in the given array.

If n is not in the given array, return an empty array [].

Assume that n and all values in the given array will always be integers.

Example:

Kata.FindAll(new int[] {6, 9, 3, 4, 3, 82, 11}, 3) => new int[] {2, 4}

*/

public class FindOcurrences
{
    public static int[] FindAll(int[] array, int n)
    {
        List<int> concurrences = new List<int>();
        for (int i = 0; i < array.Length; ++i)
        {
            if (array[i] == n)
            {
                concurrences.Add(i);
            }
        }
        if (concurrences.Count == 0)
        {
            return Array.Empty<int>();
        }
        return concurrences.ToArray();
    }
}