package anystep;

import java.util.Scanner;

public class Java_14470 {
    //전자레인지
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(),
                d = sc.nextInt(), e = sc.nextInt();
        if (a < 0)
            System.out.println(Math.abs(a)*c + d + b*e);
        else
            System.out.println((b-a)*e);
    }
}
