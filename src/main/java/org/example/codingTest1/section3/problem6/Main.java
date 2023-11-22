package org.example.codingTest1.section3.problem6;

import java.util.*;

public class Main {

    public int solution(int[] array, int n, int k) {

        int max = -1;
        int count = 0;
        int countOfK = k;

        int startIdx = 0;
        int endIdx = 0;

        while (true) {

            countOfK = (array[endIdx]==0) ? (countOfK-1) : countOfK;


            endIdx++;
            if (endIdx == n) {

                break;
            }
        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(array, n, k);

        System.out.println(result);
    }
}
