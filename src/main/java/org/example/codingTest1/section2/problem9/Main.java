package org.example.codingTest1.section2.problem9;

import java.util.Scanner;
import java.util.*;

public class Main {

    public int solution(int[][] array) {

        Queue<Integer> priorityQueue = new PriorityQueue<>((e1, e2) -> e2-e1);

        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {

            sum = 0;
            for (int j = 0; j < array[0].length; j++) {

                sum += array[i][j];
            }
            priorityQueue.add(sum);
        }

        for (int i = 0; i < array[0].length; i++) {

            sum = 0;
            for (int j = 0; j < array[0].length; j++) {

                sum += array[j][i];
            }
            priorityQueue.add(sum);
        }

        sum = 0;
        for (int i = 0; i < array[0].length; i++) {

            sum += array[i][i];
        }
        priorityQueue.add(sum);

        sum = 0;
        for (int i = 0; i < array[0].length; i++) {

            sum += array[i][array[0].length-1 - i];
        }
        priorityQueue.add(sum);

        return priorityQueue.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                array[i][j] = sc.nextInt();
            }
        }

        Main solution = new Main();
        int result = solution.solution(array);

        System.out.println(result);
    }
}
