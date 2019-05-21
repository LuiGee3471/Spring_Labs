package DI_03_Spring;

public class MessageBean_En implements MessageBean {
  @Override
  public void sayHello(String name) {
    System.out.println("Hello, " + name + "!");
  }
}
