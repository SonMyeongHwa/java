package acmicpc_10866;

import java.util.Scanner;


public class Main {

    static int[] q = new int[20000];
    static int head = 10000, tail = 9999;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String temp;

        while (t-- > 0) {
            temp = sc.next();

            if ("push_front".equals(temp)) {

                int value = sc.nextInt();
                push_front(value);

            } else if ("push_back".equals(temp)) {

                int value = sc.nextInt();
                push_back(value);

            } else if ("pop_front".equals(temp)) {

                System.out.println(pop_front());

            } else if ("pop_back".equals(temp)) {

                System.out.println(pop_back());

            } else if ("front".equals(temp)) {

                System.out.println(front());

            } else if ("back".equals(temp)) {

                System.out.println(back());

            } else if ("size".equals(temp)) {

                System.out.println(size());

            } else {

                System.out.println(empty() ? 1 : 0);
            }
        }
    }

    static void push_front(int value) {
        q[--head] = value;
    }

    static void push_back(int value) {
        q[++tail] = value;
    }

    static int pop_front() {
        return empty() ? -1 : q[head++];
    }

    static int pop_back() {
        return empty() ? -1 : q[tail--];
    }

    static int front() {
        return empty() ? -1 : q[head];
    }

    static int back() {
        return empty() ? -1 : q[tail];
    }

    static int size() {
        return empty() ? 0 : tail - head + 1;
    }

    static boolean empty() {
        return head > tail ? true : false;
    }
}