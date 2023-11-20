package org.example.codingTest1.section2.problem8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int[] array) {

       Queue<Integer> priorityQueue = new PriorityQueue<>((e1, e2) -> e2 - e1);
        for (int i = 0; i < array.length; i++) {

            priorityQueue.add(array[i]);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int idx = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {

            Integer poll = priorityQueue.poll();
            if (map.containsKey(poll)) {

                count++;
            } else {

                idx += count;
                map.put(poll, idx);
                count = 1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {

            result.add(map.get(array[i]));
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {

            array[i] = sc.nextInt();
        }

        Main solution = new Main();
        List<Integer> result = solution.solution(array);

        result.forEach(e -> System.out.print(e + " "));
    }
}
