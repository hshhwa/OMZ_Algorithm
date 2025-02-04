package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class P1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] words = br.readLine().split(" ");

        int n = Integer.parseInt(words[0]);
        int count = Integer.parseInt(words[1]);

        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        ListIterator<Integer> iter = list.listIterator();

        for(int i = 0; i < count - 1; i++) {
            if(!iter.hasNext()){
                iter = list.listIterator();
            }
            iter.next();
        }

        while(!list.isEmpty()) {

            if(!iter.hasNext()) {
                iter = list.listIterator();
            }

            int removeIndex = iter.next();
            iter.remove();
            sb.append(removeIndex);

            if(!list.isEmpty()) {
                sb.append(", ");
            }

            if(!list.isEmpty()) {
                for(int i = 0; i < count - 1; i++) {
                    if(!iter.hasNext()) {
                        iter = list.listIterator();
                    }
                    iter.next();
                }
            }
        }

        sb.append(">");
        System.out.println(sb);
    }
}
