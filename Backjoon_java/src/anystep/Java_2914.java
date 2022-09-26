package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_2914 {
    //저작권
//    저작권이 있는 멜로디의 개수 X/앨범에 수록된 곡의 개수 A= 올림한 평균 값 I
//    구하는 값은 X의 최솟 값(적어도라는 말이 있음)
//    X = I * A (I는 올림한 수 ex:I가 24일 때 23<I<=24)
//    I=24로 입력 값이 들어오면 X의 최솟 값을 찾기 위해 I의 최소치를 입력해줘야함.
//    I=24가 올림수면 최솟값을 가정하면 I=23.01이라 하고 A=38일 때 X=874.38
//    멜로디의 개수는 정수이므로 소수일 수가 없기에 X 또한 올림해야한다.
//    따라서 X = A * (I-1) + 1
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        stk = new StringTokenizer(in.readLine());
        int A = Integer.parseInt(stk.nextToken());
        int I = Integer.parseInt(stk.nextToken());
        System.out.println(A*(I-1)+1);
    }
}
