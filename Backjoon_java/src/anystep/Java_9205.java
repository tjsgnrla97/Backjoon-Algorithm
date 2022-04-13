package anystep;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Java_9205 {
	// 맥주 마시면서 걸어가기
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	static int N, T;
	static int[][] adjMatrix;
	static ArrayList<Point> VList;
	static final int INF = 100*20*50;
	public static void main(String[] args) throws NumberFormatException, IOException {
		T = Integer.parseInt(in.readLine());
		for(int tc=1; tc<=T; tc++) {
			N = Integer.parseInt(in.readLine());
			
			VList = new ArrayList<Point>();
			adjMatrix = new int[N+2][N+2];
			for(int from=0; from<N+2; from++) {
				for(int to=0; to<N+2; to++) {
					adjMatrix[from][to]=INF;
				}
			}
			for(int from=0; from<N+2; from++) {
				stk = new StringTokenizer(in.readLine());
				int y=Integer.parseInt(stk.nextToken());
				int x=Integer.parseInt(stk.nextToken());
				VList.add(new Point(y,x));
			}
			for(int from=0; from<N+2; from++) {
				for(int to=0; to<N+2; to++) {
					if(from==to) continue;
					Point cv = VList.get(from);
					Point nv = VList.get(to);
					int dist = getDistance(cv, nv);
					if(dist<=1000) adjMatrix[from][to]=1;
				}
			}
			for(int k=0; k<N+2; k++) {
				for(int from=0; from<N+2; from++) {
					for(int to=0; to<N+2; to++) {
						if(adjMatrix[from][to]>adjMatrix[from][k]+adjMatrix[k][to]) {
							adjMatrix[from][to]=adjMatrix[from][k]+adjMatrix[k][to];
						}
					}
				}
			}
			if(0<adjMatrix[0][N+1] && adjMatrix[0][N+1]<INF) sb.append("happy").append("\n");
			else sb.append("sad").append("\n");
		}
		out.write(sb.toString());
		out.flush();
		out.close();
		in.close();
	}
	private static int getDistance(Point cv, Point nv) {
		return Math.abs(cv.y-nv.y)+Math.abs(cv.x-nv.x);
	}

}
