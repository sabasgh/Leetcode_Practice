import java.util.Arrays;

public class LongestCommonPrefix {

   /* PROBLEM :
   Write a function to find the longest common prefix string amongst an array of strings.
   If there is no common prefix, return an empty string "".
   Input: strs = ["flower","flow","flight"]
   Output: "fl"
   */

    public static void main(String[] args) {
        String[] str1 = {"fuozen", "fpize", "ereezbee"};
        System.out.println("The Longest common Prefix in Array: " + Arrays.toString(str1) + " is: " + findCommonInArray(str1));
    }

    private static String findCommonInArray(String[] str) {
        if (str == null || str.length == 0) {
            return "Array is empty!";
        }
        String commonPrefix = str[0];
        for (int i = 1; i < str.length; i++) {
            commonPrefix = findCommonInStrings(commonPrefix, str[i]);
            if (commonPrefix.equals("")) {
                return "";
            }
        }
        return commonPrefix;
    }

    private static String findCommonInStrings(String s1, String s2) {
        String result = s1;
        int j = 0;
        while (j < Math.min(s1.length(), s2.length()) - 1 && s1.charAt(j) == s2.charAt(j)) {
            j++;

        }
        return s1.substring(0, j);
    }
}
/*
SOLUTION: Hint
        Think like this
         The first word should be treated as the initial prefix.
   Then we shrink this prefix by comparing it with each next word
   and keeping only the common part. The prefix keeps getting smaller
   until we reach the final longest common prefix. */
