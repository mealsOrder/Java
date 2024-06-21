package baekJoon;

import java.io.*;

public class BOJ_01834_나머지와몫이같은수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long ans=0;
        long N = Integer.parseInt(br.readLine());
        for(long i=1;i<N;i++){
            ans += i*N+i;
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
