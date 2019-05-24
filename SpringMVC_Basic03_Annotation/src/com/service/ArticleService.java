package com.service;

import com.model.NewArticleCommand;

// @Service하면 xml 설정에서
// <context: component-scan base-package="com.controller>
// <bean...을 선언할 필요ㅗ가 없다
public class ArticleService {
  public ArticleService() {
    System.out.println("ArticleService 객체 생성자 호출");
  }
  
  public void writeArticle(NewArticleCommand command) {
    // DAO 객체 생성
    // DAO 객체 insert 함수 호출
    // 생략이다 이 말이야
    System.out.println("글쓰기 작업 완료: " + command.toString());
  }
}
