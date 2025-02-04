package Heeyoun.Week01;
import java.util.Scanner;


public class P10808 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        // 알파벳 빈도수 저장 배열 (a~z: 인덱스 0~25)
        int[] counts = new int[26];

        // 각 문자에 대해 빈도수 계산
        for (char c : S.toCharArray()) {
            counts[c - 'a']++; // 입력된 문자열의 각 문자를 배열 인덱스에 매핑
        }

        for (int count : counts) {
            System.out.print(count + " ");
        }


        sc.close();

    }
}

/**
 * 문제
 * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 있는지 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
 *
 * 출력
 * 단어에 포함되어 있는 a의 개수, b의 개수, …, z의 개수를 공백으로 구분해서 출력한다.
 *
 * a = 97 b = 98
 */