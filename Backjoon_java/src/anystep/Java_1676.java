package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1676 {
    //팩토리얼 0의 개수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(in.readLine());
        int ans = 0;
        while (num>=5){
            ans += num/5;
            num /=5;
        }
        System.out.println(ans);
    }
}
