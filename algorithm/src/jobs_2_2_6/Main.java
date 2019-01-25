package jobs_2_2_6;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int N = sc.nextInt();
        int sum[] = new int[N];
        int arr[][] = new int[N][3];
        for(int i=0; i<N; i++) {
            for(int j=0; j<3; j++) {
                arr[i][j] = sc.nextInt();
            }
            if(arr[i][0]==arr[i][1]) {
                if(arr[i][1]==arr[i][2]) { //같은눈 3개
                    sum[i] = 10000 + arr[i][1] * 1000;
                }
                else { //같은눈 2개
                    sum[i] = 1000 + arr[i][0] * 100;
                }
            }
            else {
                if(arr[i][1]==arr[i][2] || arr[i][0]==arr[i][2]) {//같은눈 2개
                    sum[i] = 1000 + arr[i][2] * 100;
                }
                else { //같은눈 1개
                    if(arr[i][0]>arr[i][1]) {
                        if(arr[i][0]>arr[i][2]) {
                            sum[i] = arr[i][0] * 100;
                        }
                        else {
                            sum[i] = arr[i][2] * 100;
                        }
                    }
                    else {
                        if(arr[i][1]>arr[i][2]) {
                            sum[i] = arr[i][1] * 100;
                        }
                        else {
                            sum[i] = arr[i][2] * 100;
                        }
                    }
                }
            }
            if(sum[i]>=temp) {
                temp = sum[i];
            }
        }
        System.out.println(temp);
    }
}
