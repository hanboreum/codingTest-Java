package part1.ch4bruteforce;

import java.util.Scanner;

/**
 * 진법 변환 2
 * 10진수 N 이 주어질 때, 이를 B 진법으로 바꿔 출력하라
 */
public class Boj1105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        //1, n을 b로 나눈 나머지로 구하고, b로 나누자
        //2. 가장 마지막 나머지부터 가장 앞 자릿값이 된다.
        String ans ="";
        while ( n >0){
            int d = n % b;
            if( d < 10) ans +=d;
            else ans += ( char)( d -10 + 'A');
            n = n /b;
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            System.out.println(ans.charAt(i));
            System.out.println();
        }
    }
}
