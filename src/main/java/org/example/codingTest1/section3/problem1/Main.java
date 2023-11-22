package org.example.codingTest1.section3.problem1;

import java.util.*;

public class Main {

    public int[] solution(int[] array1, int size1, int[] array2, int size2) {

        int[] result = new int[size1+size2];

        int idx1 = 0, idx2 = 0, idx = 0;
        for (int i = 0; i < result.length; i++) {

            if (array1[idx1] < array2[idx2]) {

                result[idx++] = array1[idx1++];
            } else {

                result[idx++] = array2[idx2++];
            }

            if (size1 == idx1 || size2 == idx2) {
                break;
            }
        }

        while (idx1 < size1) {

            result[idx++] = array1[idx1++];
        }

        while (idx2 < size2) {

            result[idx++] = array2[idx2++];
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
