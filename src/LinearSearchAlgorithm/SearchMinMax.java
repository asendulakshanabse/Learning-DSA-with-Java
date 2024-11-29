package LinearSearchAlgorithm;

public class SearchMinMax {

    static int minimumNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    static int maximumNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 44, 24, 1, 43, 33, 8, 78, 32, 1};
        System.out.println("min: " + minimumNumber(numbers));
        System.out.println("max: " + maximumNumber(numbers));


    }
}
