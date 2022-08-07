package anystep;


import java.io.*;
import java.util.StringTokenizer;

public class Java_13458 {
    //시험 감독
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
        int[] arr = new int[N];
        stk = new StringTokenizer(in.readLine());
        for(int i=0; i<N; i++) arr[i] = Integer.parseInt(stk.nextToken());
        stk = new StringTokenizer(in.readLine());
        int B = Integer.parseInt(stk.nextToken());
        int C = Integer.parseInt(stk.nextToken());

        long cnt = 0;
        for(int i=0; i<arr.length; i++){
            long res = 0;
            if(arr[i]<=B){
                cnt++;
                continue;
            }
            else{
                cnt++;
                arr[i]-=B;
                if(arr[i]%C==0) cnt+=arr[i]/C;
                else cnt+=arr[i]/C+1;
            }
        }
        out.write(cnt+"");
        out.flush();
        out.close();
        in.close();
    }
}
