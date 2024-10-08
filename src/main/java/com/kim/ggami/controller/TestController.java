package com.kim.ggami.controller;

import com.kim.ggami.entity.QUser;
import com.kim.ggami.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/test")
public class TestController {

    private final TestService testService;

    @GetMapping("/saveBoard")
    public void boardSaveTest() {
        System.out.println("gg");
        String answer = testService.boardSave();

        log.info("{}",answer);

    }

}
