package submission;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(0);

        System.out.println(pq.size());

        for (int i=0; i<pq.size(); i++) {
            System.out.println(pq.peek());
        }
    }
}
