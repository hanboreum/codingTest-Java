package ch1string;

import java.util.Scanner;

//문서검색 - 주어진 단서가 문서에 등장하는 횟수
public class Boj1543indexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String doc = sc.nextLine();
        String word = sc.nextLine();
        int start = 0;
        int count = 0;
        while (true) {
            int find = doc.indexOf(word, start);
            if (find < 0)
                break;
                start = find + word.length();
                count++;
        }
        System.out.println(count);
    }
}
