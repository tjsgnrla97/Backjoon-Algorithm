package step07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_2896 {
	//4. 달팽이는 올라가고 싶다.
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static int ans,goal,up,down;
	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		up = Integer.parseInt(stk.nextToken());
		down = Integer.parseInt(stk.nextToken());
		goal = Integer.parseInt(stk.nextToken());
		ans = (goal-down) / (up-down);
		if((goal-down)%(up-down)!=0) ans++;
		out.write(ans+"");
		out.flush();
		out.close();
		in.close();
	}

}
