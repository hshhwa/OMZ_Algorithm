package HongHongs;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if(num == 0) {
                stack.pop();
            }
            else {
                stack.push(num);
            }
        }

        for(int num : stack) {
            answer += num;
        }

        System.out.print(answer);
    }
}