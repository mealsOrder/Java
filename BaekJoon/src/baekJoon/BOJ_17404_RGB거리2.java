package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_17404_RGB거리2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine()); // 집의 개수를 입력받음
        int[][] dp  = new int[N][3]; // 각 집을 칠하는 데 필요한 최소 비용을 저장할 배열
        int[][] arr = new int[N][3]; // 각 집을 칠하는 데 드는 비용을 입력받을 배열
        int ans=Integer.MAX_VALUE; // 최소 비용을 저장할 변수, 초기값은 최대값으로 설정

        // 각 집을 칠하는 데 드는 비용을 입력받음
        for(int i = 0; i<N; i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<3;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 첫 번째 집의 색깔을 각각 R, G, B로 고정하고, 이에 따른 최소 비용을 계산
        for(int k=0;k<3;k++){
            for(int i=0;i<3;i++){
                if( i == k) dp[0][i] = arr[0][i]; // 첫 번째 집의 색깔이 고정된 경우
                else dp[0][i] = 1000 * 1000 + 1; // 첫 번째 집의 색깔이 고정되지 않은 경우
            }

            // 두 번째 집부터 마지막 집까지 각 집을 칠하는 데 필요한 최소 비용을 계산
            for(int i=1;i<N;i++){
                dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+arr[i][0]; // 현재 집을 R로 칠하는 경우
                dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+arr[i][1]; // 현재 집을 G로 칠하는 경우
                dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+arr[i][2]; // 현재 집을 B로 칠하는 경우
            }

            // 마지막 집의 색깔이 첫 번째 집의 색깔과 다른 경우에 대해 최소 비용을 찾음
            for(int i=0;i<3;i++){
                if(i==k)continue; // 첫 번째 집과 색깔이 같은 경우는 제외
                ans = Math.min(ans,dp[N-1][i]); // 최소 비용 갱신
            }
        }

        bw.write(String.valueOf(ans)); // 최소 비용 출력
        bw.flush();
        bw.close();
        br.close();
    }
}
