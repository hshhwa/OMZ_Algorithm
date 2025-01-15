package KeonHo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class P10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String s = br.readLine();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            arr[c - 97]++;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}