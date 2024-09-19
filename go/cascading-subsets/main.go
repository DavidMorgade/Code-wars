package main

import "fmt"

func main() {

	fmt.Println(EachCons([]int{1, 2, 3, 4}, 2))

}

func EachCons(arr []int, n int) [][]int {

	if n <= 0 || n > len(arr) {
		return [][]int{}
	}

	var result [][]int

	for i := 0; i <= len(arr)-n; i++ {
		subset := arr[i : i+n]
		result = append(result, subset)
	}

	return result

}
