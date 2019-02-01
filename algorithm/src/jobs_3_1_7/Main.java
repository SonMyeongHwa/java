package jobs_3_1_7;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int arr[][] = new int[10][10];
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                arr[i][j] = 0;
            }
        }

        for(int k=0; k<N; k++) {
            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if((i==k || j==k) && arr[i][j]==0) {
                        arr[i][j] = 1;
                    }
                    else if((i==k || j==k) && arr[i][j]==1) {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}