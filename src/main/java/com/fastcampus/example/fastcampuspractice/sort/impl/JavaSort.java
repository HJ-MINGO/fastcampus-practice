package com.fastcampus.example.fastcampuspractice.sort.impl;

import com.fastcampus.example.fastcampuspractice.sort.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class JavaSort <T extends Comparable<T>> implements Sort<T> {

    public List<T> sort(List<T> list) {
        // 1. 입렵인자로 list를 받아서 새로운 ArrayList output을 생성 [입력, 출력 메모리를 구분해놓음==> 출력에 변화를 줘도 입력에 영향에 가지 않기위함]
        List<T> output = new ArrayList<>(list);
        Collections.sort(output);
        return output;
    }
}
