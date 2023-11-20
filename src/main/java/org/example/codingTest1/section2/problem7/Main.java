package org.example.codingTest1.section2.problem7;

import java.util.Scanner;

public class Main {

    public int solution(int[] array) {

        int sum = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {

                count++;
                sum += count;
            } else {

                count = 0;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(array);

        System.out.println(result);
    }
}
