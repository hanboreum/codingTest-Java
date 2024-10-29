package ch1string;

import java.util.Scanner;
//대소문자 바꾸기
public class Boj2744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i = 0; i < input.length(); i++) {
            char ch =  input.charAt(i);
            //ch가 A보다 크거나 같고, ch 가 Z보다 작거나 으면
            if ('A' <= ch && ch <= 'Z')
                System.out.print((char)('a' + ch - 'A'));
            else System.out.print((char)('A' + ch - 'a'));
        }
    }
}
