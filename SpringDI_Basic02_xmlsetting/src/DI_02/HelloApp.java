package DI_02;

public class HelloApp {
  public static void main(String[] args) {
    MessageBean messageBean = new MessageBean_En();
    messageBean.sayHello("Siri");
    messageBean = new MessageBean_Kr();
    messageBean.sayHello("시리");
  }
}
