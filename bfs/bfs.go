package main

import (
	"fmt"
)

func bfs(graph map[int][]int, startNode int) []int {
	visited := make(map[int]bool)
	queue := []int{startNode}
	result := []int{}

	for len(queue) > 0 {
		node := queue[0]
		queue = queue[1:]

		if !visited[node] {
			visited[node] = true
			result = append(result, node)
			queue = append(queue, graph[node]...)
		}
	}

	return result
}

func main() {
	graph := map[int][]int{
		0: {1, 2},
		1: {0, 3, 4},
		2: {0, 5},
		3: {1},
		4: {1},
		5: {2},
		6: {7},
		7: {6, 8},
		8: {7, 9},
		9: {8},
	}

	fmt.Println(bfs(graph, 0))
}
