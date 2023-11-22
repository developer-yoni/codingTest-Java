package org.example.codingTest1.section3.problem3;

import java.util.*;

public class Main {

    public int solution(int[] array, int windowSize) {

        int slidingWindow = 0;
        for (int i = 0; i < windowSize; i++) {

            slidingWindow += array[i];
        }

        int max = slidingWindow;
        for (int i = 0; i < array.length - windowSize; i++) {

            slidingWindow -= array[i];
            slidingWindow += array[i+windowSize];

            if (slidingWindow > max) {

                max = slidingWindow;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arraySize = sc.nextInt();
        int windowSize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        int result = solution.solution(array, windowSize);

        System.out.println(result);
    }
}
