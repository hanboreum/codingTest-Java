package part1.ch3array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 줄 세우기 - 삽입 정렬 https://www.acmicpc.net/problem/10431 입력으로 주어진 순서대로 규칙에 따라 줄을 설 때 각 학생들이 뒤로 물러난 걸음
 * 수의 총합
 * <p>
 * 1. 술 서 있는 학생 중 자신보다 큰 학생을 찾는다. 1-1. 찿지 못했다면 가장 뒤에 선다. 2. 찾았다면 그 앞에 선다 3. 그 학생 뒤에 있는 학생들은 모두 한 칸씩
 * 물러난다.
 */
public class Boj10431 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        while (p-- > 0) {
            int t = sc.nextInt();
            int[] h = new int[20];
            for (int i = 0; i < 20; i++) {
                h[i] = sc.nextInt();
            }

            int cnt = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (h[j] > h[i]) {
                        int myH = h[i];
                        for (int k = i; k > j; k--) {
                            h[k] = h[k - 1];
                            cnt++;
                        }
                        h[j] = myH;
                        break;
                    }
                }
            }
            System.out.println(t + " " + cnt);
        }
    }
}