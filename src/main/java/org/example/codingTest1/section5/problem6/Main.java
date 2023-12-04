package org.example.codingTest1.section5.problem6;

import java.util.*;

public class Main {

    public static int solution(int n, int k) {

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {

            queue.add(i);
        }

        int count=0;
        while (true) {

            Integer poll = queue.poll();
            count++;
            if (count == k) {

                count = 0;
            } else {

                queue.add(poll);
            }

            if (queue.size() == 1) {
                break;
            }
        }

        return queue.poll();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        Main solution = new Main();
        int result = solution.solution(n, k);

        System.out.println(result);
    }
}
