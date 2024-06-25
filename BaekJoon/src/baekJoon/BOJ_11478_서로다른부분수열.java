package baekJoon;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BOJ_11478_서로다른부분수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        Set<String> set = new HashSet<>();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                set.add(str.substring(i,j));
            }
        }
        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
        br.close();
    }
}
