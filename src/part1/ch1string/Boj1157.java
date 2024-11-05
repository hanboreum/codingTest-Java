package part1.ch1string;

import java.util.Scanner;

//단어공부
public class Boj1157 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }

        int maxCount = 0;
        char maxChar = '?';
        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) ('A' + i);
            } else if (count[i] == maxCount) {
                maxChar = '?';
            }
        }
        System.out.println(maxChar);
    }
}
