package jobs_3_1_3;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();

            sum = sum + arr[i] * arr[i];
        }
        System.out.println(sum%10);
    }
}