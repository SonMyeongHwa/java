package jobs_5_3_3;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n+1];

        for(int i=0; i<=n; i++) {
            if(i==0 || i==1) {
                arr[i] = i;
            }
            else {
                arr[i] = arr[i-1]+arr[i-2];
            }
        }
        System.out.println(arr[n]);
    }
}