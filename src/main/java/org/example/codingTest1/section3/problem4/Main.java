package org.example.codingTest1.section3.problem4;

import java.util.Scanner;

public class Main {

    public int solution(int[] array, int n, int m) {

        int count = 0;
        int startIdx = 0;
        int endIdx = 0;

        int sum = array[endIdx];

        while (true) {

            if (sum > m) {

                sum -= array[startIdx];
                startIdx++;
            } else if (sum < m) {

                endIdx++;

                if (endIdx == n) {

                    break;
                }
                sum += array[endIdx];
            } else {

                count++;
                sum -= array[startIdx];
                startIdx++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(array, n, m);

        System.out.println(result);
    }
}
