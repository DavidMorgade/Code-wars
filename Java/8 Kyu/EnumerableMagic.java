/*
Create a function that accepts a list/array and a number n, and returns a list/array of the first n elements from the list/array.

If you need help, here's a reference:

https://docs.oracle.com/javase/6/docs/api/java/util/Arrays.html#copyOfRange(int[],%20int,%20int)
*/


public class ZywOo {
  public static int[] take(int[] arr, int n) {
    if(n > arr.length) n = arr.length;
    int[] solution = new int[n];
    if(arr.length == 0) return new int[]{};
    for(int i = 0; i < n; i++) {
      if(arr.length > i) {
        solution[i] = arr[i];
      }
    }
    return solution;
  }
}
