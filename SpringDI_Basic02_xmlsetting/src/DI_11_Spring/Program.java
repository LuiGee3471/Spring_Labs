package DI_11_Spring;

import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
  public static void main(String[] args) {
    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_11_Spring/DI_11.xml");
    DataSourceFactory factory = context.getBean("factory", DataSourceFactory.class);
    System.out.println(factory);
  }
}
