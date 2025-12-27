import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    /*PROBLEM:
    Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
     The relative order of the elements should be kept the same.
     Consider the number of unique elements in nums to be k.
     After removing duplicates, return the number of unique elements k.
     The first k elements of nums should contain the unique numbers in sorted order.
     The remaining elements beyond index k - 1 can be ignored.
    * */
    public static void main(String[] args) {
        int[] input1 = {1, 1, 2, 2, 2, 3, 4, 7, 8};
        int[] input2 = {1, 3, 6, 7};
        System.out.println("The K for array " + Arrays.toString(input1) + " is: " + removeDups(input1));
        System.out.println("The K for array " + Arrays.toString(input2) + " is: " + removeDups(input2));
    }

    public static String removeDups(int[] array) {
        int pointer = 1; //cause the first element is always unique!
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[pointer - 1]) {
                array[pointer] = array[i];
                pointer++;
            }
        }
        return String.valueOf(pointer);
    }
}