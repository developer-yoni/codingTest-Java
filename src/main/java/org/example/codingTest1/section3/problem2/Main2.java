package org.example.codingTest1.section3.problem2;

import java.util.*;

public class Main2 {

    public int[] solution(int[] array1, int size1, int[] array2, int size2) {

        Arrays.sort(array1);
        Arrays.sort(array2);
        List<Integer> resultList = new ArrayList<>();

        int idx1 = 0;
        int idx2 = 0;
        while (true) {

            if (array1[idx1] < array2[idx2]) {

                idx1++;
            } else if (array1[idx1] > array2[idx2]) {

                idx2++;
            } else {

                resultList.add(array1[idx1]);
                idx1++;
                idx2++;
            }

            if (idx1 == size1 || idx2 == size2) {
                break;
            }
        }

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
