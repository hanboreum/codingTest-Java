package part1.ch3array;

import java.util.Scanner;

/**
 * 두 수의 합 서로 다른 양의 정수가 이루어진 수열에서 두 수의 합이 X 가 되는 쌍의 개수
 */
public class Boj3273 {

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
        for( int i=0; i<n; i++){
            int pairValue = x - a[i];
            if(0 <= pairValue && pairValue <= 10000000)
                ans += exist[pairValue] ? 1:0 ;
        }
        System.out.println(ans /2);
    }
}
