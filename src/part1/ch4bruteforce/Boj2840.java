package part1.ch4bruteforce;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 행운의 바퀴
 * https://www.acmicpc.net/problem/2840
 */
public class Boj2840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        char[]ans = new char[n];
        Arrays.fill(ans,'?');

        int curIndex = 0;
        while( k-- >0){
            int backStep = sc.nextInt();
            char backChar = sc.next().charAt(0);
            int nextIndex = ((curIndex - backStep) % n + n ) %n;
            if(ans[nextIndex] == '?') ans [nextIndex] = backChar;
            else if(ans[ nextIndex] != backChar){
                System.out.println("!");
                return;
            }
            curIndex = nextIndex;

        }

        boolean[] chk = new boolean[26];
        for( int i=0; i<n; i++){
            if(ans[i] == '?' )continue;
            if(chk[ans[i] -'A']) {
                System.out.println("!");
                return ;
            }
            chk[ans[i] -'A'] = true;
        }

        for(int i=0; i< n; i++){
            System.out.print(ans[(curIndex + i) % n]);
            System.out.println();
        }
    }

}
