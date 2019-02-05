package jobs_5_1_1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int N = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<k; i++) {
            for(int j=0; j<N-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(arr[N-k]);
    }
}