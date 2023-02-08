package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_17350 {
    //2루수 이름이 뭐야
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        boolean chk = false;
        for (int i = 0; i < N; i++) {
            String str = in.readLine();
            if (str.equals("anj")) chk = true;
        }
        if (chk) System.out.println("뭐야;");
        else System.out.println("뭐야?");
    }
}
