package jobs_2_2_9;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        int N = sc.nextInt(); //행
        int M = sc.nextInt(); //열
        int arr[][] = new int[N][M];

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = cnt++;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
