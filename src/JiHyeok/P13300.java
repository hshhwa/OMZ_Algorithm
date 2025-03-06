package JiHyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[][] students = new int[2][7];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int grade = Integer.parseInt(st.nextToken());

            students[gender][grade]++;
        }

        int roomCount = 0;

        for (int gender = 0; gender < 2; gender++) {
            for (int grade = 0; grade < 7; grade++) {
                if (students[gender][grade] > 0) {
                    roomCount += (students[gender][grade] + K -1) / K;
                }
            }
        }

        System.out.println(roomCount);
    }
}
