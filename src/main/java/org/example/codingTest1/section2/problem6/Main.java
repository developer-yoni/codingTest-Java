package org.example.codingTest1.section2.problem6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private boolean isPrime(int n) {

        if (n == 1) {

            return false;
        }

        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    public List<Integer> solution(List<Integer> inputList) {

        List<Integer> tmp = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < inputList.size(); i++) {

            tmp.add(Integer.parseInt(new StringBuilder(inputList.get(i).toString()).reverse().toString()));
        }

        for (int i = 0; i < tmp.size(); i++) {

            if (isPrime(tmp.get(i))) {

                result.add(tmp.get(i));
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            inputList.add(sc.nextInt());
        }

        Main solution = new Main();
        List<Integer> result = solution.solution(inputList);

        result.forEach(e -> System.out.print(e + " "));
    }
}
