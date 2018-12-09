package acmicpc_01021;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //큐의 크기
        int M = sc.nextInt(); //뽑아내려는 수
        int head=0;
        int tail=N-1;

        int[] Q = new int[N*2];

        for(int i=0; i<N; i++)
        {
            Q[i]=i+1;
        }

        for(int j=0; j<M; j++)
        {
            int m = sc.nextInt();

            for(int i=0;i<N;i++)
            {
                if(m==Q[i])
                {
                    System.out.println(Q[head++]);
                }
                else
                {
                    Q[++tail]=Q[head];
                    head=head+1;
                }
            }
        }
        for(int i=0; i<N*2; i++)
        {
            System.out.println(Q[i]);
        }
    }

}
