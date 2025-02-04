package Heeyoun;

import java.io.*;
import java.util.*; 

// 애나그램 - 제거해야 할 문자의 개수
public class P1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

        String firstWord = br.readLine();
        String secondWord = br.readLine(); 
        
        int[] firstCount = new int[26]; 
        int[] secondCount = new int[26]; 

        // count alphabet 
        for (char c : firstWord.toCharArray()) {
            firstCount[c - 'a']++; 
        }

        for (char c: secondWord.toCharArray()) {
            secondCount[c - 'a']++; 
        }

        // count diff alph to remove 
        int removeCount = 0;
        for (int i = 0; i < 26; i++) {
            removeCount += Math.abs(firstCount[i] - secondCount[i]);
        }

        System.out.println(removeCount); 

    }
}
