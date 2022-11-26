package anystep;

import java.io.*;
import java.util.*;

public class Java_21944 {
    //문제 추천 시스템 Version 2
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();
    static int N, M;

    public static class Problem implements Comparable<Problem> {
        int P;
        int L;
        int G;

        public Problem(int P, int L, int G) {
            this.P = P;
            this.L = L;
            this.G = G;
        }

        @Override
        public int compareTo(Problem o) {
            if (L == o.L) {
                return Integer.compare(P, o.P);
            }
            return Integer.compare(L, o.L);
        }
    }

    static TreeSet<Problem> problems;
    //key : G value : problems
    static Map<Integer, TreeSet<Problem>> problemMap;
    //key : P value : L, G
    //solved command
    static Map<Integer, Integer> LMap;
    static Map<Integer, Integer> GMap;

    public static void main(String[] args) throws IOException {
        input();
        command();
    }

    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        problems = new TreeSet<>();
        problemMap = new HashMap<>();
        LMap = new HashMap<>();
        GMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            stk = new StringTokenizer(in.readLine());
            int P = Integer.parseInt(stk.nextToken());
            int L = Integer.parseInt(stk.nextToken());
            int G = Integer.parseInt(stk.nextToken());
            problems.add(new Problem(P, L, G));

            if (problemMap.containsKey(G)) {
                TreeSet<Problem> temp = problemMap.get(G);
                temp.add(new Problem(P, L, G));
                problemMap.replace(G, temp);
            } else {
                TreeSet<Problem> temp = new TreeSet<>();
                temp.add(new Problem(P, L, G));
                problemMap.put(G, temp);
            }
            LMap.put(P, L);
            GMap.put(P, G);
        }
        M = Integer.parseInt(in.readLine());
    }

    private static void command() throws IOException {
        for (int i = 0; i < M; i++) {
            stk = new StringTokenizer(in.readLine());
            String cmd = stk.nextToken();
            //G중에서 가장 크고 작은 문제 번호
            if (cmd.equals("recommend")) {
                int G = Integer.parseInt(stk.nextToken());
                int x = Integer.parseInt(stk.nextToken());
                if (x == 1) {
                    System.out.println(problemMap.get(G).last().P);
                } else {
                    System.out.println(problemMap.get(G).first().P);
                }
            }
            //전체 중에서 가장 크고 작은 문제 번호
            else if (cmd.equals("recommend2")) {
                int x = Integer.parseInt(stk.nextToken());
                if (x == 1) {
                    System.out.println(problems.last().P);
                } else {
                    System.out.println(problems.first().P);
                }
            }
            //전체 중에서 && 난이도 L이상 가장 작은 || L이하 가장 큰 문제 번호
            else if (cmd.equals("recommend3")) {
                int x = Integer.parseInt(stk.nextToken());
                int L = Integer.parseInt(stk.nextToken());
                if (x == 1) {
                    if (problems.ceiling(new Problem(0, L, 0)) == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(problems.ceiling(new Problem(0, L, 0)).P);
                    }
                } else {
                    if (problems.floor(new Problem(0, L, 0)) == null) {
                        System.out.println(-1);
                    } else {
                        System.out.println(problems.floor(new Problem(0, L, 0)).P);
                    }
                }
            }
            //전체 중 추가(이전에 있던 문제분류가 들어올수 있음)
            else if (cmd.equals("add")) {
                int P = Integer.parseInt(stk.nextToken());
                int L = Integer.parseInt(stk.nextToken());
                int G = Integer.parseInt(stk.nextToken());
                problems.add(new Problem(P, L, G));
                if (problemMap.containsKey(G)) {
                    TreeSet<Problem> temp = problemMap.get(G);
                    temp.add(new Problem(P, L, G));
                    problemMap.replace(G, temp);
                } else {
                    TreeSet<Problem> temp = new TreeSet<>();
                    temp.add(new Problem(P, L, G));
                    problemMap.put(G, temp);
                }
                LMap.put(P,L);
                GMap.put(P,G);
            }
            //전체 중 삭제
            else {
                int P = Integer.parseInt(stk.nextToken());
                int L = LMap.get(P);
                int G = GMap.get(P);
                problems.remove(new Problem(P, L, G));
                problemMap.get(G).remove(new Problem(P, L, G));
                LMap.remove(P);
                GMap.remove(P);
            }
        }
    }
}
