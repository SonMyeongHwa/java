package jobs_2_1_4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;

        for(int i=n; i<=m; i++) {
            int cnt = 0;

            for(int j=1; j<=i; j++) {
                if(i%j==0) {
                    cnt++;
                }
            }
            if(cnt==2) {
                System.out.print(i+" ");
            }
        }
    }
}
