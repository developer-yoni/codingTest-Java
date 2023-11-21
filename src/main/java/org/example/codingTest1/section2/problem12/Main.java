package org.example.codingTest1.section2.problem12;

import java.util.*;

public class Main {

    public int solution(int n, int m, int[][] array) {

        // 단 학생이 1명이면 멘토 멘티 불가
        if (n == 1) {

            return 0;
        }

        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {

            map.put(i, new HashSet<>());
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < j; k++) {

                    map.get(array[i][j]).add(array[i][k]);
                }
            }
        }

        // 핵심은 (가능한 모든 케이스) - (1명이라도 자기보다 앞선 사람이 있어서 멘토가 불가능한 case)
        int count = 0;
        for (int i = 1; i <= n; i++) {

            count += map.get(i).size();
        }

        // 잔체 케이스는 P(n,2) 라는 점 주의
        return (n*(n-1)) - count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        int result = solution.solution(n, m, array);

        System.out.println(result);
    }
}
