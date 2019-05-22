package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
 * ConfigContext 파일로 XML 파일을 대체
 * ConfigContext 가지고 객체의 생성과 조립
 * 
 * @Configuration (설정 파일)
 * 
 * XML 문서라면
 * <bean id="user" class="DI_Annotation_05.User">
 * <bean id="user2" class="DI_Annotation_05.User2">
 * 
 * 위 코드를 Java에서는 함수로 만들어서 객체를 return
 */

@Configuration
public class ConfigContext {
  @Bean
  public User user() { // 함수 이름 == id
    return new User();
  }
  
  @Bean
  public User2 user2() {
    return new User2();
  }
}
