package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        List<String> answer = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String[] command = br.readLine().split(" ");
            switch(command[0]){
                case "push" :
                    stack.push(Integer.parseInt(command[1]));
                    break;
                case "pop" :
                    if(!stack.isEmpty()) {
                        answer.add(String.valueOf(stack.pop()));
                    }
                    else {
                        answer.add("-1");
                    }
                    break;
                case "size" :
                    answer.add(String.valueOf(stack.size()));
                    break;
                case "empty" :
                    if(!stack.isEmpty()) {
                        answer.add("0");
                    }
                    else {
                        answer.add("1");
                    }
                    break;
                case "top" :
                    if(!stack.isEmpty()) {
                        answer.add(String.valueOf(stack.peek()));
                    }
                    else {
                        answer.add("-1");
                    }
                    break;
            }
        }

        for(int i = 0; i < answer.size(); i++) {
            if(i == answer.size() - 1) {
                System.out.print(answer.get(i));
            }
            else {
                System.out.println(answer.get(i));
            }
        }
    }
}