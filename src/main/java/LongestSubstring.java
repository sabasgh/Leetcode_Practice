import java.util.HashSet;
import java.util.Set;

/*PROBLEM:
Given a string s, find the length of the longest substring without duplicate characters.

Input: s = "abcabcbb"
Output: 3

Input: s = "bbbbb"
Output: 1

Input: s = "pwwkew"
Output: 3
 */
public class LongestSubstring {
    public static void main(String[] args) {
        System.out.println("The length of the longest substring without duplicate characters of abcabcbb is: " + findTheLongestSubstring("abcabcbb"));
        System.out.println("The length of the longest substring without duplicate characters of bbbbb is: " + findTheLongestSubstring("bbbbb"));
        System.out.println("The length of the longest substring without duplicate characters of pwwkew is: " + findTheLongestSubstring("pwwkew"));

    }

    public static String findTheLongestSubstring(String str) {
        //abcabcbb
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLengt = 0;

        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            while (set.contains(c)) {
                set.remove(str.charAt(left));
                left++;
            }
            set.add(c);
            maxLengt = Math.max(maxLengt, right - left + 1);
        }
        return String.valueOf(maxLengt);
    }
}
/*
SOLUTION:
A Set is a collection of unique elements!!!
• two pointers: left and right
• a Set<Character> to track what’s inside the window

Step by step logic

Start with left = 0

Move right forward character by character

If the character is not in the set
add it
update max length

If the character is already in the set
remove characters from the left
move left forward
until the duplicate is gone

Continue until the end of the string

*/
