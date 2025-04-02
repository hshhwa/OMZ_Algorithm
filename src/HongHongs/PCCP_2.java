package HongHongs;

import java.io.IOException;
import java.sql.Array;
import java.util.*;

//아직안품
public class PCCP_2 {

    public static void main(String[] args) throws IOException {

        int[][] ability = new int[][]{{40,10,10},{20,5,0},{30,30,30},{70,0,70},{100,100,100}};

        int n = ability.length;
        int k = ability[0].length;

        List<List<Integer>> check = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            List<Integer> scoreList = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                scoreList.add(ability[j][i]);
            }
            Collections.sort(scoreList, Collections.reverseOrder());
            check.add(scoreList);
        }

        int BigScore = 0;

        for(int i = 0; i < k; i++) {

        }
        System.out.println(check);
        int answer = 0;
    }
}