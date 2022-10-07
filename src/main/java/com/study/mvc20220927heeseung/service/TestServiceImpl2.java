package com.study.mvc20220927heeseung.service;

import com.study.mvc20220927heeseung.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ts2")
public class TestServiceImpl2 implements TestService{
    @Override
    public void logic1() {
        System.out.println("테스트2 클래스에서 logic1 메소드 실행");
    }

    @Override
    public void logic2() {
        System.out.println("테스트2 클래스에서 logic2 메소드 실행");
    }
}
