package JungKong;

import java.util.Scanner;

public class P1475 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        while (true){

        System.out.println("숫자 입력");
        str = sc.nextLine();

            try {
                int num = Integer.parseInt(str);
                if (num <= 1000000) break;
                else System.out.println("1,000,000 이하로 작성해주세요");
            }
            catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요");
            }
        }

        int[] arr = new int[10];

        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i)-'0';
            arr[num]++;
        }

        int num = (1+(arr[6] + arr[9])) / 2;
        arr[6] = arr[9] = num;

        int max = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        System.out.println(max);

    }
}
