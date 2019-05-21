package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {
  public static void main(String[] args) {
//    MyBean myBean = new MyBean();
//    MyBean myBean2 = new MyBean("hong");
//
//    Singleton single = Singleton.getInstance();
//    Singleton single2 = Singleton.getInstance();
//
//    // 참조 변수의 주소값
//    System.out.println("myBean: " + myBean);
//    System.out.println("myBean2: " + myBean2);
//    System.out.println("single: " + single);
//    System.out.println("single2: " + single2);
    
    // KEY POINT
    // 컨테이너가 구성되고 xml을 읽어서 객체 생성·조립
    // 필요하다면 컨테이너 안의 객체를 사용
    // getBean() return type >> Object >> 다운캐스팅
    
    // 모든 객체의 타입: 기본이 Singleton
    
    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml");
    System.out.println("before: myBean 객체");
    MyBean myBean = context.getBean("myBean", MyBean.class);
    System.out.println("after: myBean 객체: " + myBean);
    System.out.println("before: myBean 객체");
    MyBean myBean2 = context.getBean("myBean", MyBean.class);
    System.out.println("after: myBean 객체: " + myBean2);
    
    System.out.println("before: myBean2 객체");
    MyBean myBean3 = context.getBean("myBean2", MyBean.class);
    System.out.println("after: myBean2 객체: " + myBean3);
    
    Singleton single = context.getBean("single", Singleton.class);
    System.out.println("Singleton 객체: " + single);
    
    Singleton single2 = context.getBean("single", Singleton.class);
    System.out.println("Singleton 객체: " + single2);
  }
}
