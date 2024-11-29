package BinarySearchAlgorithm.Questions;

public class CeilingOfNumber {

    // ceiling - smallest element in array greater or equal to target

    // return the index
    // return "start" if it does not exist that mean there is ceiling number
    static int ceilingOfNumberSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // 1. find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) might extend the int range of the java

            int mid = start + (end - start) / 2;

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
        return start;


    }

    public static void main(String[] args) {
        int[] arrAsc = {-12, -10, -8, -1, 0, 3, 5, 18, 22, 50, 52, 60, 90};

        int AscTarget = 20;
        int ansAsc = ceilingOfNumberSearch(arrAsc, AscTarget);
        System.out.println("ASC ceiling number is: " + arrAsc[ansAsc]);

    }
}
