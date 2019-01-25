package jobs_2_2_5;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int A[] = new int[10];
        for(int i=0; i<10; i++) {
            A[i] = sc.nextInt();
        }

        int B[] = new int [10];
        for(int i=0; i<10; i++) {
            B[i] = sc.nextInt();
        }

        for(int i=0; i<10; i++) {
            if(A[i]>B[i]) {
                a++;
            }
            else if(A[i]<B[i]) {
                b++;
            }
        }

        if(a>b) {
            System.out.println("A");
        }
        else if(b>a) {
            System.out.println("B");
        }
        else {
            System.out.println("D");
        }
    }
}