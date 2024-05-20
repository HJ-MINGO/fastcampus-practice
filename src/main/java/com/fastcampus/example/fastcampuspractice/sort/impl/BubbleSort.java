package com.fastcampus.example.fastcampuspractice.sort.impl;

import com.fastcampus.example.fastcampuspractice.sort.Sort;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.어느 한쪽이 크고 작은지 정렬을 하기 위해서
 *  두개를 비교해야 한다. 하지만 해당 타입이 어떤게 올지 모르기 때문에 제네릭을 사용
 * 2. 두타입의 크고 작은지를 비교하기 위한 Comparable 클래스 상속
 *  <T extends Comparable<T>> --> 이게 의미하는건 T(제네릭은) 반드시 Comparable클래스 상속하는 자료형이여야 한다.
 * */
/* @Component로 등록함으로서 Bean으로 등록된다.  */
@Component
public class BubbleSort <T extends Comparable<T>> implements Sort<T> {

    public List<T> sort(List<T> list) {
        // 1. 입렵인자로 list를 받아서 새로운 ArrayList output을 생성 [입력, 출력 메모리를 구분해놓음==> 출력에 변화를 줘도 입력에 영향에 가지 않기위함]
        List<T> output = new ArrayList<>(list);
        for (int i = output.size() - 1; i > 0;  i--) {
            for (int j = 0; j < i; j++) {
                if (output.get(j).compareTo(output.get(j + 1)) > 0) {
                    T temp = output.get(j);
                    output.set(j,output.get(j + 1));
                    output.set(j+1, temp);
                }
            }
        }
        return output;
    }
}
