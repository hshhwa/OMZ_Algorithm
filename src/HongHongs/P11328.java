package HongHongs;

import java.util.Arrays;
import java.util.Scanner;

public class P11328 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] answer = new String[n];

        for(int i = 0; i < n; i++) {
            String[] word = scanner.nextLine().split(" ");

            boolean check = true;
            int count = 0;
            String OneWord = word[0];
            String TwoWord = word[1];
            for(int j = 0; j < TwoWord.length(); j++) {
                int indexCheck = OneWord.indexOf(TwoWord.charAt(j));
                if(indexCheck == -1) {
                    check = false;
                    break;
                }
                else {
                    count++;
                    OneWord = OneWord.substring(0, indexCheck) + "?" + OneWord.substring(indexCheck + 1);
                }
            }

            if(check && (count == OneWord.length())) {
                answer[i] = "Possible";
            }
            else {
                answer[i] = "Impossible";
            }
        }

        for(int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.print(answer[i]);
            }
            else {
                System.out.println(answer[i]);
            }
        }
    }
}