package jobs_5_3_4;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);


        int sum = 0;
        int N = sc.nextInt(); //수열B의 길이
        int arr[] = new int[N]; //수열B
        int arr1[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
            if(i==0) {
                arr1[i] = arr[i];
                System.out.print(arr[i]+" ");
            }
            else {
                int temp = 0;
                for(int j=0; j<i; j++) {
                    temp = temp + arr1[j];
                }
                sum = arr[i] * (i+1) - temp;
                arr1[i] = sum;
                System.out.print(sum+" ");
            }
        }
    }
}

