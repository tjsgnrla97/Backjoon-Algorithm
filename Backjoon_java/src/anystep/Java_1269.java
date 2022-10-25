package anystep;

import java.io.*;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Java_1269 {
    //대칭 차집합
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());

        int a = Integer.parseInt(stk.nextToken());
        int b = Integer.parseInt(stk.nextToken());
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < a; i++) {
            A.add(Integer.parseInt(stk.nextToken()));
        }
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < b; i++) {
            B.add(Integer.parseInt(stk.nextToken()));
        }
        int ans = 0;
        for (int num : A) {
            if (!B.contains(num)) {
                ans++;
            }
        }
        for (int num : B) {
            if (!A.contains(num)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
