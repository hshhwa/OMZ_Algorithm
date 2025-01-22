package HongHongs;

import java.util.Scanner;

public class P1475 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int[] arr = new int[10];

        String word = scanner.nextLine();

        for(int i = 0; i < word.length(); i++) {
            arr[word.charAt(i)-'0']++;
        }
        int maxValue = 0;

        arr[6] = (arr[6] + arr[9] + 1) / 2;
        arr[9] = arr[6];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }

        answer = maxValue;

        System.out.print(answer);
    }
}