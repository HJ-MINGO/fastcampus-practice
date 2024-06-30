package com.fastcampus.example.fastcampuspractice.exec1;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : ServiceInterFace
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public interface ServiceInterFace {

    public void saveMember( MemberDto member );

    public String getMember( long id );
}
