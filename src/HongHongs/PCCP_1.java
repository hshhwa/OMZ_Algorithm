package HongHongs;

import java.io.IOException;
import java.util.*;

//아직안품
public class PCCP_1 {

    public static void main(String[] args) throws IOException {

        String input_string = "edeaaabbccd";

        Set<Character> aloneWord = new HashSet<>();
        Set<Character> word = new HashSet<>();

        char checkPrev = '\0';

        // 문자열 순회
        for (char current : input_string.toCharArray()) {
            if (current != checkPrev) {
                if (word.contains(current)) {
                    aloneWord.add(current);
                }
                word.add(current);
                checkPrev = current;
            }
        }

        List<Character> resultList = new ArrayList<>(aloneWord);
        Collections.sort(resultList);

        System.out.println(resultList.isEmpty() ? "N" :
                resultList.stream()
                        .map(String::valueOf)
                        .reduce("", (a, b) -> a + b));
    }
}