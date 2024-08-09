import java.util.*;

public class Dijkstra {
    public static void main(String[] args) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        graph.put(0, Map.of(1, 2, 2, 3, 3, 9, 4, 6));
        graph.put(1, Map.of(2, 1, 3, 7));
        graph.put(2, Map.of(4, 3));
        graph.put(3, Map.of(4, 2));
        graph.put(4, new HashMap<>());

        int source = 0;
        Map<Integer, Integer> distances = dijkstra(graph, source);
        System.out.println(distances);
    }

    public static Map<Integer, Integer> dijkstra(Map<Integer, Map<Integer, Integer>> graph, int source) {
        Map<Integer, Integer> distances = new HashMap<>();
        for (int vertex : graph.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(source, 0);
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        priorityQueue.add(new int[]{0, source});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int currentDistance = current[0];
            int currentVertex = current[1];

            if (currentDistance > distances.get(currentVertex)) {
                continue;
            }

            for (Map.Entry<Integer, Integer> neighbor : graph.get(currentVertex).entrySet()) {
                int neighborDistance = currentDistance + neighbor.getValue();
                if (neighborDistance < distances.get(neighbor.getKey())) {
                    distances.put(neighbor.getKey(), neighborDistance);
                    priorityQueue.add(new int[]{neighborDistance, neighbor.getKey()});
                }
            }
        }

        return distances;
    }
}
