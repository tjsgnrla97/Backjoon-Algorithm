package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2775 {
	//6. 부녀회장이 될테야
	//k층 n호 = (k-1)층 n(1+n)/2
	//0층 1~14호
	//0층 1, 2, 3
	//1층 1, 1+2, 1+2+3
	//2층 1, 1+(1+2), 1+(1+2)+(1+2+3)
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int[][] apt = new int[15][15];
	static int T,k,n;
	public static void main(String[] args) throws NumberFormatException, IOException {
		for(int i=0; i<15; i++) {
			apt[i][1]=1;
			apt[0][i]=i;
		}
		for(int a=1; a<15; a++) {
			for(int b=2; b<15; b++) {
				apt[a][b]=apt[a][b-1]+apt[a-1][b];
			}
		}
		T = Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			k = Integer.parseInt(in.readLine());
			n = Integer.parseInt(in.readLine());
			sb.append(apt[k][n]).append("\n");
		}
		sb.setLength(sb.length()-1);
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}

}
