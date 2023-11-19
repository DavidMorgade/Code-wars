// Task

// Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).

// The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.

// Mind the input validation.
// Example

// { 6, 2, 1, 8, 10 } => 16
// { 1, 1, 11, 2, 3 } => 6

// Input validation

// If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.
// Fundamentals

import org.apache.commons.lang3.ArrayUtils;

public class HighestAndLowest {
    public static int sum(int[] numbers) {
        if(numbers == null || numbers.length == 0) {
            return 0;
        }

        int lowest = numbers[0], highest = numbers[0], sum = 0;
        for(int i = 1; i<numbers.length; i++) {
                if(numbers[i] < lowest) {
                        lowest = numbers[i];
                }
                if(numbers[i] > highest) {
                        highest = numbers[i];
                }
        }
        int[] removeElement = ArrayUtils.removeElement(numbers, lowest);
        int[] array = ArrayUtils.removeElement(removeElement, highest);
        for(int i = 0; i<array.length;i++) {
                sum += array[i];
        }
        return sum;
    }
}