package AOP_Basic_06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
  public static void main(String[] args) {
    ApplicationContext context = new GenericXmlApplicationContext("classpath:AOP_Basic_06/ApplicationContext.xml");
    Calc calc = context.getBean("proxy", Calc.class);
    
    int result = calc.sub(10, 20);
    System.out.println("result: " + result);
    
    result = calc.mul(10, 20);
    System.out.println("result: " + result);
  }
}
