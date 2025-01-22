package HongHongs;

import java.util.Scanner;

public class P13300 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        String[] condition = scanner.nextLine().split(" ");
        int n = Integer.parseInt(condition[0]);
        int count = Integer.parseInt(condition[1]);

        int arr[][] = new int[6][2];

        for(int i = 0; i < n; i ++) {
            String[] info = scanner.nextLine().split(" ");
            int sex = Integer.parseInt(info[0]);
            int grade = Integer.parseInt(info[1]);
            arr[grade - 1][sex]++;
        }

        for(int i = 0; i < 6; i ++) {
            int woman = arr[i][0];
            int man = arr[i][1];

            if(woman % count == 0) {
                answer += woman / count;
            }
            else {
                answer += (woman / count) + 1;
            }

            if(man % count == 0) {
                answer += man / count;
            }
            else {
                answer += (man / count) + 1;
            }
        }

        System.out.print(answer);
    }
}