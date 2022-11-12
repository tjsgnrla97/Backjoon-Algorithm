package step11;

import java.io.*;
import java.util.StringTokenizer;

public class Java_25501 {
    //3. 재귀의 귀재
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N,ans;
    static String S;
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(in.readLine());
        for (int tc=1; tc<=N; tc++){
            ans=0;
            S = in.readLine();
            System.out.println(isPalindrome(S)+" "+ans);
        }
    }

    private static int isPalindrome(String s) {
        return recursion(s, 0, s.length()-1);
    }

    private static int recursion(String s, int l, int r) {
        ans++;
        if(l>=r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s,l+1,r-1);
    }
}
