package com.fastcampus.example.fastcampuspractice.exec1;

/**
 * packageName    : com.fastcampus.example.fastcampuspractice.exec1
 * fileName       : MemberDto
 * author         : NAHAEJUN
 * date           : 2024-06-30
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-30        NAHAEJUN              최초생성
 */
public class MemberDto {

    private long id;
    private String name;
    private int age;

    public MemberDto() {}

    public MemberDto(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MemberDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
