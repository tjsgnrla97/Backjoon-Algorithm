//package fail;
//
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.StringTokenizer;
//
//public class Java_2491_fail {
//	// 수열
////	수열을 담을 배열 혹은 리스트를 담고 현재인덱스의 값과 다음인덱스의 값이 >=, <=관계일때 카운트를 증가시킨다.
//	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//	static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//	static StringTokenizer stk;
//	static StringBuilder sb = new StringBuilder();
//	static int N,totalCnt,ans;
//	static ArrayList<Integer> suyeol, ansList;
//	public static void main(String[] args) throws NumberFormatException, IOException {
//		N = Integer.parseInt(in.readLine());
//		suyeol = new ArrayList<>();
//		ansList = new ArrayList<>();
//		stk = new StringTokenizer(in.readLine());
//		for(int i=0; i<N; i++) {
//			suyeol.add(Integer.parseInt(stk.nextToken()));
//		}
////		System.out.println(suyeol);
//		checkBigSmall();
//		System.out.println(ans);
//	}
//	private static void checkBigSmall() {
//		int now = suyeol.get(0);
//		totalCnt=0;
//		boolean big=true;
//		boolean small=true;
//		for(int i=0; i<N-1; i++) {
//			if(now<=suyeol.get(i+1) && small) {
//				totalCnt++;
////				System.out.println("total "+ totalCnt);
//				if(now>=suyeol.get(i+1)) {
//					small = true;
//					big = false;
//				}else if(now<suyeol.get(i+1)) {
//					small = false;
//					big = true;
//					ansList.add(totalCnt);
//					totalCnt=0;
//				}
//			}else if(now>=suyeol.get(i+1) && big) {
//				totalCnt++;
////				System.out.println("total " +totalCnt);
//				if(now<=suyeol.get(i+1)) {
//					big = true;
//					small = false;
//				}else if(now>suyeol.get(i+1)) {
//					big = false;
//					small = true;
//					ansList.add(totalCnt);
//					totalCnt=0;
//				}
//			}
//			now=suyeol.get(i+1);
//		}
//		Collections.sort(ansList);
////		System.out.println(ansList);
//		ans = ansList.get(ansList.size()-1);
//	}
//
//}
