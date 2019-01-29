package jobs_2_2_10;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //행
        int M = sc.nextInt(); //열
        int arr[][] = new int[N][M];
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                if(arr[i][j]==arr[A][B]) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
