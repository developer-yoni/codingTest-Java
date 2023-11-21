package org.example.codingTest1.section2.problem10;

import java.util.*;

public class Main {

    public int solution(int[][] array) {

        int count = 0;
        for (int i = 1; i < array[0].length - 1; i++) {

            for (int j = 1; j < array[0].length - 1; j++) {

                if ((array[i][j] > array[i][j - 1]) && (array[i][j] > array[i][j + 1]) && (array[i][j] > array[i - 1][j])
                        && (array[i][j] > array[i + 1][j])) {

                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n+2][n+2];
        for (int i = 1; i < n+1; i++) {

            for (int j = 1; j < n+1; j++) {

                array[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        int result = solution.solution(array);

        System.out.println(result);
    }
}
