package comb.DSA;

public class MaxAreaTringle {
    public static void main(String[] args) {
//        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        int[][] points = {{4,6},{6,5},{3,1}};
        System.out.println(largestTriangleArea(points));
    }
    public static double largestTriangleArea(int[][] points) {
        int len = points.length;
        double maxArea = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    double area = Math.abs(
                            points[i][0] * (points[j][1] - points[k][1])
                            +points[j][0] * (points[k][1] - points[i][1])
                            +points[k][0] * (points[i][1] - points[j][1])
                    )/2.0;
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        return maxArea;
    }
}
