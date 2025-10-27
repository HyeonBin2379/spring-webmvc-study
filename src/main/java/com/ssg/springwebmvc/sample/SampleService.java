package com.ssg.springwebmvc.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import org.springframework.aop.support.AopUtils;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Log4j2
@Service
// 최신 스프링 문법에서는 @Autowired를 멤버 필드에 사용하는 것을 비권장 -> 생성자 주입 방식 적용
@RequiredArgsConstructor
public class SampleService {

    // 서비스 객체는 SampleDAO의 구현 클래스를 알 필요 없음
    // @Qualifier: 주입 가능한 스프링 빈이 여러 개일 경우, 특정한 스프링 빈을 주입하도록 지정
    @Qualifier("event")
    private final SampleDAO sampleDAO;


    @Override
    public String toString() {
        return "SampleService(sampleDAO=" + AopUtils.getTargetClass(sampleDAO).getName() + ')';
    }
}
