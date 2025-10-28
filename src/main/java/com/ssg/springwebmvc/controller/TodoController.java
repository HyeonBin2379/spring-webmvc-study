package com.ssg.springwebmvc.controller;

import com.ssg.springwebmvc.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j2
@Controller
@RequestMapping("/todo")
public class TodoController {

    @RequestMapping("/list")
    public void list() {
        log.info("TODO list Controller~");
    }

//    @RequestMapping(value="/register", method = RequestMethod.GET)
    @GetMapping("/register")
    public void register() {
        log.info("TodoController Register method~");
    }

//    Spring 웹 MVC에서 객체자료형 파라미터는 자동 수집됨
    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO) {
        log.info("Post todo register~~~");
        log.info(todoDTO);
    }
}
