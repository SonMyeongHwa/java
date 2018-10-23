package acmicpc_01158;

import java.util.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 0; //인원수
        int M = 0; //번째 사람 제거

        Queue<Integer> Q = new LinkedList<Integer>();

        N = sc.nextInt();
        M = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            Q.offer(i);
        }

        System.out.print("<");

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < M - 1; j++) {
                Q.offer(Q.poll());
            }
            System.out.print(Q.poll() + ", ");
        }
        System.out.print(Q.poll() + ">");
    }
}