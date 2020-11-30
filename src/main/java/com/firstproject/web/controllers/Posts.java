package com.firstproject.web.controllers;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)//기본 생성자 자동추가, 접근권한 protected
//Entity 클래스를 프로젝트 코드상에서 기본생성자로 생성하는 것은 막되,
//JPA에서 Entity 클래스를 생성하는것은 허용하기 위해 추가
@Getter
@Entity //테이블과 링크될 클래스임을 나타냅니다. 언더스코어 네이밍(_)으로 이름을 매칭합니다.
public class Posts {
    @Id //해당 테이블의 Pk필드를 나타냄 ( 고유번호 )
    @GeneratedValue //PK의 생성규칙을 나타냄, 기본값은 AUTO.INCREMENT
    private Long id;

    @Column(length = 500,nullable = false)
    private String title;
    @Column(columnDefinition = "text",nullable = false)
    private String content;
    private String author;
    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}

