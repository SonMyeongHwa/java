package acmicpc_01260;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N,M,V;
    static int arr[][];
    static int visit[];

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt(); //정점의 개수
        M=sc.nextInt(); //간선의 개수
        V=sc.nextInt(); //탐색을 시작 할 정점의 번호
        arr=new int[1001][1001]; //정점
        visit=new int[1001]; //방문

        for(int i=0; i<M ;i++) {
            int u=sc.nextInt();
            int v=sc.nextInt();

            arr[u][v]=1; //정점 u와 정점 v의 간선이 연결
            arr[v][u]=1; //무방향이기때문
        }

        dfs(V);

        for(int i=1 ; i<=N ; i++) {
            visit[i] = 0;
        }
        System.out.println();

        bfs(V);
    }

    public static void bfs(int a){
        Queue <Integer> q = new <Integer> LinkedList();

        q.offer(a); //큐에 넣기
        visit[a] = 1; //방문한곳을 다시 방문하지 않도록

        while(!q.isEmpty()) { //큐가 비어있지않으면
            int temp = q.poll(); //가장 앞에있는 데이터 삭제
            System.out.print(temp+" ");

            for(int i=1; i<=N; i++) {
                if(arr[temp][i]==1 && visit[i]==0) { //연결되어있고 방문x
                    q.offer(i); //큐에 넣기
                    visit[i] = 1; //방문
                }
            }
        }
    }
    static void dfs(int a) {
        visit[a]=1; //방문한곳을 다시 방문하지 않도록
        System.out.print(a+" ");
        for(int i=1;i<=N;i++) {
            if(arr[a][i]==1 && visit[i]==0){ //연결되어있고 방문x
                dfs(i);
            }
        }
    }
}
