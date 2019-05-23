package com.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * public class HelloController implements Controller
 * 단점: 컨트롤러 하나가 요청 하나만 처리
 * 요청이 10개면 10개의 컨트롤러 필요?
 * Annotation을 사용하면 method 단위 mapping 가능
 * 하나의 클래스가 요청 10개를 처리 > 대신 함수 10개
 * 
 * @Controller 사용하면 함수 단위의 매핑 가능
 * @RequestMapping >> 함수 단위의 매핑 가능
 */

@Controller
public class HelloController {
  @RequestMapping("/hello.do")
  public ModelAndView hello() {
    System.out.println("[hello.do start]");
    ModelAndView mv = new ModelAndView();
    mv.addObject("greeting", getGreeting());
    mv.setViewName("hello");
    
    return mv;
  }
  
  // 필요하다면 일반 함수를 만들어서 사용 가능
  public String getGreeting() {
    int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    String data = "";
    if (hour >= 6 && hour <= 10) {
      data = "학습시간";
    } else if (hour >= 11 && hour <= 15) {
      data = "배고픈 시간";
    } else if (hour >= 16 && hour <= 18) {
      data = "졸린 시간";
    } else {
      data = "go home";
    }
    
    return data;
  }
}

