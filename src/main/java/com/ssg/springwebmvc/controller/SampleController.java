package com.ssg.springwebmvc.controller;

import com.ssg.springwebmvc.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Log4j2
// 현재 클래스가 spring MVC의 컨트롤러 역할을 수행한다는 것을 명시
// 이 어노테이션이 붙은 클래스를 스프링 빈으로 등록
@Controller
public class SampleController {

    @GetMapping("/hello")
    public void hello() {
        log.info("hello springwebmvc!");
    }

    @GetMapping("/ex01")
    public void ex01(String name, int age) {
        log.info("ex01에서 수집한 파라미터");
        log.info("name: {}", name);
        log.info("age: {}", age);
    }

//    @RequestParam 어노테이션을 사용하여 파라미터로 전달할 값의 초기값을 설정 가능
    @GetMapping("/ex02")
    public void ex02(@RequestParam(name = "name", defaultValue = "lalala") String name, @RequestParam(name="age", defaultValue = "10") int age) {
        log.info("ex02에서 수집한 파라미터");
        log.info("name: {}", name);
        log.info("age: {}", age);
    }

    @GetMapping("/ex03")
    public void ex03(LocalDate dueDate) {
        log.info("ex03에서 수집한 파라미터");
        log.info("dueDate: " + dueDate);
    }

    @GetMapping("/ex04")
    public void ex04(Model model) {
        log.info("ex04 Model 파라미터");

        // 이제는 forwarding 없이도 model 객체를 사용하여 뷰에서 원하는 메시지 출력 가능
        model.addAttribute("message", "Hello Spring MVC");
    }

    @GetMapping("/ex04_1")
    public void ex04_1(TodoDTO todoDTO, Model model) {
        log.info(todoDTO);

        // Model 객체를 통해 수집한 객체의 정보를 뷰에서 출력
        model.addAttribute("todoDTO", todoDTO);
    }
}
