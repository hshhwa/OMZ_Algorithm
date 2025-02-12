package JiHyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String roomNum = br.readLine();
        int[] count = new int[10];

        for ( char digit : roomNum.toCharArray() ) {
            count[digit - '0']++;
        }

        count[6] = count[9] = (count[6] + count[9] + 1) / 2;

        int maxSet = 0;

        for (int num : count) {
            maxSet = Math.max(maxSet, num);
        }

        System.out.println(maxSet);

    }
}
