package jobs_3_1_1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        int N = sc.nextInt();
        int arr[] = new int[5];
        for(int i=0; i<5; i++) {
            arr[i] = sc.nextInt();

            if(arr[i]==N) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
