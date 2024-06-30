package com.fastcampus.example.fastcampuspractice;

import com.fastcampus.example.fastcampuspractice.exec1.MemberConfig;
import com.fastcampus.example.fastcampuspractice.exec1.MemberDto;
import com.fastcampus.example.fastcampuspractice.exec1.ServiceInterFace;
import com.fastcampus.example.fastcampuspractice.properties.MyProperties;
import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.Environment;

/* */
@EnableCaching
@SpringBootApplication(
//        exclude = WebMvcAutoConfiguration.class
)
public class FastcampusPracticeApplication {

    private final Logger log = LogManager.getLogger(FastcampusPracticeApplication.class);

    private final String name;
    private final Environment environment;
    private final ApplicationContext applicationContext;
    private final ServiceInterFace serviceInterFace;
//    private final MyProperties myProperties;


    public FastcampusPracticeApplication (
            @Value("${mingo.name}") String name
            , Environment environment
            , ApplicationContext applicationContext
            , MyProperties myProperties
            , MemberConfig memberConfig) {
        this.name = name;
        this.environment = environment;
        this.applicationContext = applicationContext;
        this.serviceInterFace = memberConfig.memberService();
//        this.myProperties = myProperties;
    }


    public static void main(String[] args) {
//        SpringApplication.run(FastcampusPracticeApplication.class, args);  // 아래것과 동일한 코드다
        SpringApplication application = new SpringApplication(FastcampusPracticeApplication.class);
        application.run(args);
    }
    /* @EventListener 어플리케이션이 맨 처음 실행될때 초기화 기능들을 구현해 줄수 있게 도와주는 기능으로
    *  기존에는 Command Line Runner 이나 Application Runner를 통해 해당기능을 사용하였지만 @EventListener는
    *  스프링 4.2부터 도입된 기능이다.
    *  옵션으로 ApplicationReadyEvent.class 는 애플리케이션 준비가 다 끝났을때 모든 빈을 읽고 spring컨테이너가
    *  준비가 완료되었을때 해당 메서드가 실행된다
    * */
    @EventListener(ApplicationReadyEvent.class)
    public void init2(){
        MemberDto memberDto = new MemberDto();
        serviceInterFace.saveMember(memberDto);
        // 인메모리에 그냥 저장되어있다. 저장하는 방법은 Concurrent HashMap이다.
        // 내부적으로 HashMap을 이용해서 데이터저장..
        // SpringAPPLICATION이 살아있을 동안만 유효한 값
        System.out.println(serviceInterFace.getMember(1L));
        System.out.println(serviceInterFace.getMember(1L));
        System.out.println(serviceInterFace.getMember(1L));
        System.out.println(serviceInterFace.getMember(1L));
        System.out.println(serviceInterFace.getMember(1L));
    }


    /* SpringCache는 Spring컨테이너에서 모든빈들이 완성이 된뒤(로딩이 끝난 뒤)에 활성화 된다.
       근데 @PostConstruct의 정의는 모든빈이 Spring컨테이너에 등록된 뒤가 아닌 해당 클래스에 의존성이
       모두 완성된 뒤에 활성화된다.
       그러니 지금 해당 클래스에  name, environment, applicationContext에 의존성 주입이 모두 끝났다고 해서
       Spring컨테이너에서 모든빈을 로드했다라는 의미는 다르다.
       그러므로 캐시 사용시 오류 발생 */
    /**
     * 
     * MethodName     : init 메서드
     * description    : propertis설정 메서드
     * @param         :
     * @return        :
     * ===========================================================
     * DATE              AUTHOR             NOTE
     * -----------------------------------------------------------
     * 2024-06-10        NAHAEJUN       최초 생성
     * 2024-06-10        NAHAEJUN       SpringCache사용을 위한 @PostConstruct
     *                                  주석처리
     */
//    @PostConstruct
//    public void init(){ // prpertis파트 연습때 쓰는용도
////        System.out.println(name);
//        log.info("value => {}",name);
//        log.info("environment => {}",environment.getProperty("mingo.name"));
//        log.info("applicationContext => {}",applicationContext.getEnvironment().getProperty("mingo.name"));
////        log.info("MyProperties => {}",myProperties.getJumin_first());
//    }

}
