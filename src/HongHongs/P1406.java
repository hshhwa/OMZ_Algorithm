package HongHongs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class P1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> words = new LinkedList<Character>();
        String word = br.readLine();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < word.length(); i++){
            words.add(word.charAt(i));
        }

        ListIterator<Character> listIndex = words.listIterator(words.size());


        for(int i = 0; i < count; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "L":
                    if(listIndex.hasPrevious()) {
                        listIndex.previous();
                    }
                    break;
                case "D":
                    if(listIndex.hasNext()) {
                        listIndex.next();
                    }
                    break;
                case "B":
                    if(listIndex.hasPrevious()) {
                        listIndex.previous();
                        listIndex.remove();
                    }
                    break;
                case "P":
                    listIndex.add(input[1].charAt(0));
                    break;
            }
        }

        for(char c : words) {
            sb.append(c);
        }
        System.out.print(sb);
    }
}

//public class P1406 {
//    public static void main(String[] args) throws IOException {
//        int cursorIndex = 0;
//        int cursorMaxIndex = 0;
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringBuilder sb = new StringBuilder();
//
//        StringBuilder word = new StringBuilder(br.readLine());
//
//        cursorMaxIndex = word.length();
//        cursorIndex = cursorMaxIndex;
//
//        int count = Integer.parseInt(br.readLine());
//
//        for(int i = 0; i < count; i++) {
////            StringTokenizer st = new StringTokenizer(br.readLine());
//            String[] input = br.readLine().split(" ");
////            int inputIndex = 0;
//
////            while(st.hasMoreTokens()) {
////                input[inputIndex++] = st.nextToken();
////            }
//
//            switch (input[0]) {
//                case "L":
//                    if(cursorIndex != 0) {
//                        cursorIndex--;
//                    }
//                    break;
//                case "D":
//                    if(cursorIndex != cursorMaxIndex) {
//                        cursorIndex++;
//                    }
//                    break;
//                case "B":
//                    if(cursorIndex != 0) {
//                        word = new StringBuilder(word.substring(0, cursorIndex) + word.substring(cursorIndex, word.length()));
//                        cursorMaxIndex--;
//                        cursorIndex--;
//                    }
//                    break;
//                case "P":
//                    if(cursorIndex != cursorMaxIndex) {
//                        word = new StringBuilder(word.substring(0, cursorIndex) + input[1].charAt(0) + word.substring(cursorIndex, word.length()));
//                    }
//                    else {
//                        word.append(input[1].charAt(0));
//                    }
//                    cursorIndex++;
//                    cursorMaxIndex++;
//                    break;
//            }
//        }
//
//        System.out.print(word);
//    }
//}