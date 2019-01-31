package jobs_3_1_5;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int temp = 0;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[10];

        if(N>M) {
            temp = N;
        }
        else {
            temp = M;
        }
        for(int i=2; i<temp; i++) {
            if(N%i==0 && M%i==0) {
                arr[cnt] = i;
                cnt++;
                N = N/i;
                M = M/i;
            }
        }
        int sum = 1;
        for(int i=0; i<cnt; i++) {
            sum = sum * arr[i];
        }
        System.out.println(sum);
        System.out.println(sum*N*M);
    }
}