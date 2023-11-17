package org.example.codingTest1.section1.problem10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(String str, char c) {

        int[] result1 = new int[str.length()];
        int[] result2 = new int[str.length()];

        int count = 0;
        int idx1 = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c) {

                while (count >= 0) {

                    result1[idx1++] = count--;
                }
                count = 0;
            } else {

                count++;
            }
        }

        if (count > 0) {

            for (int i = 1; i <= count; i++) {

                result1[idx1++] = i;
            }
        }

        int idx2 = str.length()-1;
        count = 0;
        for (int i = str.length()-1; i >= 0; i--) {

            if (str.charAt(i) == c) {

                while (count >= 0) {

                    result2[idx2--] = count--;
                }
                count = 0;
            } else {

                count++;
            }
        }

        if (count > 0) {

            for (int i = 1; i <= count; i++) {

                result2[idx2--] = i;
            }
        }

        int[] result = new int[str.length()];
        for (int i = 0; i < result.length; i++) {

            result[i] = result1[i] < result2[i] ? result1[i] : result2[i];
        }

        Arrays.stream(result1).forEach(e -> System.out.print(e + " "));
        System.out.println();
        Arrays.stream(result2).forEach(e -> System.out.print(e + " "));
        System.out.println();

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char c = sc.next().charAt(0);

        Main solution = new Main();
        int[] result = solution.solution(str, c);

        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}
