
/*
Problem Description -:  Given two non-negative integers n1 and n2, where n1

For example:

Suppose n1=11 and n2=15.

There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

Example1:

Input:

11 — Vlaue of n1
15 — value of n2
Output:

4
Example 2:

Input:

101 — value of n1
200 — value of n2
Output:

72
 */
import java.util.*;

public class RepeatedDigits {
    public static int find(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            int num = i;
            boolean[] found = new boolean[10];
            while (num >= 0) {
                if (found[num % 10] == true) {
                    break;
                }
                found[num % 10] = true;
                num = num / 10;
            }
            if (num == 0) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.print(find(n1, n2));
    }
}
