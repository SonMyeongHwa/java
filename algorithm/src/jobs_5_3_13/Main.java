package jobs_5_3_13;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i=2; N>1;) {
            if(N%i==0) {
                System.out.println(i);
                N /= i;
            }
            else {
                i++;
            }
        }
    }
}
