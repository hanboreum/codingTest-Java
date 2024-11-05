package part1.ch1string;

import java.util.Scanner;

//애너그램 만들기
public class Boj1919 {

    public static int[] getStringArray(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i) - 'a']++;
        return count;
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        int[] countA = getStringArray(a);
        int[] countB = getStringArray(b);

        int ans = 0;
        for (int i = 0; i < 26; i++)
            ans += Math.abs(countA[i] - countB[i]);
        System.out.println(ans);
    }
}