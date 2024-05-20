package com.fastcampus.example.fastcampuspractice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Config을 따로 지정할 클래스다
 * @Configuration 어노테이션으로 해당 클래스를 지정하면
 * 해당 클래스는 Spring젅용 Configuration Class가 된다.
 * 그래서 Spring Application의 컨텍스트가 뜰때 해당 Config에 어떤 설정들이 잡혀 있는게 있는지 Spring이 살펴본다.
 * 뭐를 기준으로 살펴보는가 하면  @ComponentScan어노테이션을 이용하는데
 * @ComponentScan은 해당 root로 삼은 경로 이하에 있는 모든 Spring Bean을 스캔 하겠다는 의미이다.
 *
 * */
@ComponentScan("com.fastcampus.example.fastcampuspractice")
@Configuration
public class Config {
}
