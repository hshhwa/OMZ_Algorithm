package Heeyoun;
import java.io.*;
import java.util.Arrays;

public class P3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1, 수열 크기 입력 
        int n = Integer.parseInt(br.readLine());
        // 2. 배열 받기 
        int num[] = Arrays.stream(br.readLine().split(" "))
                        .mapToInt(Integer::parseInt).toArray(); 
        // 3. 목표 합 입력
        int x = Integer.parseInt(br.readLine());

        // 4. 배열 정렬 
        Arrays.sort(num);

        // 5. 투포인터 설정
        int left = 0;
        int right = n-1;
        int count = 0; 

        while (left < right) { // ensures left & right pointers never cross 
            int sum = num[left] + num[right]; 

            if (sum == x) {
                count++;
                left++;
                right--;
            } else if (sum < x) {
                left++;
            } else {
                right--; 
            }

        }

        System.out.println(count); 

    } 
}

/**
 * 수열에서 두 수의 합이 특정 값이 되는 쌍을 찾는 문제
 
입력 예시:
9           <- n: 수열의 크기
5 12 7 10 9 1 2 3 11    <- n개의 서로 다른 숫자들
13          <- x: 우리가 찾고 싶은 합

입력:
4
1 2 3 4
5

출력:
2 <- 2가지 경우 

 * n이 최대 100,000이라 이중 반복문을 사용하면 시간 초과가 날 것 같았다.
 * 
 * 1. n개의 서로 다른 양의 정수가 주어진다. (1 ≤ n ≤ 100,000)
 * 2. 각 정수는 1부터 1,000,000 사이의 값이다.
 * 3. 두 수를 더해서 x가 되는 쌍의 개수를 찾아야 한다.
 * 4. 같은 위치의 수는 선택할 수 없다.
 * 
1. 메모리 사용

HashMap: 모든 원소를 저장하므로 O(n)의 추가 메모리가 필요합니다.
투 포인터: 정렬된 배열만 사용하므로 추가 메모리가 거의 들지 않습니다. (정렬 알고리즘에 따라 다를 수 있음)

2. 시간복잡도

HashMap: O(n) - 배열을 한 번만 순회합니다.
투 포인터: O(nlogn) - 정렬에 O(nlogn), 순회에 O(n)이 필요합니다.

3. 장단점 분석
HashMap 방식의 장점

원본 배열의 순서를 유지할 수 있습니다.
정렬이 필요 없어 전체적인 수행시간이 더 빠를 수 있습니다.
각 원소의 인덱스 정보를 유지할 수 있습니다.

투 포인터 방식의 장점

메모리 사용이 적습니다.
구현이 직관적이고 이해하기 쉽습니다.
정렬된 상태를 활용한 추가 연산이 가능합니다.
 */
