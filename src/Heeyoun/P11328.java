package Heeyoun.Week01;

import java.io.*;
import java.util.*;

public class P11328 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int N = Integer.parseInt(br.readLine());

        String[] firstString = new String[N];
        String[] secondString = new String[N];

        for (int i = 0; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            firstString[i] = st.nextToken();
            secondString[i] = st.nextToken();

            // if length of str1 == str2
            if (firstString[i].length() == secondString[i].length()) {

            // it they have equal alphabet each otehr 
            if (Arrays.equals(firstString[i].chars().sorted().toArray(), secondString[i].chars().sorted().toArray())) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
            }
        }   
    }
}

/**
 * 두 개의 문자열에 대해, 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지 판단하라.

입력
입력의 첫 번째 줄은 테스트 케이스의 수 0 < N < 1001 이다.

각각의 테스트 케이스는 하나의 줄에 영어 소문자들로만 이루어진 
두 개의 문자열이 한 개의 공백으로 구분되어 주어진다. 
각각의 문자열의 길이는 최대 1000 이다.

출력
각각의 테스트 케이스에 대해, 2번째 문자열이 1번째 문자열에 strfry 함수를 적용하여 얻어질 수 있는지의 여부를 
"Impossible"(불가능) 또는 "Possible"(가능)으로 나타내시오. (따옴표는 제외하고 출력한다.)

각 알파벳의 개수가 정확히 일치해야 "Possible"
순서는 상관없음 (섞어도 됨)
하나라도 개수가 다르면 "Impossible"
 */