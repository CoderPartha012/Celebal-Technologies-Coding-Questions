import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Initialize map to count connections for each user
        Map<Integer, Integer> connections = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            connections.put(i, 0);
        }

        // Count connections for each user
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            connections.put(u, connections.get(u) + 1);
            connections.put(v, connections.get(v) + 1);
        }

        // Find maximum connection count
        int maxConnections = Collections.max(connections.values());

        // Output user IDs with maximum connection count
        List<Integer> influentialUsers = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : connections.entrySet()) {
            if (entry.getValue() == maxConnections) {
                influentialUsers.add(entry.getKey());
            }
        }
        Collections.sort(influentialUsers);
        for (int user : influentialUsers) {
            System.out.print(user + " ");
        }
    }
}