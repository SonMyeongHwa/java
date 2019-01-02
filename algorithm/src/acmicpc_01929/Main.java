package acmicpc_01929;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();
        boolean [] a = new boolean[N+1];

        for(int i=2; i<=N; i++) //0과 1은 제외
        {
            if(a[i]==false)
            {
                for(int j=i+i; j<=N; j+=i)
                {
                    a[j]=true;
                }

                if(i>=M && i<=N)
                {
                    System.out.println(i);
                }
            }
        }
    }
}