package main

//
// Given the triangle of consecutive odd numbers:
//
//              1
//           3     5
//        7     9    11
//    13    15    17    19
// 21    23    25    27    29
// ...
// Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
//
// 1 -->  1
// 2 --> 3 + 5 = 8

import (
	"fmt"
)

func main() {
	fmt.Println(RowSumOddNumbers(2))

}

func RowSumOddNumbers(n int) int {
	firstOddNumber := n*(n-1) + 1
	sum := 0

	for i := 0; i < n; i++ {
		sum += firstOddNumber + 2*i
	}
	return sum
}
