package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_14500_테트로미노 {
    static  int N,M; // 맵의 세로 크기 N과 가로 크기 M
    static int [][] map; // 맵 정보를 저장할 2차원 배열
    static boolean[][] vis; // 각 위치를 방문했는지 여부를 저장할 2차원 배열
    static int[]dx={0,0,-1,1}; // 상하좌우로 이동하기 위한 x좌표 변화량
    static int[]dy={-1,1,0,0}; // 상하좌우로 이동하기 위한 y좌표 변화량
    static int max; // 테트로미노의 최대 합을 저장할 변수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        N = Integer.parseInt(st.nextToken()); // 맵의 세로 크기 입력
        M = Integer.parseInt(st.nextToken()); // 맵의 가로 크기 입력
        map = new int[N][M]; // 맵 정보를 저장할 2차원 배열 초기화
        vis = new boolean[N][M]; // 방문 여부를 저장할 2차원 배열 초기화
        for(int i=0;i<N;i++){ // 맵 정보 입력
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0;i<N;i++){ // 모든 위치에 대해
            for(int j=0;j<M;j++){
                // 백트레킹
                vis[i][j] = true; // 현재 위치를 방문했다고 표시
                dfs(i,j,0,0); // 깊이 우선 탐색으로 테트로미노의 최대 합 계산
                vis[i][j] = false; // 현재 위치의 방문 여부를 원래대로 돌림

                // 'ㅗ', 'ㅜ' 모양 테트로미노에 대해 별도로 계산
                if( j+2 <M){
                    int temp = map[i][j] + map[i][j+1]+map[i][j+2];
                    //'ㅗ'
                    if(i-1>=0){
                        int res = temp + map[i-1][j+1];
                        max = Math.max(max,res);
                    }
                    //'ㅜ'
                    if(i+1<N){
                        int res = temp + map[i+1][j+1];
                        max = Math.max(max,res);
                    }
                }
                // 'ㅏ', 'ㅓ' 모양 테트로미노에 대해 별도로 계산
                if(i+2 < N){
                    int temp = map[i][j]+map[i+1][j]+map[i+2][j];
                    // 'ㅓ'
                    if(j-1>=0){
                        int res = temp + map[i+1][j-1];
                        max = Math.max(max,res);
                    }
                    // 'ㅏ'
                    if(j+1<M){
                        int res = temp+map[i+1][j+1];
                        max = Math.max(max,res);
                    }
                }
            }
        }
        bw.write(String.valueOf(max)); // 테트로미노의 최대 합 출력
        bw.flush();
        bw.close();
        br.close();
    }
    static void dfs(int x,int y,int depth,int sum){ // 깊이 우선 탐색 함수
        if(depth==4){ // 4개의 블록을 선택했다면
            max = Math.max(max,sum); // 최대 합 갱신
            return;
        }
        for(int i=0;i<4;i++){ // 상하좌우로 이동
            int nx = x+dx[i];
            int ny = y+dy[i];

            if(nx<0||nx>=N||ny<0||ny>=M)continue; // 맵을 벗어나면 건너뜀
            if(vis[nx][ny])continue; // 이미 방문한 위치면 건너뜀

            // 백트레킹
            vis[nx][ny]=true; // 현재 위치를 방문했다고 표시
            dfs(nx,ny,depth+1,sum+map[nx][ny]); // 다음 블록을 선택
            vis[nx][ny]=false; // 현재 위치의 방문 여부를 원래대로 돌림
        }
    }
}
