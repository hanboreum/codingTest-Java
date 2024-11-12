package part1.ch4bruteforce;

import java.util.Scanner;

/**
 * ACM 호텔
 */
public class Boj10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        while(n-- >0){
            int h = sc.nextInt();
            int w= sc.nextInt();
            int m = sc.nextInt();

            int floor = ((m -1) %h) +1;
            int number = ((m -1) / h+1);
            System.out.printf("%d%02d\n", floor, number);
        }
    }

}
