package org.example.codingTest1.section2.problem2;

import java.util.Scanner;

public class Main {

    public int solution(int[] array) {

        int max = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {

                count++;
                max = array[i];
            }
        }

        return count;
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
