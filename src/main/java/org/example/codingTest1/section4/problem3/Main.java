package org.example.codingTest1.section4.problem3;

import java.util.*;

public class Main {

    public static List<Integer> solution(int n, int k, int[] array) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {

            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }
        result.add(map.keySet().size());

        for (int i = k; i < n; i++) {

            map.put(array[i-k], map.get(array[i-k]) - 1);
            if (map.get(array[i - k]) <= 0) {

                map.remove(array[i-k]);
            }

            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            result.add(map.keySet().size());
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        List<Integer> result = solution.solution(n, k, array);

        result.forEach(e -> System.out.print(e + " "));
    }
}
