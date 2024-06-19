package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_01568_bird {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int time = 0;
        int i = 1;
        while(N>0){
            if(N < i){
                i = 1;
            }
            N = N - i;
            i++;
            time++;
        }
        System.out.println(time);
    }
}
