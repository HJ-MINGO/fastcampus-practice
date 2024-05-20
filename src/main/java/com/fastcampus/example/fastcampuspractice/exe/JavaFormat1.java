package com.fastcampus.example.fastcampuspractice.exe;

import java.text.ChoiceFormat;

public class JavaFormat1 {
    public static void main(String[] args) {
        //ChocieFormat - 특정 범위에 속하는 값을 문자열로 변환 , 범위는 double 타입으로 받는다
        double [] limit = {10,20,30,40,50}; // 반드시 경계값은 double형태이며 오름차순으로 배열을 만들어야한다.
        String[] grade = {"E","D","C","B","A"}; // 치환될 등급 값은 limit 배열의 크기와 동일해야한다.
        ChoiceFormat fmt1 = new ChoiceFormat(limit,grade);
        int [] score = {11,9,33,54,27};
        System.out.println(fmt1.format(score[2]));
        // 이외에 패턴을 사용해서도 치환이 가능하다.
        String patten = "60#D|70#C|80<B|90#A";
        ChoiceFormat fmt2 = new ChoiceFormat(patten);
        int [] score2 = {60,80,81,90,92};
        for ( int i=0; i<score2.length; i++) {
            System.out.println(fmt2.format(score2[i]));
        }
    }
}
