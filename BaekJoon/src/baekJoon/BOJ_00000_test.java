package baekJoon;

import java.util.*;
import java.io.*;

public class BOJ_00000_test {
    static int[][] map;
    static boolean[][] visited;
    static int N, M;

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int answer = 0;

        while (true) {
            for (int i = 0; i < N; i++) {
                Arrays.fill(visited[i], false);
            }

            BFS();

            if (countCheese() == 0) {
                System.out.println(answer);
                return;
            } else {
                answer++;
            }
        }
    }

    static void BFS() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = current[0] + dx[i];
                int ny = current[1] + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (!visited[nx][ny]) {
                        visited[nx][ny] = true;
                        if (map[nx][ny] >= 1) {
                            map[nx][ny]++;
                        } else {
                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }
            }
        }
    }

    static int countCheese() {
        int count = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] >= 3) {
                    map[i][j] = 0;
                } else if (map[i][j] == 2) {
                    map[i][j] = 1;
                }

                if (map[i][j] == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}
