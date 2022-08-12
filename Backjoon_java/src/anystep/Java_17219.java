package anystep;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class Java_17219 {
    //비밀번호 찾기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());
        Map<String, String> site = new HashMap<>();
        for(int i=0; i<N; i++){
            stk = new StringTokenizer(in.readLine());
            site.put(stk.nextToken(), stk.nextToken());
        }
        String[] search = new String[M];
        for(int i=0; i<M; i++){
            search[i] = in.readLine();
        }
        for(String str : search){
            sb.append(site.get(str)).append("\n");
        }
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
