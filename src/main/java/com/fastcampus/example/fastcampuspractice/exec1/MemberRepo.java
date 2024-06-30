package com.fastcampus.example.fastcampuspractice.exec1;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : MemberRepo
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public class MemberRepo implements RepoInterFace{

    Map<Long, MemberDto> members = new HashMap<Long, MemberDto>();

    public void saveMember(MemberDto member) {
        members.put(member.getId(), member);
    }

    public MemberDto getMember(Long id) {
        System.out.println("나는 1번만 실행되는가");
        return members.get(id);
    }

}
