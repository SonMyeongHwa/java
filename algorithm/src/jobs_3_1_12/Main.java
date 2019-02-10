package jobs_3_1_12;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;
        int map[][] = new int[101][101];
        int N = sc.nextInt(); //색종이 수
        int arr[][] = new int[N][4]; //x y 너비 높이
        for(int i=0; i<N; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++) { //x y 너비 높이
            for(int j=arr[i][0]; j<arr[i][0]+arr[i][2]; j++) { //x부터 너비
                for(int k=arr[i][1]; k<arr[i][1]+arr[i][3]; k++) { //y부터 높이
                    map[j][k] = i+1;
                }
            }
            if(arr[i][0]+arr[i][2]>sum1) {
                sum1=arr[i][0]+arr[i][2];
            }
            if(arr[i][1]+arr[i][3]>sum2) {
                sum2=arr[i][1]+arr[i][3];
            }
        }

        for(int k=1; k<=N; k++) {
            int count = 0;
            for(int i=0; i<sum1; i++) {
                for(int j=0; j<sum2; j++) {
                    if(map[i][j]==k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
