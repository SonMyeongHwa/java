package jobs_2_2_3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int temp = 0;
        int arr1[] = new int[9];
        int arr2[] = new int[9];
        for(int i=0; i<9; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }
        for(int i=0; i<9; i++) {
            for(int j=i+1; j<9; j++) {
                if(arr2[i]>arr2[j]) {
                    temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
        for(int i=0; i<9; i++) {
            if(arr1[i]==arr2[1]) {
                System.out.println(arr2[1]);
                System.out.println(i+1);
            }
        }
    }
}
