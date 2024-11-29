package BinarySearchAlgorithm.Questions;

public class FloorOfNumber {

    // ceiling - greatest element in array smaller or equal to target

    // return the index
    // return "end" if it does not exist that mean there is floor number
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
        return end;
    }

    public static void main(String[] args) {
        int[] arrAsc = {-12, -10, -8, -1, 0, 3, 5, 20, 22, 50, 52, 60, 90};

        int AscTarget = 19;
        int ansAsc = ceilingOfNumberSearch(arrAsc, AscTarget);
        System.out.println("ASC floor number is: " + arrAsc[ansAsc]);

    }

}
