package Heeyoun;

import java.io.*;
import java.util.*;

// 방 배정하기 
public class P13300 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            
            // 1. 입력받기
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());  // 학생 수
            int K = Integer.parseInt(st.nextToken());  // 한 방 최대 인원
            
            // 2. HashMap 생성
            HashMap<String, Integer> rooms = new HashMap<>();
            
            // 3. 학생 정보 입력받아서 HashMap에 저장
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine()); // 공백으로 구분 
                int S = Integer.parseInt(st.nextToken());  // 성별 (0:여학생, 1:남학생)
                int Y = Integer.parseInt(st.nextToken());  // 학년
                String key = Y + "-" + S;  // 예: "1-0" = 1학년 여학생, "1-1" = 1학년 남학생
                rooms.put(key, rooms.getOrDefault(key, 0) + 1);
            }
            
            // 4. 필요한 방의 개수 계산
            int answer = 0;
            for (int count : rooms.values()) {
                answer += (count + K - 1) / K; // 올림 연산 
                // double ceiling = Math.ceil(n / (double)k); // ceil, floor, round
            }
            
            // 5. 결과 출력
            bw.write(String.valueOf(answer));
            bw.flush();
        }
    }
}

/**
 * 같은 성별끼리만 방을 쓸 수 있음
같은 학년끼리만 방을 쓸 수 있음
한 방에 최대 K명까지 배정 가능
 */