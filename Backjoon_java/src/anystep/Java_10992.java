package anystep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Java_10992 {
    //별 찍기 - 17
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        // n = 1이면 * 1개만 출력
        if (n == 1) {
            System.out.print("*");
            return;
        }
        char[][] arr = new char[n - 1][2 * n - 1];  // *을 저장할 배열
        int L_index = 1;
        int R_index = 2 * n - 3;
        for (int i = n - 2; i >= 0; i--) {
            arr[i][L_index] = arr[i][R_index] = '*';
            L_index++;
            R_index--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n - 1; i++) {
            sb.append(" ");
        }
        sb.append("*\n");
        for (int i = 1; i <= n - 2; i++) {
            int count = 2;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == '*') {
                    sb.append("*");
                    count--;
                    if (count == 0) break;
                } else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        for (int i = 1; i <= 2 * n - 1; i++) {
            sb.append("*");
        }
        System.out.print(sb);
    }
}
