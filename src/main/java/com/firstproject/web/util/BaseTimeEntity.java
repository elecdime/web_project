package com.firstproject.web.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass//JPA Entity 클래스들이 BaseTimeEntity을 상속할 경우 필드들
//(createdDate,ModifiedDate)도 컬럼으로 인식하게 만듬.
@EntityListeners(AuditingEntityListener.class)//BaseTimeEntity클래스에 Auditing 기능을 포함시킵니다.
public class BaseTimeEntity {
    @CreatedDate//Entity가 생성되어 저장될 때 시간이 자동 저장됩니다.
    private LocalDateTime createDate;
    @LastModifiedDate//@LastModifiedDate
    private LocalDateTime modifiedDate;

}
