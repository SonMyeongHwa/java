package acmicpc_05218;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        sc.nextLine();

        for(int i=0; i<N; i++) {
            String str = sc.nextLine();
            String[] strArr = str.split(" ");

            char arr1[] = strArr[0].toCharArray();
            char arr2[] = strArr[1].toCharArray();

            System.out.print("Distances: ");
            for(int j=0; j<arr1.length; j++) {
                int result = 0;
                if(arr2[j]<arr1[j]) {
                    result = (arr2[j]+26)-arr1[j];
                }
                else {
                    result = arr2[j] - arr1[j];
                }
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
}
