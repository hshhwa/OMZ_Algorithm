package HongHongs;

import java.util.Scanner;

public class P2577 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int wordNumber = 1;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            String str = scanner.nextLine();
            wordNumber = wordNumber * Integer.parseInt(str);
        }

        String strNumber = String.valueOf(wordNumber);

        for( int i = 0; i < strNumber.length(); i++) {
            arr[strNumber.charAt(i) - '0']++;
        }

        for(int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                System.out.print(arr[i]);
            }
            else {
                System.out.println(arr[i]);
            }
        }
    }
}