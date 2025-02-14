package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
//아직안품
public class P6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());
            while(!stack.isEmpty()) {
                if(stack.peek() <= value) {
                    stack.pop();
                }
                else{
                    break;
                }
            }
            answer += stack.size();
            stack.push(value);
        }
        System.out.print(answer);
    }
}