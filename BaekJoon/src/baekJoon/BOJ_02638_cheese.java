package baekJoon;

import java.util.*;
import java.io.*;

public class BOJ_02638_cheese {
    static int N,M;
    static int cheeseCount = 0;
    static int[][]map;
    static boolean[][] vis;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        vis = new boolean[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1) cheeseCount++;
            }
        }
        int ans = 0;

        while(cheeseCount>0){
            BFS();
            meltCheese();
            ans++;
        }

        bw.write(ans+"\n");
        br.close();
        bw.flush();
        bw.close();
    }
    static void BFS(){
        Queue<int[]>queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        vis[0][0] = true;

        while(!queue.isEmpty()){
            int[] cur = queue.poll();

            for(int i=0;i<4;i++){
                int nx = cur[0]+dx[i];
                int ny = cur[1]+dy[i];

                if( nx>=0 && nx<N && ny>=0 && ny<M && !vis[nx][ny] && map[nx][ny] != 1){
                    vis[nx][ny] = true;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
    }
    static void meltCheese(){
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(map[i][j] == 1){
                    int cnt = 0;
                    for(int k=0;k<4;k++){
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        if( nx>=0 && nx<N && ny>=0 && ny<M && vis[nx][ny]){
                            cnt++;
                        }
                    }

                    if(cnt>=2){
                        map[i][j] = 0;
                        cheeseCount--;
                    }
                }
            }
        }
        for(int i=0;i<N;i++){
            Arrays.fill(vis[i],false);
        }
    }

}
