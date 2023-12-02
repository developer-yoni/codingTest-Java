package org.example.codingTest1.section4.problem5;

import java.util.*;
public class Main {

    public static int solution(int N, int K, int[] array) {

        Map<Integer, Integer> map = new TreeMap<>((e1, e2) -> e2 - e1);
        Set<Integer> treeSet = new TreeSet<>((e1, e2) -> e2 - e1);

        for (int i = 0; i < N-2; i++) {

            for (int j = i + 1; j < N-1; j++) {

                for (int k = j + 1; k < N; k++) {

                    //map.put(array[i] + array[j] + array[k], array[i] + array[j] + array[k])
                    treeSet.add(array[i] + array[j] + array[k]);
                }
            }
        }

        if (treeSet.size() < K) {

            return -1;
        }

        Object[] sortedSumArray = treeSet.toArray();
        return (Integer)sortedSumArray[K-1];
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
        int result = solution.solution(n, k, array);

        System.out.println(result);
    }
}
