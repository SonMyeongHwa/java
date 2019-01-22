package jobs_2_2_2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int temp = 0;
        int cnt = 0;

        for(int i=0; i<9; i++) {
            arr[i] = sc.nextInt();

            if(arr[i]>temp) {
                temp = arr[i];
                cnt = i+1;
            }
        }
        System.out.println(temp);
        System.out.println(cnt);
    }
}