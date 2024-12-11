import java.util.*;

public class bfs {
    public static List<Integer> bfs(Map<Integer, List<Integer>> graph, int startNode) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        queue.add(startNode);
        
        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (!visited.contains(node)) {
                visited.add(node);
                result.add(node);
                queue.addAll(graph.getOrDefault(node, new ArrayList<>()));
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(0, 3, 4));
        graph.put(2, Arrays.asList(0, 5));
        graph.put(3, Arrays.asList(1));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));
        graph.put(6, Arrays.asList(7));
        graph.put(7, Arrays.asList(6, 8));
        graph.put(8, Arrays.asList(7, 9));
        graph.put(9, Arrays.asList(8));
        
        System.out.println(bfs(graph, 0));
    }
}
