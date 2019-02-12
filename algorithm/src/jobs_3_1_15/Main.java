package jobs_3_1_15;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int cnt = 1;
        int sum = 0;
        int temp = 0;
        int arr[] = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum/10);

        for(int i=0; i<10; i++) {
            for(int j=i; j>=1; j--) {
                if(arr[j-1]>arr[j]) {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        sum = 0;
        int a = 0;
        for(int i=0; i<9; i++) {
            if(arr[i]==arr[i+1]) {
                cnt++;
                if(cnt==10) {
                    a = arr[i];
                }
            }
            else {
                cnt = 1;
            }
            if(cnt>sum) {
                sum = cnt;
                a = arr[i];
            }
        }
        System.out.println(a);
    }
}