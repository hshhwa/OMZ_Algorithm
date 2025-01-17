package Heeyoun;
import java.util.Scanner;

public class P1475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] plasticSet = new int[10];
        int answer = 1;

        // 입력받은 숫자 자릿수가 다 다르면 한 플레이트만 쓴다.
        // 같은 숫자가 있으면 새 플레이트를 쓴다.
        // 만약 6이나 9가 나오면 같은 플레이트를 한번 더 쓴다.
        // ㄴ 근데 한번만 더 써야지, 계속 같은 플레이트를 쓸 수 없음. <- 6과 9를 한 몸으로 봐야 한다.

        while (N > 0) {
            int digit = N % 10; // 10씩 몫 나누기해가면서 자릿수 확인

            if (digit == 6 || digit == 9) {
                plasticSet[6]++;
            } else {
                plasticSet[digit]++;
            }
            N /= 10;
        }

        // ( [6] + [9] + 1) / 2
        plasticSet[6] = (plasticSet[6] + 1) / 2;

        for (int setCnt: plasticSet) {
            answer = Math.max(answer, setCnt);
        }

        System.out.println(answer);

        sc.close();
    }
}
