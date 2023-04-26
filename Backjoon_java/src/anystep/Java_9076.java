package anystep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Java_9076 {
    //점수 집계
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringTokenizer stk;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] score = new int[5];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < score.length; j++) {
                score[j] = sc.nextInt();
            }
            Arrays.sort(score);
            if (score[3] - score[1] >= 4) {
                System.out.println("KIN");
            } else
                System.out.println(score[1] + score[2] + score[3]);
        }
        sc.close();
    }
}
