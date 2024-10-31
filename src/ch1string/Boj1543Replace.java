package ch1string;

import java.util.Scanner;

public class Boj1543Replace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();

        String replace = doc.replace(word,"");
        int length = doc.length() - replace.length();
        int count = length / word.length();
        System.out.println(count);
    }

}
