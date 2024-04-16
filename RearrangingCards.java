
/*
 * A group of friends are playing cards. Only numeric cards are in consideration along with the joker card (equivalent to 0) 12 the symbols in the cards are not taken into account. Each player will receive a set of cards. The rule of game is to rearrange the set of cards to the possible number sequence. Player with the set of cards forming the smallest number wins the game. The sequence of cards should not start with a joker card. Task is to write a program for developing the logic of the game considering the set of cards as a number.

Example 1: 
Input: 
3421 -> Value of Card Set
Output:
1234 -> Prints the lowest number matching the set criteria
Example 2:

Input:

4278-> Value of Card Set Output:

Output:

2478-> Prints the lowest number matching the set


*/
import java.util.*;

public class RearrangingCards {

    public static int[] rearrange(int[] a) {
        int[] result = new int[a.length];
        int index = 0;
        int min = a[0];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                index = index + 1;
            }
        }
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {

                if (a[i] > a[j]) {
                    min = a[j];
                    a[j] = a[i];
                    a[i] = min;

                }

            }
        }
        System.out.println(index);
        for (int i = index; i < a.length; i++) {
            result[count] = a[i];
            count = count + 1;
        }
        System.out.println(count);

        // for (int i = 0; i < index; i++) {
        // result[count] = 0;
        // count = count + 1;
        // }
        System.out.println(count);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        int[] arr = new int[x.length()];
        for (int i = 0; i < x.length(); i++) {
            arr[i] = x.charAt(i) - '0';

        }
        rearrange(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
