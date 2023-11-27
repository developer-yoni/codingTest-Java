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

            if (endIdx >= array.length) {

                break;
            }

            if (array[endIdx] == 0) {

                if (countOfK > 0) {

                    countOfK--;
                } else {

                    count--;
                    if (array[startIdx] == 0) {

                        countOfK++;
                    }
                    startIdx++;
                    continue;
                }
            }

            count++;
            if (count > max) {

                max = count;
            }
            endIdx++;
        }

        return max;
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
