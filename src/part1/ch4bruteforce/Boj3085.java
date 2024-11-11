package part1.ch4bruteforce;

import java.util.Scanner;

/**
 * 사탕 게임
 * n x n 보드에서 인접한 두 칸의 사탕을 교환한 후 가장 긴 연속된 사탕의 수를 구하는 문제.
 * 사탕을 교환한 후 가장 긴 연속된 사탕의 수를 구하는 문제.
 */
public class Boj3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] map = new char[n][n];
        for( int i=0; i< n; i++)
            map[i] = sc.next().toCharArray();

        int ans = 0;
        for (int i=0; i < n; i++)
            for( int j=0; j< n; j++){
                //swap right
                if( j +1 < n){
                    swapCandy(map, i, j, i, j+1);
                    ans = Math.max(ans, calScore(map));
                    swapCandy(map, i, j, i, j+1);
                }

                //swap below
                if( i+1 < n){
                    swapCandy(map, i, j, i+1, j);
                    ans = Math.max(ans, calScore(map));
                    swapCandy(map, i, j, i+1, j);
                }
            }
        System.out.println(ans);

    }

    public static int calScore( char[][] map){
        int n= map.length;
        int maxScore = 0;

        //가장 긴 연속 column 찾기
        for( int r=0; r< n ; r++){
            int score = 1;
            for( int c = 1; c < n; c++){
                if(map[r][c] == map[r][c-1]) score++;
                else{
                    maxScore = Math.max(maxScore, score);
                    score =1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }

        //가장 긴 연속 row 찾기
        for( int c =0; c <n; c++){
            int score =1;
            for( int r =1; r< n; r++){
                if( map[r][c] == map[r-1][c]) score++;
                else {
                    maxScore = Math.max(maxScore, score);
                    score =1;
                }
            }
            maxScore = Math.max(maxScore, score);
        }
        return maxScore;
    }

    public static void swapCandy( char[][] map, int r1, int c1, int r2, int c2){
        char tmp =  map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = tmp;
    }
}
