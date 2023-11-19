package org.example.codingTest1.section2.problem5;

import java.util.Scanner;

public class Main {

    public int solution(int n) {

        boolean[] eratos = new boolean[n+1];
        eratos[0] = false;
        eratos[1] = false;

        for (int i = 2; i < n + 1; i++) {

            eratos[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            for (int j = i * 2; j <= n; j += i) {

                eratos[j] = false;
            }
        }

        int count = 0;
        for (int i = 0; i < eratos.length; i++) {

            if (eratos[i]) {

                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Main solution = new Main();
        int result = solution.solution(n);

        System.out.println(result);
    }
}
