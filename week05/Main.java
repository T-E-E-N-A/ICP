import java.util.*;

public class Main {
    // Adjacency list to store the graph
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases

            while (t-- > 0) {
                int n = sc.nextInt(); // Number of nodes

                // Initialize Adjacency List
                adj.clear();
                for (int i = 0; i <= n; i++) {
                    adj.add(new ArrayList<>());
                }

                // Array to store degree of each node (number of connected edges)
                int[] degree = new int[n + 1];

                // Read edges
                for (int i = 0; i < n - 1; i++) {
                    int u = sc.nextInt();
                    int v = sc.nextInt();
                    adj.get(u).add(v);
                    adj.get(v).add(u);
                    degree[u]++;
                    degree[v]++;
                }

                // Step 1: BFS to assign parity (0 or 1) to each node based on distance from Start (Node 1)
                int[] nodeParity = new int[n + 1];
                Arrays.fill(nodeParity, -1);
                nodeParity[1] = 0; // Start node has parity 0

                Queue<Integer> bfsQ = new LinkedList<>();
                bfsQ.add(1);

                while (!bfsQ.isEmpty()) {
                    int u = bfsQ.poll();
                    for (int v : adj.get(u)) {
                        if (nodeParity[v] == -1) {
                            nodeParity[v] = 1 - nodeParity[u]; // Flip parity (0->1, 1->0)
                            bfsQ.add(v);
                        }
                    }
                }

                // Step 2: Initialize Queue for Leaf Nodes (Topological Sort)
                // We add all nodes with degree 1, EXCEPT the destination node 'n'
                Queue<Integer> leaves = new LinkedList<>();
                for (int i = 1; i <= n; i++) {
                    if (degree[i] == 1 && i != n) {
                        leaves.add(i);
                    }
                }

                // List to store our operations
                ArrayList<String> outputList = new ArrayList<>();
                int catState = 0; // Tracks if total moves made are even (0) or odd (1)

                // Step 3: Process the leaves (remove nodes one by one)
                // We process exactly n-1 nodes (everyone except 'n')
                for (int i = 1; i < n; i++) {
                    int u = leaves.poll();

                    // Move 1: Always force a move before deleting
                    outputList.add("1");
                    catState = 1 - catState;

                    // SAFETY CHECK:
                    // If current catState matches the nodeParity[u], the Cat MIGHT be at node u.
                    // We must perform an extra move to break the synchronization.
                    if (catState == nodeParity[u]) {
                        outputList.add("1");
                        catState = 1 - catState;
                    }

                    // Move 2: Delete the node u
                    outputList.add("2 " + u);

                    // Update neighbors (reduce their degree)
                    for (int v : adj.get(u)) {
                        degree[v]--;
                        // If neighbor becomes a new leaf (and isn't the destination), add to queue
                        if (degree[v] == 1 && v != n) {
                            leaves.add(v);
                        }
                    }
                }

                // Print results
                System.out.println(outputList.size());
                for (String s : outputList) {
                    System.out.println(s);
                }
            }
        }
        sc.close();
    }
}