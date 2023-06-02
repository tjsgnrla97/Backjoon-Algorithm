package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_6359 {
    //만취한 상범
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(in.readLine());
            boolean[] openDoor = new boolean[N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (j % i == 0) openDoor[j] = !openDoor[j];
                }
            }
            int ans = 0;
            for (int i = 1; i <= N; i++) {
                if (openDoor[i]) ans++;
            }
            System.out.println(ans);
        }
    }
}
