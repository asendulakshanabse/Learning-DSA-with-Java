package BinarySearchAlgorithm;

public class BinarySearch {
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }
            else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-12, -10, -8, -1, 0, 3, 5, 20, 22, 50, 52, 60};
        int target = 3;

        int answer = binarySearch(arr, target);
        System.out.println("target located at index: " + answer);

    }
}