public class RomanToInteger {
    /*problem: Given a roman numeral, convert it to an integer.
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000

NOTE: Each Roman symbol has a fixed value,
 and if a smaller value appears before a larger one,
 it’s subtracted; otherwise, it’s added.*/

    public static void main(String[] args) {

        System.out.println("III is: " + convertRomanToInt("III"));
        System.out.println("IV is: " + convertRomanToInt("IV"));
        System.out.println("XIV is: " + convertRomanToInt("XIV"));
        System.out.println("MCMXCIV is: " + convertRomanToInt("MCMXCIV"));
    }

    private static int convertRomanToInt(String roman) {
        int total = 0;
        for (int i = 0; i < roman.length(); i++) {
            int curr = valueOfChar(roman.charAt(i));
            int next = 0;
            if (i + 1 < roman.length()) {
                next = valueOfChar(roman.charAt(i + 1));
            }

            /**** IMPORTANT ****/
            if (curr < next) {
                total -= curr;
            } else {
                total += curr;
            }
        }
        return total;
    }

    private static int valueOfChar(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

/*SOLUTION:
 I used a switch statement to map each Roman character to its numeric value.
Then I looped through the string from left to right.
For each character, I compared its value with the next character:
If the current value is smaller than the next one, I subtracted it from the total.
Otherwise, I added it.
This logic handles all subtraction cases like IV (4), IX (9), and CM (900) automatically.I chose a switch instead
 of a HashMap because the symbols are fixed and limited,
 so the switch is faster and simpler.*/
