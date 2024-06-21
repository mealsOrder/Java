package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_02476_주사위게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int res = 0;
        for(int i=0;i<N;i++){
            int ans=0;
            st = new StringTokenizer(br.readLine()," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if( a==b && b == c &&a==c){
                ans = 10000+a*1000;
            }
            else if(a==b || b==c || c==a){
                if(a==b) ans = 1000+100*a;
                else if(b==c) ans =1000+100*b;
                else ans = 1000+100*c;
            }
            else{
                ans = Math.max(a,Math.max(b,c))*100;
            }
            res = Math.max(ans,res);
        }
        bw.write(String.valueOf(res)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
