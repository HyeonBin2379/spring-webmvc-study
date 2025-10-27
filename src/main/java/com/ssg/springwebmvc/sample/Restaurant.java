package com.ssg.springwebmvc.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.aop.support.AopUtils;
import org.springframework.stereotype.Component;

@Component  // 현재 클래스를 스프링 빈으로 등록
@RequiredArgsConstructor    // 생성자 주입 형태로 요청
public class Restaurant {

    private final Chef chef;

    @Override
    public String toString() {
        return "Restaurant(Chef=" + AopUtils.getTargetClass(chef).getName() + ')';
    }
}
