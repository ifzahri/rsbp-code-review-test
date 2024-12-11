function bfs(graph, startNode) {
    const visited = new Set();
    const queue = [startNode];
    const result = [];
    
    while (queue.length > 0) {
        const node = queue.shift();
        if (!visited.has(node)) {
            visited.add(node);
            result.push(node);
            queue.push(...graph[node]);
        }
    }
    return result;
}

// Example graph
const graph = {
    0: [1, 2],
    1: [0, 3, 4],
    2: [0, 5],
    3: [1],
    4: [1],
    5: [2],
    6: [7],
    7: [6, 8],
    8: [7, 9],
    9: [8],
};

console.log(bfs(graph, 0));
