public class PalindromeNumber {
    /*Problem: Given an integer x, return true if x is a palindrome, and false otherwise.*/

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String number = String.valueOf(x);
        for (int i = 0; i < (number.length())/2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i-1)) {
                return false;
            }
        }
        return true;
    }
}
/*solution: check negativity
                convert to string
                compare half of it with other half*/