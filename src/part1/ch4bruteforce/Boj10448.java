package part1.ch4bruteforce;

import java.util.Scanner;

/**
 * 유레카이론
 */
public class Boj10448 {
    public static void main(String[] args) {
        preprocess();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while( t -- > 0){
            int k= sc.nextInt();

            System.out.println(isEurekaNumber[k]? "1" :0);
        }
    }
    static boolean[] isEurekaNumber = new boolean[1001];

    public static void preprocess(){
        //k보다 작은 삼각수를 모두 구하기
        int[] triangleNumbers = new int[50];
        int triangleNumberCount = 0;
        for (int i=1; ; i++){
            int triangleNumber = i * (i+1) /2;
            if(triangleNumber >= 1000) break;
            triangleNumbers[triangleNumberCount ++] =triangleNumber;
        }
        //구해진 삼각수 3개의 합으로 k 를 나타낼 수 있는지 확인
        boolean[] isSumOfTriangleNumber = new boolean[1000];
        for( int i=0; i < triangleNumberCount; i++)
            for( int j=0; j< triangleNumberCount; j++){
                int sum = triangleNumbers[i] + triangleNumbers[j];
                if( sum < 1000) isSumOfTriangleNumber[sum] = true;
            }
        for( int i=0; i< 1000; i++) {
            if (!isSumOfTriangleNumber[i])
                continue;
            for (int j = 0; j < triangleNumberCount; j++) {
                int sum = i + triangleNumbers[j];
                if( sum <= 1000) isEurekaNumber[sum] = true;
            }
        }
    }
}
