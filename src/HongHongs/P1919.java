package HongHongs;

import java.util.Scanner;

public class P1919 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String OneWord = scanner.nextLine();
        String TwoWord = scanner.nextLine();

        String OneWordTemp = OneWord;
        String TwoWordTemp = TwoWord;
        int answer = 0;

        for(int i = 0; i < OneWordTemp.length(); i++){
            int index = TwoWord.indexOf(OneWordTemp.charAt(i));
            if(index == -1){
                OneWordTemp = OneWordTemp.substring(0, i) + "?" + OneWordTemp.substring(i + 1);
                answer++;
            }
            else {
                TwoWordTemp = TwoWordTemp.substring(0, index) + "?" + TwoWordTemp.substring(index + 1);
            }
        }

        for(int i = 0; i < TwoWordTemp.length(); i++){
            int index = OneWord.indexOf(TwoWordTemp.charAt(i));
            if(index == -1){
                TwoWordTemp = TwoWordTemp.substring(0, i) + "?" + TwoWordTemp.substring(i + 1);
                answer++;
            }
            else {
                OneWordTemp = OneWordTemp.substring(0, index) + "?" + OneWordTemp.substring(index + 1);
            }
        }
        System.out.print(answer);
    }
}