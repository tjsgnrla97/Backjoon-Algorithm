package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_10798 {
    //세로읽기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args) throws IOException {
        char[][] ch = new char[5][15];
        int max=0;

        for(int y=0; y<ch.length; y++){
            String str = in.readLine();
            if (max<str.length()) max = str.length();
            for (int x=0; x<str.length(); x++){
                ch[y][x] = str.charAt(x);
            }
        }
        for(int x=0; x<max; x++){
            for (int y=0; y<5; y++){
                if (ch[y][x]=='\0') continue;
                sb.append(ch[y][x]);
            }
        }
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}
