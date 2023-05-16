package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_2997 {
    //네 번째 수
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        int[] arr = new int[3];
        stk = new StringTokenizer(in.readLine());
        for (int i=0; i<3; i++){
            arr[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr);

        int N1 = arr[1] - arr[0];
        int N2 = arr[2] - arr[1];

        if(N1==N2){
            System.out.println(arr[2]+N1);
        }else if(N1<N2){
            System.out.println(arr[1]+N1);
        } else {
            System.out.println(arr[0]+N2);
        }
    }
}
