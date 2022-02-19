package fail;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java_2564_fail {
	// 경비원
	/*
	 * 블록을 가로지를 수 없기때문에 동근이와 상점의 거리공식은 언제나 3가지의 경우로 나눠진다. 동근이와 상점이 같은 열에 있을 경우 동근이의
	 * x좌표와 상점의 x좌표사이의 거리를 구한다. 동근이와 상점이 같은 행에 있을 경우 동근이의 y좌표와 상점의 y좌표사이의 거리를 구한다.
	 * 동근이와 상점이 같은 열과 행에 없을 경우 두가지의 경우로 또 나뉜다. 동근이와 상점이 정반대편에 있을 경우와 인접한 변에 있을 경우.
	 * 정반대편의 경우 다시 동근이가 행에 있는지 열에 있는지를 체크하고 행에 있을경우 동근이의 x좌표 + 열의높이 + 상점의 x좌표를
	 * 두가지경우로 구해서 최솟값을 구한다. 열에 있을경우는 반대로 y좌표를 기준으로 한다. 인접변의 관계에서는 x좌표의 차이와 y좌표의 차이를
	 * 더해준다.
	 */
	static class Index {
		int type, y, x;

		public Index(int type, int dis) {
			super();
			this.type=type;
			if (type == 1) {
				this.y = 0;
				this.x = dis;
			} else if (type == 2) {
				this.y = Y;
				this.x = dis;
			} else if (type == 3) {
				this.y = dis;
				this.x = 0;
			} else if (type == 4) {
				this.y = dis;
				this.x = X;
			}
		}

		@Override
		public String toString() {
			return "Index [type=" + type + ", y=" + y + ", x=" + x + "]";
		}
		
	}

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer stk;
	static StringBuilder sb = new StringBuilder();
	static int ans, X, Y, N;
	static Index dong;
	static List<Index> storeList = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		stk = new StringTokenizer(in.readLine());
		X = Integer.parseInt(stk.nextToken());
		Y = Integer.parseInt(stk.nextToken());
		N = Integer.parseInt(in.readLine());
		for (int i = 0; i < N; i++) {
			stk = new StringTokenizer(in.readLine());
			int type = Integer.parseInt(stk.nextToken());
			int dis = Integer.parseInt(stk.nextToken());
			storeList.add(new Index(type, dis));
		}
		stk = new StringTokenizer(in.readLine());
		int type = Integer.parseInt(stk.nextToken());
		int dis = Integer.parseInt(stk.nextToken());
		dong = new Index(type, dis);
		calcSum();
		out.append(ans + "");
		in.close();
		out.flush();
		out.close();
	}

	private static void calcSum() {
		for (int i = 0; i < storeList.size(); i++) {
			// 같은 행에 있을 경우
			Index store = storeList.get(i);
			if (dong.y == store.y) {
				// 정반대편일 경우
				if (dong.type == isPair(store.type)) {
					int dongDis = Math.min(X-dong.x, dong.x);
					int storeDis = Math.min(X-store.x, store.x);
					ans+=Y+dongDis+storeDis;
				} else
					ans += Math.abs(dong.x - store.x);
			}
			// 같은 열에 있을 경우
			else if (dong.x == store.x) {
				if (dong.type == isPair(store.type)) {
					int dongDis = Math.min(Y-dong.y, dong.y);
					int storeDis = Math.min(Y-store.y, store.y);
					ans+=X+dongDis+storeDis;
				} else
					ans += Math.abs(dong.y - storeList.get(i).y);
			}
			//같은 열도 같은 행도 아닌 경우
			else {
				// 정반대편일 경우
				if (dong.type == isPair(store.type)) {
					//동근이가 북 남쪽이라면
					if(dong.type==1 || dong.type==2) {
						int dongDis1 = X-dong.x;
						int dongDis2 = dong.x;
						int storeDis1 = X-store.x;
						int storeDis2 = store.x;
						int temp = Math.min(dongDis1+storeDis1, dongDis2+storeDis2);
						ans+=Y+temp;
					}
					//동근이가 동 서쪽이라면
					else if(dong.type==3 || dong.type==4){
						int dongDis1 = Y-dong.y;
						int dongDis2 = dong.y;
						int storeDis1 = Y-store.y;
						int storeDis2 = store.y;
						int temp = Math.min(dongDis1+storeDis1, dongDis2+storeDis2);
						ans+=X+temp;
					}
				}
				//인접한 경우
				else {
					ans += Math.abs(dong.x - store.x)+Math.abs(dong.y-store.y);					
				}
			}
//			System.out.println(dong);
//			System.out.println(store);
//			System.out.println(ans);
		}
	}

	private static int isPair(int type) {
		int opsite = 0;
		switch (type) {
		case 1:
			opsite = 2;
			break;
		case 2:
			opsite = 1;
			break;
		case 3:
			opsite = 4;
			break;
		case 4:
			opsite = 3;
			break;
		}
		return opsite;
	}

}
