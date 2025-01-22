package JungKong;

import java.util.Scanner;

public class P10808 {
    public static void main(String[] args) {
        System.out.println("연습문제");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] arrs = new int[26];

        for (int i =0; i<str.length(); i++){
            arrs[str.charAt(i)-'a']++;
        }

        for (int i =0; i<arrs.length; i++){
            System.out.print(arrs[i]+" ");
        }
    }
}