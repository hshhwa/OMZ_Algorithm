package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class P5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        List<StringBuilder> answer = new ArrayList<>();

        for(int i = 0; i < count; i++){
            String word = br.readLine();
            LinkedList<Character> list = new LinkedList<Character>();
            ListIterator<Character> iter = list.listIterator();

            for(int j = 0; j < word.length(); j++){
                switch(word.charAt(j)) {
                    case '<' :
                        if(iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case '>' :
                        if(iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case '-' :
                        if(iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    default:
                        iter.add(word.charAt(j));
                        break;
                }
            }
            StringBuilder st = new StringBuilder();
            for(char c : list) {
                st.append(c);
            }
            answer.add(st);
        }

        for(int i = 0; i < count; i++){
            if(i < count - 1) {
                System.out.println(answer.get(i).toString());
            }
            else {
                System.out.print(answer.get(i).toString());
            }
        }
    }
}
