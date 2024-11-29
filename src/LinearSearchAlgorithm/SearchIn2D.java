package LinearSearchAlgorithm;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SearchIn2D {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 10, 21},
                {12, 43, 25, 99},
                {2, 4, 9, 55},
                {11, 445, 221}
        };

        int target = 23;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }


    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
