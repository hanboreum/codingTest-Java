package part1.ch3array;

import java.util.Scanner;

/**
 * 두 수의 합 2
 */
public class Boj3273_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        boolean[] exist = new boolean[10000001];
        for (int i = 0; i < n; i++)
            exist[a[i]] = true;

        int ans = 0;
        for( int i=0; i<= (x - 1) /2 ; i++){
            if (i <= 1000000 && x -1 <= 1000000)
                ans += exist[i] && exist[ x- i]? 1: 0;
        }
        System.out.println(ans);
    }

}
