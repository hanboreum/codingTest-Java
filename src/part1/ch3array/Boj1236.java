package part1.ch3array;

import java.util.Scanner;

/**
 * 1236 성지키기
 */
public class Boj1236 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] map = new char[n][m];
        for (int i = 0; i < n; i++) {
            map[i] = sc.next().toCharArray();
        }

        //1. 각 행 열에 대해 경비원이 있는지 확인
        int existRowCount = 0;
        for (int r = 0; r < n; r++) {
            boolean exist = false;
            //i 는 확인하고 싶은 row
            for (int c = 0; c < m; c++) {
                if (map[r][c] == 'X') //X 는 경비원
                {
                    exist = true; //X를 만나면 true
                    break;
                }
            }
            if (exist) existRowCount++;
        }

        int existColCount = 0;
        for( int c=0; c<m; c++) {
            boolean exist = false;
            for( int r=0; r< n; r++ ){
                if(map[r][c] == 'X'){
                    exist= true;
                    break;
                }
            }
            if(exist) existColCount++;
        }


        //2. 보호받지 못하는 행/ 열의 개수를 구함
        int needRowCount = n - existRowCount;
        int needColCount = m - existColCount;

        //3. 둘 중 큰 값을 출력한다.
        System.out.println(Math.max(needColCount, needRowCount));
    }
}
