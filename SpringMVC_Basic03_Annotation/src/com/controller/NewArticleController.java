package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.NewArticleCommand;
import com.service.ArticleService;

/*
 * 클라이언트의 요청
 * 1. 화면을 보여주세요 (글쓰기 화면) write.do
 * 2. 처리해주세요 (글쓰기 처리) writeok.do
 * 
   /article/newArticle.do (GET 방식, POST 방식) >> 요청 method (GET) , method (POST)
 * 하나의 요청: 화면, 처리
 */
@Controller
@RequestMapping("/article/newArticle.do") // 방식이 get이냐 post냐 구분
public class NewArticleController {
  
  // NewArticleController와 ArticleService
  private ArticleService articleService;
  
  @Autowired
  public void setArticleService(ArticleService articleService) {
    this.articleService = articleService;
  }
  
  //GET 방식 요청: 사용자 화면 제공
  @RequestMapping(method = RequestMethod.GET)
  public String form() {
    System.out.println("GET 방식 요청");
    return "article/newArticleForm";
    
    // ViewResolver에 의해서
    // /WEB-INF/views/ + article/newArticleForm + .jsp
  }
  
  /*
   * 1. 전통적으로 사용되는 Client 요청 데이터 받는 방법
   * (Spring에서 더 이상 사용하지 않아요)
   * public String submit(HttpServletRequest request)
   *   request.getParameter("title");
   *   
   * 2. parameter DTO 타입을 명시 
   * public String submit(NewArticleCommand command)
   * 동작동리 JSP(usebean action 태그 : setProperty)
   * input name="이름" >> DTO 객체 member field 같다면 setter
   * 
   * submit(NewArticleCommand command)
   * DTO 타입의 member field 명과 parameter 이름이 같다면
   * 1. 자동으로 DTO 객체 생성
   * 1.1 NewArticleCommand 객체 IoC 컨테이너 안에서 생성 id="newArticleCommand"
   * 2. 넘어온 parameter 값을 setter 함수를 통해서 자동 주입
   * 
   * 원칙: ModelAndView mv = new ModelAndView()
   *       mv.addObject("newArticleCommand", command)
   *       return mv
   * 위 원칙이 없어도 view 페이지에 DTO 객체 자동으로 forward (KEY POINT: newArticleCommand)
   * 
   * 다시 정리
   * 
   * 1. submit(NewArticleCommand command)
   * >> 자동 객체 생성, 주입, 객체 변수명이 자동(key): newArticleCommand
   * >> forward >> view page 전달
   * 
   * 2. 객체의 이름이 자동으로 생성되는 것이 싫어요
   * submit(@ModelAttribute("article") NewArticleCommand command)
   * >> 자동으로 생성되는 객체 변수명이 article로 강제
   * 
   * 3. Model.addAttribute("article", new NewArticleCommand)
   */
  
  // POST 방식 요청: 글쓰기 처리
  @RequestMapping(method = RequestMethod.POST)
  public String submit(@ModelAttribute("article") NewArticleCommand command) {
    articleService.writeArticle(command);
    return "article/newArticleSubmitted";
  }
}
