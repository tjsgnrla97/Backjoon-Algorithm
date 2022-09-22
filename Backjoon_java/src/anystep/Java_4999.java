package anystep;

import java.io.*;
import java.util.StringTokenizer;

public class Java_4999 {
    //아!
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;

    public static void main(String[] args) throws IOException {
        String inputP = in.readLine();
        String inputD = in.readLine();

        int pCount = 0;
        for(int i=0; i<inputP.length(); i++) {
            char c = inputP.charAt(i);
            if(c == 'a') {
                pCount++;
            }
        }
        int dCount = 0;
        for(int i=0; i<inputD.length(); i++){
            char c = inputD.charAt(i);
            if(c=='a'){
                dCount++;
            }
        }
        if(dCount<=pCount){
            System.out.println("go");
        }
        else{
            System.out.println("no");
        }
    }
}
