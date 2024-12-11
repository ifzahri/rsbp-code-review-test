#include <iostream>
#include <vector>
#include <queue>
#include <unordered_set>

using namespace std;

vector<int> bfs(vector<vector<int>>& graph, int startNode) {
    unordered_set<int> visited;
    queue<int> q;
    vector<int> result;

    q.push(startNode);

    while (!q.empty()) {
        int node = q.front();
        q.pop();

        if (visited.find(node) == visited.end()) {
            visited.insert(node);
            result.push_back(node);

            for (int neighbor : graph[node]) {
                q.push(neighbor);
            }
        }
    }

    return result;
}

int main() {
    vector<vector<int>> graph = {
        {1, 2}, {0, 3, 4}, {0, 5}, {1}, {1}, {2}, {7}, {6, 8}, {7, 9}, {8}
    };
    
    vector<int> result = bfs(graph, 0);

    for (int node : result) {
        cout << node << " ";
    }
    cout << endl;

    return 0;
}
