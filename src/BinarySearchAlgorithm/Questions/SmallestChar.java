package BinarySearchAlgorithm.Questions;

// question link - https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/    (744)
/*
* You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
* There are at least two different characters in letters.
* Return the smallest character in letters that is lexicographically greater than target.
* If such a character does not exist, return the first character in letters.
* */

public class SmallestChar {

    static char smallestChar(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];

    }


    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'j'};
        char answer = smallestChar(letters, 'j');
        System.out.println("smallest letter is: " + answer);
    }
}
