package baekJoon;

import java.io.*;
import java.util.*;

public class BOJ_01753_2 {
    static int V,E,K; // 정점의 수, 간선의 수, 시작 정점
    static ArrayList<Edge>[] list; // 그래프 정보를 저항할 인접 리스트
    static int[] dist; // 시작 정점(K)에서 각 정점까지의 최단 거리를 저장 할 배열

    // 간선 정보를 저장할 클래스
    static class Edge{
        int to,weight;
        public Edge(int to,int weight){
            this.to=to;
            this.weight=weight;
        }
    }
    // 다익스크라 알고리즘을 위해 사용할 노드 클래스
    static class Node implements Comparable<Node>{
        int vertex,distance;

        public Node(int vertex,int distance){
            this.vertex=vertex;
            this.distance=distance;
        }

        // 거리 기준으로 오름차순 정렬하기 위해 compareTo 메서드 구현
        @Override
        public int compareTo(Node o) {
            return this.distance-o.distance;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(br.readLine());
        // 그래프 초기화
        list = new ArrayList[V+1];
        for(int i=1;i<=V;i++){
            list[i] = new ArrayList<>();
        }

        // 그래프 정보 입력 받기
        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            list[a].add(new Edge(b,c));
        }

        // 최단 거리 배열 초기화
        dist = new int[V+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[K]=0;

        // 다익스트라 알고리즘 수행
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(K,0)); // 시작 정점을 우선순위 큐에 추가
        while(!pq.isEmpty()) {
            Node cur = pq.poll(); // 현재 최소 거리의 정점 선택
            int curV = cur.vertex;
            int curD = cur.distance;

            // 이미 처리된 정점이라면 무시
            if (curD > dist[curV]) continue;

            // 현재 정점에서 갈 수 있는 다른 정점 업데이트
            for (Edge edge : list[curV]) {
                int nextV = edge.to;
                int nextD = curD + edge.weight;

                // 새로운 거리가 기존 거리보다 작으면 업데이트
                if (nextD < dist[nextV]) {
                    dist[nextV] = nextD;
                    pq.offer(new Node(nextV, nextD));
                }
            }
        }

        // 결과 출력
        for(int i=1;i<=V;i++){
            if(dist[i] == Integer.MAX_VALUE) bw.write("INF\n");
            else bw.write(String.valueOf(dist[i]+"\n"));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
