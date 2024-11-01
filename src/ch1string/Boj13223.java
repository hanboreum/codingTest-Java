package ch1string;

import java.util.Scanner;

//소금폭탄
public class Boj13223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] current = sc.next().split(":");
        String[] drop = sc.next().split(":");

        int currentHour = Integer.parseInt(current[0]);
        int currentMin = Integer.parseInt(current[1]);
        int currentSec = Integer.parseInt(current[2]);

        int dropHour = Integer.parseInt(drop[0]);
        int dropMin = Integer.parseInt(drop[1]);
        int dropSec = Integer.parseInt(drop[2]);

        int currentSecAmount = currentHour * 3600 + currentMin * 60 + currentSec;
        int dropSecAmount = dropHour * 3600 + dropMin * 60 + dropSec;

        int needSecAmount = dropSecAmount - currentSecAmount;
        if (needSecAmount <= 0)
            needSecAmount += 24 * 3600; //같다면 하루를 더 함

        //시간 분 초 단위로 정리
        int needHour = needSecAmount / 3600; //2600ch
        int needMin = (needSecAmount % 3600) / 60; //남은 토에 대해 60이 얼마나
        int needSec = needSecAmount % 60;

        System.out.printf("%02d:%02d:%02d", needHour, needMin, needSec);
    }
}
