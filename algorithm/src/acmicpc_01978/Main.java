package acmicpc_01978;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        boolean [] a = new boolean[1001];
        int []num = new int[N];
        int count=0;

        a[0] = a[1] = true;

        for(int i=0; i<N; i++)
        {
            num[i] = sc.nextInt();
        }

        for(int i=2; i<=1000; i++) //0과 1은 제외
        {
            if(a[i]==false)
            {
                for(int j=i+i; j<=1000; j+=i)
                {
                    a[j]=true;
                }
            }
        }

        for(int i=0; i<N; i++)
        {
            if(!a[num[i]]) count++;
        }
        System.out.println(count);
    }
}
