package step04;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_5597_add {
    //추가 2.과제 안 내신 분..?
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb= new StringBuilder();
    static int[] student = new int[31];
    static int[] ans = new int[2];
    public static void main(String[] args) throws IOException {
        for(int i=1; i<=28; i++){
            int num = Integer.parseInt(in.readLine());
            student[num]++;
        }
        int cnt=0;
        for(int i=1; i<=30; i++){
            if(student[i]==0) ans[cnt++] = i;
        }
        Arrays.sort(ans);
        for (int i=0; i<2; i++){
            System.out.println(ans[i]);
        }
    }
}
