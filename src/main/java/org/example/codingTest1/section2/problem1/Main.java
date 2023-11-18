package org.example.codingTest1.section2.problem1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int[] array) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i < array.length; i++) {

            if (array[i] > array[i - 1]) {

                result.add(array[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n+1];
        array[0] = 0;
        for (int i = 1; i < n + 1; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        List<Integer> result = solution.solution(array);

        result.forEach(e -> System.out.print(e + " "));
    }
}
