package JiHyeok;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());

        int[] arr = new int[10];

        while (value != 0) {
            arr[value % 10]++;
            value /= 10;
        }

        for (int result : arr) {
            System.out.println(result);
        }
    }
}
