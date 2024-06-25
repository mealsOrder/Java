package baekJoon;

import java.io.*;
import java.util.*;

class Node{
    int end;
    int weight;
    public Node(int end, int weight){
        this.end=end;
        this.weight=weight;
    }
}
public class BOJ_01753_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());
        boolean[] vis = new boolean[V+1];
        int[] ans = new int[V+1];
        List<Node>[] list = new List[V+1];

        for(int i=1;i<=V;i++){
            list[i] = new ArrayList<>();
            ans[i] = Integer.MAX_VALUE;
        }

        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[a].add(new Node(b,c));
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((o1, o2) -> o1.weight-o2.weight);
        ans[K]=0;
        pq.add(new Node(K,0));
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            if(!vis[cur.end]) vis[cur.end] = true;
            for(int i=0;i<list[cur.end].size();i++){
                Node next = list[cur.end].get(i);

                if(!vis[next.end] && cur.weight+next.weight < ans[next.end] ){
                    ans[next.end] = cur.weight+next.weight;
                    pq.add(new Node(next.end,ans[next.end]));
                }

            }
        }

        for(int i=1;i<=V;i++){
            if(ans[i] == Integer.MAX_VALUE) bw.write("INF\n");
            else bw.write(String.valueOf(ans[i]+"\n"));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
