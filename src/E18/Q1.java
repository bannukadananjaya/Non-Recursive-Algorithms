package E18;

import java.util.ArrayList;
import java.util.List;

public class Q1 {
    
    public static List<int[]> findLocalMinimums(int[][] arr) {
        List<int[]> result = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isLocalMinimum(arr, i, j)) {
                    result.add(new int[]{i, j});
                }
            }
        }
        return result;
    }
    
    private static boolean isLocalMinimum(int[][] arr, int i, int j) {
        int n = arr.length;
        int val = arr[i][j];
        if (i > 0 && arr[i-1][j] < val) return false; // check up
        if (j > 0 && arr[i][j-1] < val) return false; // check left
        if (i < n-1 && arr[i+1][j] < val) return false; // check down
        if (j < n-1 && arr[i][j+1] < val) return false; // check right
        return true;
    }
    
    public static void main(String[] args) {
        int[][] arr = {{8, 7, 6}, {5, 4, 3}, {2, 1, 0}};
        List<int[]> result = findLocalMinimums(arr);
        for (int[] pos : result) {
            System.out.println("(" + pos[0] + ", " + pos[1] + ")");
        }
    }
}
