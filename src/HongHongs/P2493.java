package HongHongs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class P2493 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        Stack<Integer> stack = new Stack<>();
        List<String> answer = new ArrayList<>();

        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(sc.nextLine());
        }

        int index = 0;
        int num = 1;

        while(index < n) {
            if(!stack.isEmpty()){
                if(stack.peek() == arr[index]) {
                    stack.pop();
                    answer.add("-");
                    index++;
                }
                else {
                    stack.push(num);
                    answer.add("+");
                    num++;
                }
            }
            else {
                stack.push(num);
                answer.add("+");
                num++;
            }
            if(num > n + 1) {
                break;
            }
        }


        if(stack.isEmpty()) {
            for(int i = 0; i < answer.size(); i++){
                if(i == answer.size() - 1) {
                    System.out.print(answer.get(i));
                }
                else {
                    System.out.println(answer.get(i));
                }
            }
        }
        else {
            System.out.print("NO");
        }

    }
}