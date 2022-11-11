package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_14719 {
    //빗물
    //메모리 14644KB 시간 144ms
    //첫번째와 마지막을 탐색인덱스에서 제외하고 현재 인덱스 기준 왼쪽과 오른쪽 기둥중 가장 큰 기둥을 찾는다.
    //두 기둥 중 더 작은 쪽 기둥의 높이와 현재 인덱스 기둥 높이를 빼면 현재 인덱스에 잠긴 빗물 높이가 나온다.
    //Solution 1.
    //1. 현재 인덱스 기둥 기준 왼쪽에서 가장 높은 기둥 찾기
    //2. 현재 인덱스 기둥 기준 오른쪽에서 가장 높은 기둥 찾기
    //3. 두 기둥 중 더 작은 기둥 선택
    //4. 3번 기둥 - 현재 인덱스 기둥 높이 = 빗물 높이
    //5. 첫번째, 마지막 인덱스 제외하고 탐색을 진행하여 현재 인덱스의 빗물높이의 총합을 구함.
    //6. 최종 누적 빗물 출력
    //풀이시간 1시간 1분 15초
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int H, W;
    static int rain, left, right;
    static int[] map;

    public static void main(String[] args) throws IOException {
        input();
        rainSolve();
        System.out.println(rain);
    }

    private static void input() throws IOException {
        stk = new StringTokenizer(in.readLine());
        H = Integer.parseInt(stk.nextToken());
        W = Integer.parseInt(stk.nextToken());
        map = new int[W];
        rain = left = right = 0;
        stk = new StringTokenizer(in.readLine());
        for (int x = 0; x < W; x++) {
            map[x] = Integer.parseInt(stk.nextToken());
        }
    }

    private static void rainSolve() {
        for (int x = 1; x < W - 1; x++) {
            left = right = 0;
            for (int l = 0; l < x; l++) {
                left = Math.max(map[l], left);
            }
            for (int r = x + 1; r < W; r++) {
                right = Math.max(map[r], right);
            }
            if (map[x] < left && map[x] < right) {
                rain += Math.min(left, right) - map[x];
            }
        }
    }
}
