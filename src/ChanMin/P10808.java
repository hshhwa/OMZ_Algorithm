package ChanMin;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P10808 {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];

        String s = br.readLine();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                arr[ch - 'a']++;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}