package anystep;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Java_10972 {
    //다음 순열
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer stk;
    static int N;
    static int[] nums;
    public static void main(String[] args) throws IOException {
        input();
        solve();
    }
    private static void input() throws IOException {
        N = Integer.parseInt(in.readLine());
        nums = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
    private static void solve() {
        if(nextpermutation()){
            for(int i=0; i<N; i++){
                System.out.print(nums[i]+" ");
            }
        }else{
            System.out.println("-1");
        }
    }
    private static boolean nextpermutation() {
        int i = nums.length-1;
        while (i>0 && nums[i-1]>=nums[i]){
            i--;
        }
        if(i<=0) return false;

        int j = nums.length-1;
        while (nums[j]<=nums[i-1]){
            j--;
        }
        swap(i-1, j);
        j = nums.length-1;
        while (i<j){
            swap(i,j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
