package DI_01;

public class HelloApp {
  public static void main(String[] args) {
    MessageBean messageBean = new MessageBean();
    messageBean.sayHello("Siri");
  }
}
/*
요구사항
영문 버전(hong): Hello, hong! 
한글 버전(hong): 안녕, hong!
기능 2가지

> MessageBean_kr > sayHello()
> MessageBean_en > sayHello()

>> 위 두개의 클래스에 대해서 interface를 구현
*/