package com.fastcampus.example.fastcampuspractice.main;

import com.fastcampus.example.fastcampuspractice.config.Config;
import com.fastcampus.example.fastcampuspractice.sort.Sort;
import com.fastcampus.example.fastcampuspractice.service.SortSertvice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class OopMain {
    public static void main(String[] args) {
        // 내가 직접 커스텀 마이징한 config파일을 가져온다.[ Config.class ]
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // new 없이 context를 통해 빈으로 해당 클래스 꺼내온것이다. [인터페이스를 통해 주입하는방법 (정석)]
        Sort<String> sort = context.getBean(Sort.class);
        // 구현체를 직접 주입해서 사용하는 방식
        SortSertvice sortSertvice = context.getBean(SortSertvice.class);
        // 그럼 해당 로직은 필요없어짐
//        BubbleSort<String> buso = new BubbleSort<>();
        // 배열과 리스트는 다름... 리스트 만들때 Arrays.asList() 사용해서 배열을 리스트로 변환
        System.out.println(sort.sort(Arrays.asList(args)));
        System.out.println(sortSertvice.doSort(Arrays.asList(args)));
    }
}
