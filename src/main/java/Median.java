/*PROBLEM
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
The overall run time complexity should be O(log (m+n)).

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
*/
public class Median {
    public static void main(String[] args) {

    }
}
/*
SOLUTION
To achieve O(log(m+n)), as many may already know, we need to use binary search.

Key to the Problem: Partition and Comparison
The key to solving this problem efficiently is to "divide each array into left and right parts appropriately."

Why Divide into Left and Right?
The median is the "middle value when a sorted array is split exactly in half." If the total number of elements is odd, it’s the one in the center. If even, it’s the average of the two center values.

Therefore, we can compute the median by finding the maximum of the left half or the average of the max of the left and the min of the right.
*/
