package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
  public static void main(String[] args) {
    // Java 코드
    // MessageBeanImpl messageBean = new MessageBeanImpl("hong");
    // messageBean.setGreeting("hello");
    
    // interface: MessageBean 타입
    // messagebean.sayHello();
    
    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml");
    MessageBean messageBean = context.getBean("m2", MessageBean.class);
    messageBean.sayHello();
  }
}