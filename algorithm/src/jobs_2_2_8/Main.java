package jobs_2_2_8;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        String str = new String();
        int cnt = 0;
        int N = sc.nextInt();
        int S = sc.nextInt();

        for(int i=1; i<=N; i++) {
            str=""; //줄이 바뀔 때 초기화
            for(int k=1; k<=N-i; k++) {
                System.out.print(" ");
            }
            for(int j=1; j<i*2; j++) {
                if(i%2==0) { //짝수 줄
                    str = str + S;
                    S++;
                    cnt++;
                    if(S==10) {
                        S=1;
                    }
                    if(cnt==j+1) {
                        cnt = 0;
                    }
                }
                else { //홀수 줄
                    str = S + str;
                    S++;
                    cnt++;
                    if(S==10) {
                        S=1;
                    }
                    if(cnt==j+1) {
                        cnt = 0;
                    }
                }
            }
            System.out.println(str);
        }
    }
}