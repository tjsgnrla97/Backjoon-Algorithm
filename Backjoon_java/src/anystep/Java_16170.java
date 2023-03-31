package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Calendar;
import java.util.StringTokenizer;

public class Java_16170 {
    //오늘의 날짜는?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(cal.YEAR));
        System.out.println(cal.get(cal.MONTH) + 1);
        System.out.println(cal.get(cal.DATE));
    }
}
