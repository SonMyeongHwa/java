package acmicpc_11724;

import java.util.Scanner;

public class Main {

    static int N,M;
    static int arr[][];
    static int visit[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt(); //정점의 개수
        M=sc.nextInt(); //간선의 개수
        arr=new int[1001][1001]; //정점
        visit=new int[1001]; //방문

        for(int i=0;i<M;i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();

            arr[u][v]=1; //정점 u와 정점 v의 간선이 연결
            arr[v][u]=1; //무방향이기때문
        }

        int count=0;

        for(int i=1; i<=N;i++) {
            if(visit[i]==0) { //방문하지않았으면
                dfs(i);
                count++;
            }
        }
        System.out.println(count);

    }

    static void dfs(int a) {
        visit[a]=1; //방문한곳을 다시 방문하지 않도록

        for(int i=1;i<=N;i++) {
            if(arr[a][i]==1 && visit[i]==0){ //연결되어있고 방문x
                dfs(i);
            }
        }
    }
}
