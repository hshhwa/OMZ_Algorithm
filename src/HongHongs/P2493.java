package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] towers = new int[n];
        for (int i = 0; i < n; i++) {
            towers[i] = Integer.parseInt(input[i]);
        }

        int[] answer = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && towers[stack.peek()] < towers[i]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                answer[i] = 0;
            }
            else {
                answer[i] = stack.peek() + 1;
            }
            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(answer[i]);
            if (i < n - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}