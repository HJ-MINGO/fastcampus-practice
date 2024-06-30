package com.fastcampus.example.fastcampuspractice.exec1;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : RepoInterFace
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public interface RepoInterFace {

    public void saveMember(MemberDto member);

    public MemberDto getMember(Long id);
}
