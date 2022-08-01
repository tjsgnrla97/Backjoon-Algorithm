package anystep;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_1977 {
    //완전제곱수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int M = Integer.parseInt(in.readLine());
        int N = Integer.parseInt(in.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=100; i++){
            int power = (int)Math.pow(i,2);
            if(power<=N && power>=M) list.add(power);
            if(power>N) break;
        }
        if(list.size()==0) out.write(-1+"\n");
        else{
            int sum=0;
            for(int i=0; i<list.size(); i++) {
                sum += list.get(i);
            }
            out.write(sum+"\n");
            out.write(list.get(0)+"\n");
        }

        out.flush();
        out.close();
        in.close();
    }
}
