package HongHongs;

import java.util.Scanner;

public class P10808 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputValue = scanner.nextLine();

        int[] arr = new int[26];

        for(int i = 0; i < inputValue.length(); i++) {
            arr[inputValue.charAt(i) - 'a']++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}