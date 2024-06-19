package baekJoon;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_05347_LCM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            // 100만 이하의 두 자연수 곱은 int 범위를 벗어 날 수 있으므로 long 으로 선언!!
            long a = Integer.parseInt(st.nextToken());
            long b = Integer.parseInt(st.nextToken());
            long ans = a*b/GCD(a,b);
            bw.write(ans+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }

    static long GCD(long a,long b){
        long r = a%b;
        while(r!=0){
            a = b;
            b = r;
            r = a%b;
        }
        return b;
    }
}
