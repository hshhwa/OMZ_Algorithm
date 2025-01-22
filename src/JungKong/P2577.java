package JungKong;

import java.util.Scanner;

public class P2577 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자 : ");
        String s1 = sc.nextLine();
        int n1 = Integer.parseInt(s1);
        if(n1 <100 || n1 >=1000) {
            System.out.println("100~999보다 작은 수를 입력하세요");
            return;
        }

        System.out.print("두번째 숫자 : ");
        String s2 = sc.nextLine();
        int n2 = Integer.parseInt(s2);
        if(n2 <100 || n2 >=1000) {
            System.out.println("100~999보다 작은 수를 입력하세요");
            return;
        }

        System.out.print("세번째 숫자 : ");
        String s3 = sc.nextLine();
        int n3= Integer.parseInt(s3);
        if(n3 <100 || n3 >=1000) {
            System.out.println("100~999보다 작은 수를 입력하세요");
            return;
        }

        int multi = n1*n2*n3;
        String value = String.valueOf(multi);
        System.out.println(value);

        int[] arr = new int[10];

        for(int i=0; i<value.length(); i++) {
            arr[value.charAt(i) - '0']++;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
