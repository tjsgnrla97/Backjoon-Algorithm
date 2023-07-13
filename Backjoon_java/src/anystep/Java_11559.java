package anystep;

import java.io.*;
import java.util.*;

public class Java_11559 {
    //Puyo Puyo
//      1. 필드를 배열에 초기화 시켜준다.
//      2. 입력받은 필드를 탐색하다가 뿌요를 만나면 BFS 알고리즘을 시작한다.
//      3. 뿌요의 근처에 같은색의 뿌요가 몇개인지 체크한다.
//      4. 같은 색의 뿌요가 4개 이상일 경우 해당 뿌요들을 연쇄시켜 없앤다.
//      5. 연쇄가 일어난 후에 뿌요들을 아래로 떨어뜨리고 연쇄수를 하나 늘려준다. 연쇄가 더 이상 없으면 탐색을 종료한다.
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static char[][] map;
    static boolean[][] isVisited;
    static int N = 12, M = 6, Ans = 0;
    static int[] dy = {-1, 1, 0, 0};
    static int[] dx = {0, 0, -1, 1};

    static class Puyo {
        int y, x;

        public Puyo(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }

    static List<Puyo> puyoList;

    public static void main(String[] args) throws IOException {
        input();
        while (true) {
            boolean isFinished = true;
            isVisited = new boolean[N][M];
            for (int y = 0; y < N; y++) {
                for (int x = 0; x < M; x++) {
                    if (map[y][x] != '.') {
                        puyoList = new ArrayList<>();
                        bfs(map[y][x], y, x);

                        if (puyoList.size() >= 4) {
                            for (int i = 0; i < puyoList.size(); i++) {
                                map[puyoList.get(i).y][puyoList.get(i).x] = '.';
                            }
                            isFinished = false;
                        }
                    }
                }
            }
            if (isFinished) break;
            redrawMap();
            Ans++;
        }
        System.out.println(Ans);
    }

    private static void redrawMap() {
        for (int x = 0; x < M; x++) {
            for (int y = N - 1; y > 0; y--) {
                if (map[y][x] == '.') {
                    for (int i = y - 1; i >= 0; i--) {
                        if (map[i][x] != '.') {
                            map[y][x] = map[i][x];
                            map[i][x] = '.';
                            break;
                        }
                    }
                }
            }
        }
    }

    private static void bfs(char c, int y, int x) {
        Queue<Puyo> q = new LinkedList<>();
        puyoList.add(new Puyo(y, x));
        q.offer(new Puyo(y, x));
        isVisited[y][x] = true;

        while (!q.isEmpty()) {
            Puyo current = q.poll();

            for (int d = 0; d < 4; d++) {
                int ny = current.y + dy[d];
                int nx = current.x + dx[d];

                if (ny < 0 || nx < 0 || ny >= N || nx >= M || isVisited[ny][nx] || map[ny][nx] != c) continue;
                isVisited[ny][nx] = true;
                puyoList.add(new Puyo(ny, nx));
                q.offer(new Puyo(ny, nx));
            }
        }
    }


    private static void input() throws IOException {
        map = new char[N][M];
        for (int y = 0; y < N; y++) {
            map[y] = in.readLine().toCharArray();
        }
    }
}
