import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoSortedLists {
    /*PROBLEM:
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Input: list1 = [], list2 = []
Output: []

Input: list1 = [], list2 = [0]
Output: [0] */
    public static void main(String[] args) {
        int[] list1 = {1, 3, 5};
        int[] list2 = {2, 4, 6};
        int[] list3 = {};
        int[] list4 = {};
        int[] list5 = {0};

        System.out.println("Merged list of" + Arrays.toString(list1) + "  and" + Arrays.toString(list2) + " is: " + merge(list1, list2).toString());
        System.out.println("Merged list of" + Arrays.toString(list3) + "  and" + Arrays.toString(list4) + " is: " + merge(list3, list4).toString());
        System.out.println("Merged list of" + Arrays.toString(list4) + "  and" + Arrays.toString(list5) + " is: " + merge(list4, list5).toString());

    }

    public static ArrayList<Integer> merge(int[] list1, int[] list2) {
        ArrayList<Integer> array = new ArrayList<>();
        int stepi = 0;
        int stepj = 0;
        while (stepi < list1.length && stepj < list2.length) {
            if (list1[stepi] <= list2[stepj]) {
                array.add(list1[stepi]);
                stepi++;
            } else {
                array.add(list2[stepj]);
                stepj++;
            }
        }
        while (stepi < list1.length) {
            array.add(list1[stepi++]);
        }
        while (stepj < list2.length) {
            array.add(list2[stepj++]);
        }
        return array;
    }
}
/*
SOLUTION:
The lists are already sorted
You want to merge them into one sorted list
Without creating new nodes
Just reconnecting existing ones

So you repeatedly pick the smaller current node from the two lists and move forward.


*/
