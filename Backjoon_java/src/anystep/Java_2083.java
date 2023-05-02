package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2083 {
    //럭비 클럽
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        while (true) {
            stk = new StringTokenizer(in.readLine());
            String name = stk.nextToken();
            if (name.equals("#")) break;
            int age = Integer.parseInt(stk.nextToken());
            int kg = Integer.parseInt(stk.nextToken());
            if (age > 17 || kg >= 80) {
                System.out.println(name + " " + "Senior");
            } else {
                System.out.println(name + " " + "Junior");
            }
        }
    }
}
