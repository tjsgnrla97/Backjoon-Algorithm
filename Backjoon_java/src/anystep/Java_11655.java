package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_11655 {
    //ROT13
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    public static void main(String[] args) throws IOException {
        char[] rot13 = in.readLine().toCharArray();
        for(int i=0; i<rot13.length; i++){
            if(rot13[i]>='A' && rot13[i] <='Z'){
                if(rot13[i]>='N'){
                    rot13[i] -= 13;
                }else{
                    rot13[i] += 13;
                }
            }else if(rot13[i]>='a' && rot13[i]<='z'){
                if(rot13[i]>='n'){
                    rot13[i] -= 13;
                }else{
                    rot13[i] += 13;
                }
            }
        }
        for(char ch : rot13) sb.append(ch);
        out.write(sb.toString());
        out.flush();
        out.close();
        in.close();
    }
}