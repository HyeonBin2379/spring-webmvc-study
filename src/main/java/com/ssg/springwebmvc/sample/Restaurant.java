package com.ssg.springwebmvc.restaurant;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component  // 현재 클래스를 스프링 빈으로 등록
@RequiredArgsConstructor
public class Restaurant {

    private final Chef chef;
}
