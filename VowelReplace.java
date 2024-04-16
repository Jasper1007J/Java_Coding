
/*
 * 
 * The program will recieve 3 English words inputs from STDIN

These three words will be read one at a time, in three separate line
The first word should be changed like all vowels should be replaced by *
The second word should be changed like all consonants should be replaced by @
The third word should be changed like all char should be converted to upper case
Then concatenate the three words and print them

Input

how
are
you
Expected Output : h*wa@eYOU

Case 2
Input

how
999
you
Expected Output : h*w999YOU
 */

import java.util.*;

public class VowelReplace {
    public static void main(String[] args) {
        String[] result = new String[200];
        Scanner sc = new Scanner(System.in);
        String[] Words = new String[3];
        for (int i = 0; i < 3; i++) {
            Words[i] = sc.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            String Letters = Words[i];
            char[] word = Letters.toCharArray();
            char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
            for (int j = 0; j < word.length; j++) {
                for (int k = 0; k < vowels.length; k++) {
                    if (i == 0) {
                        if (word[j] == vowels[k]) {
                            word[j] = '*';
                        }
                    } else if (i == 1) {
                        if (word[j] == vowels[k]) {
                            word[j] = '@';
                        }
                    } else {
                        if (word[j] == vowels[k]) {
                            word[j] = Character.toUpperCase(word[j]);
                        }
                    }
                }

            }
            word.toString();
            String res = new String(word);
            result[i] = res;

        }
        String final_result = result[0] + result[1] + result[2];
        System.out.println(final_result);
        sc.close();
    }
}
