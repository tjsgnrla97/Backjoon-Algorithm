package anystep;

import java.util.Arrays;
import java.util.Scanner;

public class Java_3047 {
    //ABC
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        String str = in.next();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if ('A' == str.charAt(i)) {
                System.out.print(arr[0] + " ");
            } else if ('B' == str.charAt(i)) {
                System.out.print(arr[1] + " ");
            } else if ('C' == str.charAt(i)) {
                System.out.print(arr[2] + " ");
            }
        }
    }
}
