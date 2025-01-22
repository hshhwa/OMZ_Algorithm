package HongHongs;

import java.util.Arrays;
import java.util.Scanner;

public class P3273 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = 0;
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr = new int[n];
        String word = scanner.nextLine();
        String[] changeWord = word.split(" ");

        int number = Integer.parseInt(scanner.nextLine());

        int MinIndex = 0;
        int MaxIndex = n - 1;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(changeWord[i]);
        }
        Arrays.sort(arr);

        while(MinIndex != MaxIndex) {
            int value = arr[MinIndex] + arr[MaxIndex];

            if(value > number) {
                MaxIndex--;
            }
            else if(value < number) {
                MinIndex++;
            }
            else {
                MinIndex++;
                answer++;
            }
        }
        System.out.print(answer);

    }
}