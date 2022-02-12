package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_14696 {
	// 딱지놀이
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb= new StringBuilder();
	static int T, CNA, CNB;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			stk= new StringTokenizer(in.readLine());
			CNA=Integer.parseInt(stk.nextToken());
			int [][] cardA = new int[4][100];
			for(int n=0; n<CNA; n++) {
				int shape = Integer.parseInt(stk.nextToken());
				switch (shape) {
					case 4: cardA[0][n]++; break;
					case 3: cardA[1][n]++; break;	
					case 2: cardA[2][n]++; break;	
					case 1: cardA[3][n]++; break;
				}
			}
			stk= new StringTokenizer(in.readLine());
			CNB=Integer.parseInt(stk.nextToken());
			int[][] cardB = new int[4][100];
			for(int n=0; n<CNB; n++) {
				int shape = Integer.parseInt(stk.nextToken());
				switch (shape) {
					case 4: cardB[0][n]++; break;
					case 3: cardB[1][n]++; break;	
					case 2: cardB[2][n]++; break;	
					case 1: cardB[3][n]++; break;
				}
			}
			for(int[] b : cardA) System.out.println(b.toString());
			for(int[] b : cardB) System.out.println(b.toString());
			//String result = vitoryAB(cardA,cardB);
			//sb.append(result+"\n");
		}
//		out.write(sb.toString());
//		in.close();
//		out.flush();
//		out.close();
	}
	private static String vitoryAB(int[][] cardA, int[][] cardB) {
		
		String ans = null;
		for(int i=0; i<4; i++) {
			switch (i) {
			case 0:
				int starA=0;
				int starB=0;
				for(int n=0; n<100; n++) {
					if(cardA[i][n] !=0) starA++;
					if(cardB[i][n] !=0) starB++;
					if(starA>starB) ans = "A";
					else if(starA<starB) ans = "B";
					else ans = "D";
				}
				break;
			case 1:
				int circleA=0;
				int circleB=0;
				for(int n=0; n<100; n++) {
					if(cardA[i][n] !=0) circleA++;
					if(cardB[i][n] !=0) circleB++;
					if(circleA>circleB) ans = "A";
					else if(circleA<circleB) ans = "B";
					else ans = "D";
				}
				break;
			case 2:
				int squreA=0;
				int squreB=0;
				for(int n=0; n<100; n++) {
					if(cardA[i][n] !=0) squreA++;
					if(cardB[i][n] !=0) squreB++;
					if(squreA>squreB) ans = "A";
					else if(squreA<squreB) ans = "B";
					else ans = "D";
				}
				break;
			case 3:
				int triA=0;
				int triB=0;
				for(int n=0; n<100; n++) {
					if(cardA[i][n] !=0) triA++;
					if(cardB[i][n] !=0) triB++;
					if(triA>triB) ans = "A";
					else if(triA<triB) ans = "B";
					else ans = "D";
				}
				break;
			}
		}
		return ans;
	}
}
