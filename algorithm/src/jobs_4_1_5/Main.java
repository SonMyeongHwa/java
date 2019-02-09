package jobs_4_1_5;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int map[][] = new int[100][100];
        int arr[][] = new int[4][4];
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int count = 0;
        for(int i=0; i<4; i++) {
            for(int k=arr[i][1]; k<arr[i][3]; k++) {
                for(int j=arr[i][0]; j<arr[i][2]; j++) {
                    map[k][j]++;
                    if(map[k][j]==1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
