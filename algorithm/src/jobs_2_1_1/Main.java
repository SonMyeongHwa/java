package jobs_2_1_1;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}