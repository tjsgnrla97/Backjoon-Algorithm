package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Java_1100 {
	// 하얀 칸
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	static StringTokenizer stk;
	public static void main(String[] args) throws IOException {
		int ans=0;
		String[][] map = new String[8][8];
		
		for(int y=0; y<8; y++) {
			String[] str = in.readLine().split("");
			for(int x=0; x<8; x++) map[y][x] = str[x];
		}
		
		for(int y=0; y<8; y++) {
			for(int x=0; x<8; x++) {
				if((y+x)%2==0 && map[y][x].equals("F")) ans++;
			}
		}
		System.out.println(ans);
	}

}
