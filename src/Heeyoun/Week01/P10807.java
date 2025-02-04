package Heeyoun.Week01;
import java.io.*;

// 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지
public class P10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            // 1. N 입력받아
            int N = Integer.parseInt(br.readLine());

            // 2. 공백으로 구분하는 정수배열 입력받아
            String[] num = br.readLine().split(" "); 
            int[] arr = new int[N]; 
            for (int i = 0; i < N; i ++) {
                arr[i] = Integer.parseInt(num[i]);
            }

            // 3. 찾을 정수 v 입력받아
            int v = Integer.parseInt(br.readLine());

            // 4. v 개수 찾아
            int count = 0;
            for (int no : arr) {
                if (no == v) count++;
            }

            // 5. 결과 뽑아
            bw.write(String.valueOf(count));
            bw.flush();
        } finally {
            br.close();
            bw.close(); 
        }

    }
}
