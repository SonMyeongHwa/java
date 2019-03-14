package acmicpc_05217;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        for(int i=0; i<N; i++) {
            int num = sc.nextInt();

            sb.append("Pairs for "+num+": ");

        for(int j=1; j<num; j++) {
                for(int k=j+1; k<num; k++) {
                    if(j+k==num) {
                        sb.append(j).append(" ").append(k).append(", ");
                    }
                }
            }
            if(num<=2) {
                sb.append("\n");
            }
            else {
                sb.replace(sb.length()-2,sb.length(),"\n");
            }
        }

        System.out.print(sb);
    }
}
