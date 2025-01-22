package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] words = br.readLine().split(" ");

        int n = Integer.parseInt(words[0]);
        int count = Integer.parseInt(words[1]);

        List<Integer> answer = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i + 1);
        }
        ListIterator<Integer> iter = list.listIterator(count - 1);
        while(!list.isEmpty()) {
            int check = 0;
            answer.add(list.get(iter.nextIndex()));

            iter.remove();
            if(iter.hasPrevious()) {
                iter.previous();
            }
            while(check != count) {
                if(iter.hasNext()) {
                    iter.next();
                }
                else {
                    iter.set(0);
                }
                count++;
            }
        }
    }
}
