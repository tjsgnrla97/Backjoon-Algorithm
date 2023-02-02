package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_16199 {
    //나이 계산하기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int by = Integer.parseInt(stk.nextToken());
        int bm = Integer.parseInt(stk.nextToken());
        int bd = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int ty = Integer.parseInt(stk.nextToken());
        int tm = Integer.parseInt(stk.nextToken());
        int td = Integer.parseInt(stk.nextToken());

        int age = ty - by;

        if (by == ty) {
            System.out.println(age);
        } else {
            if (bm > tm) {
                System.out.println(age - 1);
            } else if (bm == tm) {
                if (bd <= td) {
                    System.out.println(age);
                } else {
                    System.out.println(age - 1);
                }
            } else {
                System.out.println(age);
            }
        }
        System.out.println(age + 1);
        System.out.println(age);
    }
}
