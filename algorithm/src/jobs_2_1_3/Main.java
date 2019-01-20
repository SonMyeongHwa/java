package jobs_2_1_3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int k=1; k<=n-i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
