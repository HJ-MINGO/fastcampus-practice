package com.fastcampus.example.fastcampuspractice.exec1;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : MemberConfig
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
@EnableCaching
@Configuration
public class MemberConfig {

//    public void init(){
//        ServiceInterFace serviceInterFace = memberService();
//        System.out.println(serviceInterFace.getMember(1L));
//    }

    @Bean
    public ServiceInterFace memberService(){
        return new MemberService(memberRepo());
    };

    @Bean
    public RepoInterFace memberRepo(){
        return new MemberRepo();
    }
}
