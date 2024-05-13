package com.fastcampus.example.fastcampuspractice.main;

import com.fastcampus.example.fastcampuspractice.util.BubbleSort;

import java.util.Arrays;

public class OopMain {
    public static void main(String[] args) {
        BubbleSort<String> buso = new BubbleSort<>();
        // 배열과 리스트는 다름... 리스트 만들때 Arrays.asList() 사용해서 배열을 리스트로 변환
        System.out.println(buso.sort(Arrays.asList(args)));
    }
}
