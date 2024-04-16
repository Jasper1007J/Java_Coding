/*
Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.

Note : Keep the first of the array unaltered. 

Example 1:

5  —Value of N
{10, 20, 30, 40, 50}  —Element of Arr[ ]
2  —–Value of K
Output :

40 50 10 20 30

Example 2:

4  —Value of N
{10, 20, 30, 40}  —Element of Arr[]
1  —–Value of K
Output :

40 10 20 30

 
 */

import java.util.*;

public class RotatingArray {
    public static int[] rotate(int[] a, int n, int k) {
        int ans[] = new int[n];
        int index = n - k;
        for (int i = 1; i <= index; i++) {
            if (index - i >= 0) {
                ans[n - i] = a[index - i];
            }
            if (index + i <= n) {
                ans[i - 1] = a[index + i - 1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] ans = rotate(arr, n, k);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
