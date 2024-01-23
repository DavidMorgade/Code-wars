// Find the number with the most digits.

// If two numbers in the argument array have the same number of digits, return the first one in the array.


export class Kata {
    public static findLongest(array:number[]):number {
        let longest:number = 0;
        for (let i = 0; i < array.length; i++) {
            if (array[i].toString().length > longest.toString().length) {
            longest = array[i];
            }
        }
        return longest;
    }
  }