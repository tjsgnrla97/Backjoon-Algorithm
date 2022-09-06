package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Java_17086 {
    //아기 상어 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N, M, ans;
    static int[][] map;
    static boolean[][] isVisited;
    static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
    static final int EMPTY_SPACE = 0;
    static final int SHARK = 1;
    public static void main(String[] args) throws IOException {
        input();
        solve();
        out.write(ans+"");
        out.flush();
        out.close();
        in.close();
    }

    private static void solve() {
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < M; x++) {
                if(map[y][x] == EMPTY_SPACE) bfs(y,x);
            }
        }
    }

    private static void bfs(int y, int x) {
        isVisited = new boolean[N][M];

        Queue<int[]> q = new LinkedList<>();
        isVisited[y][x] = true;
        q.add(new int[]{y,x});
        int cnt = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for (int s = 0; s < size; s++) {
                int[] current = q.poll();

                if (map[current[0]][current[1]] == SHARK) {
                    ans = Math.max(ans, cnt);
                    return;
                }

                for (int d = 0; d < 8; d++) {
                    int ny = current[0] + dy[d];
                    int nx = current[1] + dx[d];

                    if(!isRange(ny,nx) || isVisited[ny][nx]) continue;

                    isVisited[ny][nx] = true;
                    q.add(new int[]{ny,nx});
                }
            }
            cnt++;
        }
    }

    private static boolean isRange(int ny, int nx) {
        return ny >= 0 && ny < N && nx >= 0 && nx < M;
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        map = new int[N][M];

        for (int y = 0; y < N; y++) {
            stk = new StringTokenizer(in.readLine());
            for (int x = 0; x < M; x++) {
                map[y][x] = Integer.parseInt(stk.nextToken());
            }
        }
    }
}
