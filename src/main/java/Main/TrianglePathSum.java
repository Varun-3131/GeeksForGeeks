package Main;

public class TrianglePathSum {
    public static int minimizeSum(int n, ArrayList<ArrayList<Integer> >grid) {
        // Code here
        if (n == 1) return grid.get(0).get(0);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < grid.get(i).size(); j++) {
                int min = Math.min(grid.get(i + 1).get(j), grid.get(i + 1).get(j + 1));
                grid.get(i).set(j, grid.get(i).get(j) + min);
            }
        }
        return grid.get(0).get(0);
    }
}
