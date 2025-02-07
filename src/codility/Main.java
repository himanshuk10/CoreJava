package codility;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }
    public int solution(int[] D, int[] C, int P) {
        int n = D.length;
        int[][] orders = new int[n][2];
        for (int i = 0; i < n; i++) {
            orders[i][0] = D[i];
            orders[i][1] = C[i];
        }

        // Sort orders by distance, ascending
        Arrays.sort(orders, (a, b) -> Integer.compare(a[0], b[0]));

        // Fulfill orders
        int totalMonitors = 0;
        int fulfilledOrders = 0;
        for (int i = 0; i < n; i++) {
            if (totalMonitors + orders[i][1] <= P) {
                totalMonitors += orders[i][1];
                fulfilledOrders++;
            } else {
                break;
            }
        }
        return fulfilledOrders;
    }
}
