package com.ssg.springwebmvc.prof;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@ToString
@Component
@RequiredArgsConstructor
public class LectureRoom {

    private final Professor professor;
}
