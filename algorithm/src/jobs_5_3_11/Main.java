package jobs_5_3_11;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int N = sc.nextInt(); //수의 개수
        int arr[] = new int[N];
        for(int i=0; i<N; i++) {
            boolean flag = false; /*소수  (숫자를 받을때 마다 flag를 초기화 해야돼서
                                        반복문 안에 있어야된다.)*/
            arr[i] = sc.nextInt();

            if(arr[i]==1) {
                flag = true;
            }
            for(int j=2; j<arr[i]; j++) {
                if(arr[i]%j==0) {
                    flag = true; //소수x
                }
            }
            if(flag==false) {
                count++;
            }
        }
        System.out.println(count);
    }
}
