package org.example.codingTest1.section3.problem2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public int[] solution(int[] array1, int size1, int[] array2, int size2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i = 0; i < size1; i++) {

            set1.add(array1[i]);
        }
        for (int i = 0; i < size2; i++) {

            set2.add(array2[i]);
        }

        set1.retainAll(set2);

        List<Integer> resultList = set1.stream()
                                       .sorted((e1, e2) -> e1 - e2)
                                       .collect(Collectors.toList());

        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {

            result[i] = resultList.get(i);
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        for (int i = 0; i < size1; i++) {

            array1[i] = sc.nextInt();
        }

        int size2 = sc.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {

            array2[i] = sc.nextInt();
        }

        Main solution = new Main();
        int[] result = solution.solution(array1, size1, array2, size2);

        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
