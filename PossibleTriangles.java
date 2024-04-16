
/*
 *  Alice had to go to play with his friends. But his brother is not leaving. So, he thought to ask a question so that in the mean time he can go. So , the problem is as follows: He will be given numbers n,m and k. Calculate T. (T = (nm)/k) His brother has to find the three coordinates of the XY plane (2D points) such that the area of the triangle formed by those points should be equal to T. If there is any solution print YES. else NO.

NOTE: 1≤ x1,y1, x2,y2, x3, y3 ≤ 109

Example 1: 

Input: 
4 3 3

 Output: 
YES

Explanation:
One possible way is (1,0), (2,3) and (4,1) are the
points where there area is equal to T.

Example - 2:

Input:
4 4 7

Output.
NO
Constraints: 
1 ≤ n,m≤ 109
2 ≤ k ≤ 109

The input format for testing:
•The first line represents the n, m and k, each separated by a space.

The Output format for testing:
•Print YES if there is any solution else NO

Instructions:
•The system does not allow any kind of hard- coded input value/ values.
•Written program code by the candidate will be verified against the inputs which are supplied from the system.

 * 
 */
import java.util.*;

public class PossibleTriangles {
    public static boolean isTriangle(int n, int m, int k) {
        long T = (n * m) / k;
        if (T <= 0 || (n * m) % k != 0) {
            return false;
        } else
            return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        if (isTriangle(n, m, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
