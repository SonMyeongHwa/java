package jobs_2_2_7;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int j =0 ;
        int N = sc.nextInt();
        int arr[] = new int[N];

        temp = N;
        do {
            arr[j] = temp%2;
            j++;
            temp = temp/2;
        } while(temp!=0);

        for(int i=j-1; i>=0; i--) {
            System.out.print(arr[i]);
        }
    }
}
