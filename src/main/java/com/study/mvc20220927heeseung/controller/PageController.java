package com.study.mvc20220927heeseung.controller;

import com.study.mvc20220927heeseung.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @GetMapping("/test1")
    public String test1() {
        return "/test_page1";
    }

    @GetMapping("/test2")
    public String test2() {
        System.out.println("test2");
        return "/test/test_page2";
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData, @RequestParam String name) {
        //@RequestParam은 생략 가능하지만, 가독성을 위해 생략하지 않는다.
        model.addAttribute("data", strData);
        model.addAttribute("name", name);
        return "/test/test_page3";
    }

    @GetMapping("/test4")
    public String test3(Model model, TestReqDto testReqDto) {
        System.out.println(testReqDto);

        model.addAttribute("data", testReqDto.getStrData());
        model.addAttribute("name", testReqDto.getName());
        model.addAttribute("number", testReqDto.getNumber());
        return "/test/test_page4";
    }

    /*
    @ResponseBody
    @GetMapping("/test3")
    public String test3() {
        return "/test_page1";
    }
     */
}
