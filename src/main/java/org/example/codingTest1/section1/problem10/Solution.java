package org.example.codingTest1.section1.problem10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public List<Integer> solution(String str, char targetCh) {

        // target문자가 있는 index들을 모음
        List<Integer> targetList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == targetCh) {
                targetList.add(i);
            }
        }

        // 이제 비로소 각 문자와 그 target문자들과의 절댓값 거리중 최솟값을 결과로 넣으면 된다
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            int finalI = i;
            int minValue = targetList.stream().mapToInt(target -> Math.abs(target - finalI)).min().getAsInt();
            result.add(minValue);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char targetCh = sc.next().charAt(0);

        Solution solution = new Solution();
        List<Integer> result = solution.solution(str, targetCh);

        result.forEach(e -> System.out.print(e + " "));
    }
}
