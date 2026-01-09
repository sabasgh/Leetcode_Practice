import java.util.Stack;

public class ValidParentheses {
    /*PROBLEM:
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.
    * */


    public static void main(String[] args) {
        System.out.println("{} is: "+isValid("{}"));
        System.out.println("() is: "+isValid("()"));
        System.out.println("[] is: "+isValid("[]"));
        System.out.println("{()} is: "+isValid("{()}"));
        System.out.println("{(}) is: "+isValid("{(})"));
        System.out.println("((( is: "+isValid("((("));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else { // It means it must be the closing one
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if (top != '(' && ch == ')' ||
                        top != '{' && ch == '}' ||
                        top != '[' && ch == ']'
                ) {
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }
}
/*
SOLUTION:
What kind of structure remembers order?
Ask yourself:
I open something, then open something else,
which one must be closed first?
Example:
( [ ] )
The last opened bracket must be closed first.
That is exactly the behavior of a stack:
• push when you open
• pop when you close
• last in, first out
So your brain should go:
This is a stack problem
*/
