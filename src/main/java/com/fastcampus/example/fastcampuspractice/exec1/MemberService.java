package com.fastcampus.example.fastcampuspractice.exec1;

import org.springframework.cache.annotation.Cacheable;

import java.lang.reflect.Member;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : MemberService
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public class MemberService implements ServiceInterFace{

    private final RepoInterFace memberRepo;

    public MemberService( RepoInterFace memberRepo ) {
        this.memberRepo = memberRepo;
    }

    public void saveMember( MemberDto member ) {
        member.setId(1L);
        member.setAge(33);
        member.setName("나해준");
        memberRepo.saveMember(member);
    }
    @Cacheable("member")
    public String getMember( long id ) {
        return memberRepo.getMember(id).toString();
    }
}
