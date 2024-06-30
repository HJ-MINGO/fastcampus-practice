package com.fastcampus.example.fastcampuspractice.exec1;

import java.lang.reflect.Member;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : MemberMain
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public class MemberMain {

    public static void main(String[] args) {

        MemberConfig config = new MemberConfig();
        ServiceInterFace service = config.memberService();

        MemberDto member = new MemberDto(1L,"나해준",33);

        service.saveMember(member);

    }
}
