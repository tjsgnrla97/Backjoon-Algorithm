package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_1543 {
    //문서 검색
    // 문서 원문 ex) ababab 검색어 ba
    // a(ba)(ba)b 2개
    // replace함수 ba로 지우면 ab가 남음
    // 처음 ababab 길이 6자에서 최종문장 ab길이 2자를 빼면 지워진 문자는 4자
    // 검색어 ba의 길이 2로 지워진 문자길이 4를 나누면 지워진 문자개수 2개라는 것을 알 수 있다.
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String word = in.readLine();
        String keyword = in.readLine();
        int wordSize = word.length();
        int keywordSize = keyword.length();

        word = word.replace(keyword,"");
        int finalWordSize = word.length();
        System.out.println((wordSize - finalWordSize) / keywordSize);
    }
}
