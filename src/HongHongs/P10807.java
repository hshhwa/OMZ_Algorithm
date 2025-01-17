package HongHongs;

import java.util.Scanner;

public class P10807 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int n = Integer.parseInt(scanner.nextLine());
        String[] numberList = scanner.nextLine().split(" ");
        int searchNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            if(searchNumber == Integer.parseInt(numberList[i])) {
                answer++;
            }
        }
        System.out.print(answer);

    }
}