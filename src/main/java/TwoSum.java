import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /* problem:
  Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
  You may assume that each input would have exactly one solution, and you may not use the same element twice.
  You can return the answer in any order.*/
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int target = 9;
        int[] result = twoSum(arr, target);
        System.out.println("result: "+ Arrays.toString(result));
    }
    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> complementsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int comp = target - arr[i];
            if (complementsMap.containsKey(comp)) {
                return new int[]{complementsMap.get(comp), i};
            }
            complementsMap.put(arr[i], i);
        }
        return new int[]{};
    }
}
/*Solution:(interview style):
        When you explain your solution, say something like:

        “I used a HashMap to store each number and its index as I iterate.
        For each number, I check if the complement (target - num) exists in the map.
        This lets me find the answer in one pass, making it O(n) time and O(n) space.”*/
