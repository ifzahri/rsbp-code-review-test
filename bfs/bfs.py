from collections import deque

def bfs(graph, start_node):
    visited = set()
    queue = deque([start_node])
    result = []

    while queue:
        node = queue.popleft()
        if node not in visited:
            visited.add(node)
            result.append(node)
            queue.extend(graph[node])
    
    return result

# Example graph
graph = {
    0: [1, 2],
    1: [0, 3, 4],
    2: [0, 5],
    3: [1],
    4: [1],
    5: [2],
    6: [7],
    7: [6, 8],
    8: [7, 9],
    9: [8]
}

print(bfs(graph, 0))
