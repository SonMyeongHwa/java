package jobs_3_1_13;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int N = sc.nextInt(); //행 수
        int M = sc.nextInt(); //열 수
        int X = sc.nextInt(); //행 번호
        int Y = sc.nextInt(); //열 번호
        int arr[][] = new int[N+2][M+2];
        for(int i=1; i<N+1; i++) {
            for(int j=1; j<M+1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if(arr[X][Y]==1) {
            System.out.println("game over");
        }
        else {
            for(int i=X-1; i<=X+1; i++) {
                for(int j=Y-1; j<=Y+1; j++) {
                    if(arr[i][j]==1) {
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
