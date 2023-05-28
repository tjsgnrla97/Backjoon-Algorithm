package anystep;

import java.util.Scanner;

public class Java_10990 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();


        for (int y = 1; y <= N; y++) {
            for (int x = N; x > y; x--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int x = 1; x <= 2 * y - 3; x++) {
                System.out.print(" ");
            }
            if (y > 1) System.out.print("*");
            if (y < N)
                System.out.println();
        }
    }
}
