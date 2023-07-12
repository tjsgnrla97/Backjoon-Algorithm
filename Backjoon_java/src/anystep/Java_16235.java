package anystep;

import java.io.*;
import java.util.*;

public class Java_16235 {
    //나무 재테크
//    1. 모든 배열의 인덱스의 초기결과값을 5로 초기화
//    2. M개의 나무리스트 전체를 탐색한다.
//    3~5 봄 페이즈
//    3. 하나의 칸에 같은 나무가 동시에 존재한다면 나이가 어린순으로 동작한다.
//    4. 나무의 나이만큼 해당칸의 양분을 빼고 나무의 나이+1
//    5. 만일 나무의 나이>해당 칸의 양분 = 나무사망
//    6 여름 페이즈
//    6. 봄에 죽은 나무리스트 탐색 나무 나이/2를 해당 나무 칸의 양분에 더한다. 소수점 아래 버림
//    7 가을 페이즈
//    7. 나무리스트 탐색 나무의 나이가 5배수일 경우 인접 8칸 나이 1 나무 나무리스트 추가
//    8 겨울 페이즈
//    8. 처음 입력받은 A배열의 각 인덱스 결과만큼 배열에 추가
//    9. K년이 지난 후 생존한 나무리스트 개수를 출력
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N, M, K;
    static int[][] A, map;
    static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};

    static class Tree implements Comparable<Tree> {
        int y, x, age;

        public Tree(int y, int x, int age) {
            this.y = y;
            this.x = x;
            this.age = age;
        }

        @Override
        public int compareTo(Tree o) {
            return this.age - o.age;
        }
    }

    static Deque<Tree> treeList;
    static Queue<Tree> deadTreeList;
    static Queue<Tree> breedingTreeList;

    public static void main(String[] args) throws IOException {
        input();
        while (K-- > 0) {
            deadTreeList = new LinkedList<>();
            spring();
            summer();
            fall();
            winter();
        }
        System.out.println(treeList.size());
    }

    private static void winter() {
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                map[y][x] += A[y][x];
            }
        }
    }

    private static void fall() {
        breedingTreeList = new LinkedList<>();
        for (Tree breed : treeList) {
            if (breed.age % 5 == 0) {
                breedingTreeList.add(breed);
            }
        }

        while (!breedingTreeList.isEmpty()) {
            Tree current = breedingTreeList.poll();

            for (int d = 0; d < 8; d++) {
                int ny = current.y + dy[d];
                int nx = current.x + dx[d];
                if (ny < 0 || ny >= N || nx < 0 || nx >= N) continue;
                treeList.addFirst(new Tree(ny, nx, 1));
            }
        }
    }

    private static void summer() {
        for (Tree dead : deadTreeList) {
            map[dead.y][dead.x] += dead.age / 2;
        }
    }

    private static void spring() {
        for (int i = 0; i < treeList.size();) {
            Tree current = treeList.poll();
            if (map[current.y][current.x] >= current.age) {
                map[current.y][current.x] -= current.age;
                current.age++;
                i++;
                treeList.add(current);
            } else {
                deadTreeList.add(current);
            }
        }
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        N = Integer.parseInt(stk.nextToken());
        M = Integer.parseInt(stk.nextToken());
        K = Integer.parseInt(stk.nextToken());
        A = new int[N][N];
        map = new int[N][N];
        treeList = new LinkedList<>();
        for (int y = 0; y < N; y++) {
            stk = new StringTokenizer(in.readLine());
            for (int x = 0; x < N; x++) {
                A[y][x] = Integer.parseInt(stk.nextToken());
                map[y][x] = 5;
            }
        }
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(in.readLine());
            int y = Integer.parseInt(stk.nextToken()) - 1;
            int x = Integer.parseInt(stk.nextToken()) - 1;
            int age = Integer.parseInt(stk.nextToken());
            treeList.add(new Tree(y, x, age));
        }
    }
}
