package HongHongs;

import java.util.Scanner;

public class P1919 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;

        String oneWord = scanner.nextLine();
        String twoWord = scanner.nextLine();

        int[] oneAlphabet = new int[26];
        int[] twoAlphabet = new int[26];


        for (char c : oneWord.toCharArray()) {
            oneAlphabet[c - 'a']++;
        }


        for (char c : twoWord.toCharArray()) {
            twoAlphabet[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            answer += Math.abs(oneAlphabet[i] - twoAlphabet[i]);
        }

        System.out.println(answer);
    }
}