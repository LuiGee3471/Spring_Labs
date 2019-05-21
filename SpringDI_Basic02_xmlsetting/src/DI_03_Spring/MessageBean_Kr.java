package DI_03_Spring;

public class MessageBean_Kr implements MessageBean {
  @Override
  public void sayHello(String name) {
    System.out.println("안녕, " + name + "!");
  }
}
