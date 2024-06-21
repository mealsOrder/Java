package baekJoon;

import java.io.*;

public class BOJ_10987_모음의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ans=0;
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c =='a' || c=='e' || c=='o' || c=='i' || c=='u'){
                ans++;
            }
        }
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}
