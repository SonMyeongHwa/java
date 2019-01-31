package jobs_3_1_6;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //행
        int M = sc.nextInt(); //열
        int arr[][] = new int[N][M];
        for(int i=0; i<N; i++) {
            for(int j=M-1; j>=0; j--) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
