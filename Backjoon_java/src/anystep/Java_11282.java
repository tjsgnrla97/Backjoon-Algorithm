package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_11282 {
    //한글
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        //아스키코드 값 맞추기
        N += 44031;
        //한글로 출력하기 위한 char 형변환
        char ch = (char) N;
        System.out.println(ch);
    }
}
