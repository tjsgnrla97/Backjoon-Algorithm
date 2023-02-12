package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1672 {
    //DNA 해독
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static final char[][] data = new char[][]{
            {'A', 'C', 'A', 'G'},
            {'C', 'G', 'T', 'A'},
            {'A', 'T', 'C', 'G'},
            {'G', 'A', 'G', 'T'}
    };
    static char[] ch;

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        ch = new char[n];
        String str = in.readLine();
        int len = str.length();

        for (int i = 0; i < len; i++)
            ch[i] = str.charAt(i);

        solution(len - 1);
        System.out.println(ch[0]);
    }

    static void solution(int len) {
        if (len < 1)
            return;

        char chTemp[] = new char[2];
        int n[] = new int[2];
        chTemp[0] = ch[len];
        chTemp[1] = ch[len - 1];
        for (int i = 0; i <= 1; i++) {
            if (chTemp[i] == 'A')
                n[i] = 0;
            if (chTemp[i] == 'G')
                n[i] = 1;
            if (chTemp[i] == 'C')
                n[i] = 2;
            if (chTemp[i] == 'T')
                n[i] = 3;
        }

        // ch배열 갱신 후 len-1을 계속 비교함
        ch[len - 1] = data[n[0]][n[1]];
        solution(len - 1);
    }
}
