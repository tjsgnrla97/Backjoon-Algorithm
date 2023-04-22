package anystep;

import java.util.Scanner;

public class Java_10811 {
    //바구니 뒤집기
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int order1 = in.nextInt() - 1;
            int order2 = in.nextInt() - 1;

            while (order1 < order2) {
                int temp = arr[order1];
                arr[order1++] = arr[order2];
                arr[order2--] = temp;
            }
        }
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        System.out.println(str.trim());
        in.close();
    }
}
