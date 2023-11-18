package org.example.codingTest1.section2.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution(int[] array1, int[] array2) {

        List<String> result = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == array2[i]) {

                result.add("D");
            } else {

                if (array1[i] == 1 && array2[i] == 2) {

                    result.add("B");
                } else if (array1[i] == 1 && array2[i] == 3) {

                    result.add("A");
                } else if (array1[i] == 2 && array2[i] == 1) {

                    result.add("A");
                } else if (array1[i] == 2 && array2[i] == 3) {

                    result.add("B");
                } else if (array1[i] == 3 && array2[i] == 1) {

                    result.add("B");
                } else if (array1[i] == 3 && array2[i] == 2) {

                    result.add("A");
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {

            array1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {

            array2[i] = sc.nextInt();
        }

        Main solution = new Main();
        List<String> result = solution.solution(array1, array2);

        result.forEach(System.out::println);
    }
}
