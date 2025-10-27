package com.ssg.springwebmvc.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
// 최신 스프링 문법에서는 @Autowired를 멤버 필드에 사용하는 것을 비권장 -> 생성자 주입 방식 적용
@RequiredArgsConstructor
public class SampleService {

    private final SampleDAO sampleDAO;
}
