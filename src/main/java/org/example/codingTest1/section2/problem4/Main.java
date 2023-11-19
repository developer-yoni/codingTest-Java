package org.example.codingTest1.section2.problem4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int n) {

        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < n; i++) {

            result[i] = result[i-2] + result[i-1];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Main solution = new Main();
        int[] result = solution.solution(n);

        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
