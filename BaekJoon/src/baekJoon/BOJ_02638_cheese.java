package baekJoon;

import java.util.*;
import java.io.*;

public class BOJ_02638_cheese {
    static int N,M;
    static int[][] map;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] vis;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        vis = new boolean[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int ans = 0;
        while (true){
            for(int i=0;i<N;i++){
                Arrays.fill(vis[i],false);
            }
            BFS();

            if(cheeseCount() == 0){
                System.out.println(ans);
                return;
            } else{
                ans++;
            }

        }
    }

    static void BFS(){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        vis[0][0] = true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for(int i=0;i<4;i++){
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];

                if(nx>=0 && nx<N && ny>=0 && ny<M){
                    if(!vis[nx][ny]){
                        vis[nx][ny] = true;
                       if(map[nx][ny] >= 1 ){
                           map[nx][ny]++;
                       } else{
                           queue.offer(new int[]{nx,ny});
                       }
                    }
                }
            }
        }
    }

    static int cheeseCount(){
        int count = 0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j] >=3){
                    map[i][j] = 0;
                }
                else if(map[i][j] == 2){
                    map[i][j] = 1;
                }

                if(map[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }

}
