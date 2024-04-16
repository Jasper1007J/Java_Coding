
/*
 * Alice and Bob are batch mates and Alice got placed in a well-reputed
 * product-based company and his friend Bob is demanding a pizza party from him.
 * Alice is ready for giving party and he ordered N pizzas from the nearest
 * restaurant. Now pizzas can have at most K different flavors (It is not
 * necessary that there should be one pizza of each flavor), numbered from 1 to
 * K such that ⅈ^th pizza can have Ai flavor (1 <= Ai <=k).
 * Bob is on dieting, and he can only eat pizza of at most k-1 flavors but he
 * can eat as many pizzas of ith flavor and he wanted to choose maximum possible
 * pizzas which are in contiguous sequence to one another such that all pizzas
 * in sequence has atmost k-1 flavors.
 * 
 * For example
 * 6 2 -> here 6 is the number pizzas of and 2 is number of distinct flavors
 * 1 1 1 2 2 1   -> ith pizza has flavor ai
 * Example 1:
 * Input
 * 6 2 -> Size of input Array and K distinct flavors
 * 1 1 1 2 2 1 -> input array (N Different pizza flavors )
 * 
 * Output
 * 3
 * 
 * Explanation
 * Maximum length subarray with at most k-1 distinct flavors is 3 and sub array
 * is 1 1 1
 * Example 2:
 * 
 * Input:
 * 5 3 -> Size of inputs Arrays and K distinct flavors
 * 1 1 2 2 1 -> input array (N Different Pizza Flavors)
 * 
 * Output
 * 5
 * 
 * Explanation
 * Since N pizza in total has only 2 flavors so bob can eat all pizza so maximum
 * length of subarray with at most k-1 distinct flavors is 5
 * 
 * Constraints
 * 1<N<100000>Size of Array
 * 2<K<100000> Number of different flavors
 * 1<A[i]<100000> Value of ith flavor 0 base indexing
 * 
 * The Input format for testing
 * The candidate has to write the code to accept 2 inputs.
 * First Input: It will contain two integer N and K
 * Second Input: It will contain a N integer separated by space.
 * 
 * Output format for testing
 * The output will contain a single line containing an integer denoting maximum
 * possible length of subarray.
 * 
 * Additional messages in output will cause the failure of test cases.
 * 
 * Instructions:
 * 
 * System doesn't allow any kind of hard coded input value/values. Written
 * program code by the candidate will be verified against the inputs which are
 * supplied from the system
 * 
 * 
 * 
 * 
 * 
 */
import java.util.*;

public class EatingFlavouredPizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] flavors = new int[n];
        for (int i = 0; i < n; i++) {
            flavors[i] = sc.nextInt();
        }
        sc.close();

        int result = maxSubArrayLength(flavors, k);
        System.out.println(result);
    }

    public static int maxSubArrayLength(int[] flavors, int k) {
        int maxLen = 0;
        int count = 0, left = 0;
        int[] freq = new int[100001];

        for (int right = 0; right < flavors.length; right++) {
            int flavor = flavors[right];
            if (freq[flavor] == 0) {
                count++;
            }
            freq[flavor]++;

            while (count > k - 1) {
                int leftFlavor = flavors[left++];
                freq[leftFlavor]--;
                if (freq[leftFlavor] == 0) {
                    count--;
                }
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}