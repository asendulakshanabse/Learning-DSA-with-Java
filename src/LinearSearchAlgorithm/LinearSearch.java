package LinearSearchAlgorithm;

public class LinearSearch {

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return
        // hence the target not found
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 44, 24, 1, 43, 33, 8, 78, 32, 1};
        int target = 32;

        int answer = linearSearch(numbers, target);
        System.out.println("target at index: " + answer);
    }

}
