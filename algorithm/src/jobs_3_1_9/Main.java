package jobs_3_1_9;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int N = 0; //행
        int M = 0; //열
        int arr[][] = new int[9][9];
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                arr[i][j] = sc.nextInt();

                if(arr[i][j] > temp) {
                    temp = arr[i][j];
                    N = i+1;
                    M = j+1;
                }
            }
        }
        System.out.println(temp);
        System.out.println(N+" "+M);
    }
}