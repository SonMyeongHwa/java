package acmicpc_01931;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //회의의 수

        int[][] m = new int[N][2];

        for(int i=0; i<N; i++)
        {
            m[i][0] = sc.nextInt(); //시작 시간
            m[i][1] = sc.nextInt(); //끝나는 시간
        }


        quick(m, 0, N-1);

        int count = 0;
        int a = 0;

        for(int i=0; i<N; i++)
        {
            if(m[i][0]>=a)
            {
                a = m[i][1];
                count++;
            }
        }
        System.out.println(count);
    }

    public static void quick(final int[][] m, int left, int right) {
        int i, j;
        int[] pivot, temp;

        if(left < right) {
            i = left;
            j = right;
            pivot = m[left];

            while(i < j) {
                while(i < j && m[j][1] > pivot[1]) j--;
                while(i < j && m[i][1] <= pivot[1]) i++;

                temp = m[i];
                m[i] = m[j];
                m[j] = temp;
            }

            if(m[left][1] != m[i][1] || m[left][0] > m[i][0]) {
                temp = m[i];
                m[i] = m[left];
                m[left] = temp;
            }

            quick(m, left, i-1);
            quick(m, i+1, right);
        }
    }

}
