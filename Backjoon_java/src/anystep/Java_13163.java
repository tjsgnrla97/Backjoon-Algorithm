package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_13163 {
    //닉네임에 갓 붙이기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());

        final String PREFIX = "god";
        for(int i=0; i<N; i++) {
            sb.append(PREFIX);
            String[] str = in.readLine().split(" ");
            for(int j = 1; j<str.length; j++) {
                sb.append(str[j]);
            }
            sb.append("\n");
        }
        sb.setLength(sb.length()-1);
        System.out.print(sb);
    }
}
