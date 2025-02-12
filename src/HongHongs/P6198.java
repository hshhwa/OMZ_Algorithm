package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ListIterator;
import java.util.Stack;
//아직안품
public class P6198 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] inputArr = new int[n];
        int answer = 0;

        for(int i = 0; i < n; i++) {
            inputArr[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {
            stack.push(inputArr[i]);
        }

        ListIterator<Integer> iterator = stack.listIterator(stack.size());

        for(int i = 0; i < n; i++) {
            while(true) {
                if(iterator.hasPrevious()) {
                    int value = iterator.previous();
                }
            }
        }

        for(int i = n - 1; i >= 0; i--) {
            while(!stack.isEmpty() && inputArr[i] > inputArr[stack.peek()]) {
                stack.pop();
            }
            answer += stack.size();
            stack.push(i);
        }
        System.out.print(answer);
    }
}