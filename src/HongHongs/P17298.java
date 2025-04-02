package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//아직안품
public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] inputWords = bf.readLine().split(" ");

        int[] inputNums = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(inputWords[i]);
            inputNums[i] = num;
            stack.push(num);
        }
    }
}