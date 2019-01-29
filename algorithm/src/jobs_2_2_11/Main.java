package jobs_2_2_11;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int k = 1;
        int cnt = 0;
        int N = sc.nextInt();
        int arr[][] = new int[N][N];

        for(int i=0; i<N; i++) { //번째 줄
            k=k+i;
            cnt = k;
            for(int j=0; j<N-i; j++) {
                cnt = cnt + j + i;
                arr[i][j] = cnt;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}