package acmicpc_01026;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //개수
        int A[] = new int[N];
        int B[] = new int[N]; //건들x
        int C[] = new int[N]; //B 복사본
        int S=0; //배열끼리 곱해서 더한 값

        for(int i=0; i<N; i++)
        {
            int a = sc.nextInt();
            A[i]=a;
        }

        for(int i=0; i<N; i++)
        {
            int b = sc.nextInt();
            B[i]=b;
            C[i]=b;
        }

        for(int i=0; i<N; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                int temp=0;
                if(A[i]>A[j])
                {
                    temp = A[j];
                    A[j] = A[i];
                    A[i] = temp;
                }
            }

        }

        for(int i=0; i<N; i++)
        {
            for(int j=i+1; j<N; j++)
            {
                int temp=0;
                if(C[i]<C[j])
                {
                    temp = C[j];
                    C[j] = C[i];
                    C[i] = temp;
                }

            }

        }

        for(int i=0; i<N; i++)
        {
            int s=0;
            s = A[i]*C[i];
            S = S+s;
        }
        System.out.println(S);
    }

}
