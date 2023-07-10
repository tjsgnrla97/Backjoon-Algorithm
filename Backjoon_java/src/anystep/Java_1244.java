package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_1244 {
    //스위치 켜고 끄기
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(in.readLine());
//        int[] Switch = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] Switch = new int[N];
        stk = new StringTokenizer(in.readLine());
        for (int i = 0; i < N; i++) {
            Switch[i] = Integer.parseInt(stk.nextToken());
        }
        int M = Integer.parseInt(in.readLine());
        for (int n = 0; n < M; n++) {
            stk = new StringTokenizer(in.readLine());
            int gender = Integer.parseInt(stk.nextToken());
            int num = Integer.parseInt(stk.nextToken());
            if (gender == 1) {
                for (int i = 0; i < Switch.length; i++) {
                    if ((i + 1) % num == 0) {
                        if (Switch[i] == 1) {
                            Switch[i] = 0;
                        } else {
                            Switch[i] = 1;
                        }
                    }
                }
            } else {
                if(Switch[(num-1)]==1){
                    Switch[(num-1)]=0;
                }else{
                    Switch[(num-1)]=1;
                }
                int k = 1;
                while (true) {
                    if ((num - 1) - k < 0 || (num - 1) + k >= N) break;
                    if (Switch[(num - 1) - k] == Switch[(num - 1) + k]) {
                        if (Switch[(num - 1) - k] == 1) {
                            Switch[(num - 1) - k] = 0;
                            Switch[(num - 1) + k] = 0;
                        } else{
                            Switch[(num - 1) - k] = 1;
                            Switch[(num - 1) + k] = 1;
                        }
                        k++;
                    } else break;
                }
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(Switch[i] + " ");
            if ((i + 1) % 20 == 0) System.out.println();
        }
    }
}
