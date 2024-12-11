package main

import "fmt"

func fibonacci(n int) int {
	if n <= 1 {
		return n
	}
	return fibonacci(n-1) + fibonacci(n-2)
}

func main() {
	fmt.Println("Fibonacci numbers up to 10,000 in Go:")
	for i := 0; i < 10000; i++ {
		if fibonacci(i) < 10000 {
			fmt.Println(fibonacci(i))
		}
	}
}
