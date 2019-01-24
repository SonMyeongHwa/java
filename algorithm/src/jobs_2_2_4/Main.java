package jobs_2_2_4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();

            if(arr[i]==1) {
                cnt++;
            }
            else {
                cnt = 0;
            }
            sum = sum + cnt;
        }
        System.out.println(sum);
    }
}