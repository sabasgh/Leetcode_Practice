/*PROBLEM
Given a string s, return the longest palindromic substring in s.

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.

Input: s = "cbbd"
Output: "bb"
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println("The longest palindrom substring for babad is: " + longestPalindrome("babad"));
        System.out.println("The longest palindrom substring for cbbd is: " + longestPalindrome("cbbd"));
        System.out.println("The longest palindrom substring for c is: " + longestPalindrome("c"));
    }
    private static String longestPalindrome(String str) {
        if (str.isEmpty() || str.length() < 2) {
            return "String is not valid!";
        }
        int startIndex = 0;
        int maxLength = 1;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            int odd = expand(str, i, i);
            int even = expand(str, i, i + 1);
            int len = Math.max(odd, even);

            if (maxLength < len) {
                maxLength = len;
                start = i - (len - 1) / 2;
            }
        }
        return str.substring(start, start + maxLength);
    }
    private static int expand(String str, int i, int j) {
        while (j < str.length() && i >= 0 && (str.charAt(i) == str.charAt(j))) {
            i--;
            j++;
        }
        return j - i - 1;
    }
}
/*
SOLUTION
Every palindrome has a center
Either one character (odd length)
Or between two characters (even length)

So for each index, expand from both centers and keep the longest one.
Expand around every possible center
Track the longest palindrome found
*/
