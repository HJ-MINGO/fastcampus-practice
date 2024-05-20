package com.fastcampus.example.fastcampuspractice.service;

import com.fastcampus.example.fastcampuspractice.sort.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortSertvice {

    private final Sort<String> sort;
    
    // 생성자 주입
    // 매개변수sort는 구현체중 JavaSort인지, BubbleSort인지 모른다.
//    public SortSertvice(Sort<String> sort) {
//        this.sort = sort;
//        System.out.println("구현체: " + sort.getClass().getName());
//    }
    // 생성자 주입
    // 매개변수sort는 구현체중 JavaSort인지, BubbleSort인지 @Qualifier어노테이션을 이용해 어떤 sort인지 집적 지정해준다.
    public SortSertvice(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
        System.out.println("구현체: " + sort.getClass().getName());
    }


    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
