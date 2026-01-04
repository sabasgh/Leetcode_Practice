class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class AddTwoNumbers {
    /*PROBLEM:
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 */
    public static void main(String[] args) {
        //l1 = [2,4,3], l2 = [5,6,4]
        ListNode l1 = new ListNode(2);
        ListNode l1node2 = new ListNode(4);
        ListNode l1node3 = new ListNode(3);
        l1.next = l1node2;
        l1node2.next = l1node3;

        ListNode l2 = new ListNode(5);
        ListNode l2node2 = new ListNode(6);
        ListNode l2node3 = new ListNode(4);

        l2.next = l2node2;
        l2node2.next = l2node3;

        System.out.println("The output for ");
        printList(l1);
        System.out.println(" and ");
        printList(l2);
        System.out.println(" is: ");
        printList(addTwoNumbers(l1, l2));
    }

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0);
        ListNode pointer = dummy;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            ListNode node = new ListNode(sum % 10);
            pointer.next = node;
            pointer = pointer.next;
        }
        return dummy.next;
        //We return dummy.next because dummy is fake.
        //The real result starts after it.
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
}

/*
NOTE:
On LeetCode, “linked list” means ListNode, not Java LinkedList.
Think of LeetCode linked list problems as:
Pointer problems, not collection problems

Why they use this instead of arrays 🤔

Because linked lists test whether you can

• move pointers
• build structures dynamically
• handle null safely
• think node by node

Arrays hide all of that.
*/
