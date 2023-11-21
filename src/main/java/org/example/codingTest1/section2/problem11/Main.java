package org.example.codingTest1.section2.problem11;

import java.util.*;

public class Main {

    public int solution(int n, int[][] array) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        Map<Integer, Set<Integer>> countMap = new HashMap<>();
        for (int i = 0; i < n; i++) {

            countMap.put(i, new HashSet<>());
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < n; j++) {

                map.put(array[j][i], new ArrayList<>());
            }

            for (int j = 0; j < n; j++) {

                map.get(array[j][i]).add(j);
            }

            for (int j = 0; j < n; j++) {

                if (map.get(array[j][i]).size() > 1) {

                    countMap.get(j).addAll(map.get(array[j][i]));
                }
            }

            map.clear();
        }

        int max = -1;
        int idx = -1;
        for (int i = 0; i<n; i++) {

            if (countMap.get(i).size() > max) {

                idx = i;
                max = countMap.get(i).size();
            }
        }

        return idx+1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][5];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 5; j++) {

                array[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        int result = solution.solution(n, array);

        System.out.println(result);
    }
}
