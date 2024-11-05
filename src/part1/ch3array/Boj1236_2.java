package part1.ch3array;

import java.util.Scanner;

/**
 * 1236 성지키기
 */
public class Boj1236_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        boolean[] rowExist = new boolean[n];
        boolean[] colExist = new boolean[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 'X') {
                    rowExist[i] = true;
                    colExist[j] = true;
                }
            }
        }
        int rowNeedCount= n;
        int colNeedCount= m;
        for (int i=0; i<n; i++){
            if(rowExist[i]) rowNeedCount--;
        }
        for(int i=0; i< m; i++){
            if(colExist[i]) colNeedCount--;
        }
        System.out.println(Math.max(rowNeedCount, colNeedCount));
    }
}

