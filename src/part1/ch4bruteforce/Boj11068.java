package part1.ch4bruteforce;

import java.util.Scanner;

/**
 * 회문인수
 */
public class Boj11068 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            //답 기록
            boolean ans = false;
            //x에 대해서 2 - 64 진법까지
            for (int i = 2; i <= 64; i++) {
                int[] digit = convertBase(x, i); //진법 변환
                if (isPalindrome(digit)) {// 회문 검사
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? " 1" : "0");
        }
    }

    public static int[] convertBase(int x, int n) {
        // x를 n 진법으로 변환하기 위해 필요한 최대 크기 계산
        int len = 0;
        int copyX = x;
        while (copyX > 0) {
            copyX /= n;
            len++;
        }

        // 실제 변환 작업
        int[] digit = new int[len];
        for (int i = 0; i < len; i++) {
            digit[i] = x % n;
            x /= n;
        }

        return digit;
    }

    // 배열이 회문인지 확인하는 함수
    public static boolean isPalindrome(int[] digit) {
        int len = digit.length;
        for (int i = 0; i < len / 2; i++) {
            if (digit[i] != digit[len - i - 1]) {
                return false;
            }
        }
        return true;
    }
}