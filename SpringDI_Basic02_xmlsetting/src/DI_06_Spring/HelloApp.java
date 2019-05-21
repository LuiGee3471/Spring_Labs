package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
  public static void main(String[] args) {
    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
    ArticleService service = context.getBean("service", ArticleService.class);
    Article article = context.getBean("article", Article.class);

    service.write(article);
  }
}
