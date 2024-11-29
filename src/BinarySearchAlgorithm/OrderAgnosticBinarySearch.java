package BinarySearchAlgorithm;

public class OrderAgnosticBinarySearch {

    // return the index
    // return -1 if it does not exist
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // 1. find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) might extend the int range of the java

            int mid = start + (end - start) / 2;

            if (arr[start] < arr[end]) {   // check array is ASC or DESC
                // Ascending order (min -> max)
                if (target < arr[mid]) { // right
                    end = mid - 1;
                }
                else if (target > arr[mid]) { // left
                    start = mid + 1;
                }
                else {
                    // answer found
                    return mid;
                }
            }
            else {
                // descending order (max -> min)
                if (target > arr[mid]) { // right
                    end = mid - 1;
                }
                else if (target < arr[mid]) { // left
                    start = mid + 1;
                }
                else {
                    // answer found
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrAsc = {-12, -10, -8, -1, 0, 3, 5, 20, 22, 50, 52, 60};
        int[] arrDesc = {60, 52, 50, 22, 20, 5, 3, 0, -1, -8, -10, -12};

        int AscTarget = 20;
        int ansAsc = binarySearch(arrAsc, AscTarget);
        System.out.println("ASC target at index: " + ansAsc);

        int DescTarget = 20;
        int ansDesc = binarySearch(arrDesc, DescTarget);
        System.out.println("DESC target at index: " + ansDesc);
    }
}
