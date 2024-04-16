
/*
 * Oddly Even Problem Statement
Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and even position digits

Test Cases
Case 1
Input: 4567
Expected Output: 2
Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 12 – 10 = 2

Case 2
Input: 5476
Expected Output: 2
Case 3
Input: 9834698765123
Expected Output: 1
Given a maximum of 100 digit numbers as inpu
Solution
(When using Strings as input)
 */
import java.math.*;
import java.util.*;

public class OddlyEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int n = input.length();
        long num = 0;
        num = num + input.charAt(0) - '0';
        long num1 = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                num = num + input.charAt(i) - '0';
            } else {
                num1 = num1 + input.charAt(i) - '0';
            }

        }
        System.out.println(Math.abs(num - num1));
        sc.close();
    }
}
