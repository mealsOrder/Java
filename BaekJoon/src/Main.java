import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int ans=0;
        int N = Integer.parseInt(br.readLine());
        
        bw.write(String.valueOf(ans));
        bw.flush();
        bw.close();
        br.close();
    }

}
