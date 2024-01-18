/*
Your task is to write a function that does just what the title suggests (so, fair warning, be aware that you are not getting out of it just throwing a lame bas sorting method there) with an array/list/vector of integers and the expected number n of smallest elements to return.

Also:

    the number of elements to be returned cannot be higher than the array/list/vector length;
    elements can be duplicated;
    in case of duplicates, just return them according to the original order (see third example for more clarity).

Same examples and more in the test cases:

FirstNSmallest(new []{1,2,3,4,5},3) == new []{1,2,3}
FirstNSmallest(new []{5,4,3,2,1},3) == new []{3,2,1}
FirstNSmallest(new []{1,2,3,4,1},3) == new []{1,2,1}
FirstNSmallest(new []{1,2,3,-4,0},3) == new []{1,-4,0}
FirstNSmallest(new []{1,2,3,4,5},0) == new int[0]
*/

using System;
using System.Linq;

class SmalestElements
{
    public static int[] FirstNSmallest(int[] arr, int n)
    {
        var list = arr.ToList();

        while (list.Count > n)
        {
            int max = list.Max();

            int index = list.LastIndexOf(max);

            list.RemoveAt(index);
        }
        return list.ToArray();
    }
}