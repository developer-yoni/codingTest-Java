package org.example.codingTest1.section3.problem5;

import java.util.*;

public class Main {

    /** [수학적으로 해결] */
    public int solution(int n) {

        int limitCount = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;

            if (sum >= n) {

                limitCount = i;
                break;
            }
        }

        int result = 0;
        for (int i = 2; i <= limitCount; i++) {

            if (i % 2 == 0) {

                if ((n - (i / 2)) % i == 0) {

                    result++;
                }
            } else {

                if (n % i == 0) {

                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Main solution = new Main();
        int result = solution.solution(n);

        System.out.println(result );
    }
}
