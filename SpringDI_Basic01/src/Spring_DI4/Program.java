package Spring_DI4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {
  public static void main(String[] args) {
    
    /*
     * XML 설정에서 작업
     * NewRecordView view = new NewRecordView();
     * NewRecord record = new NewRecord(100, 60, 80);
     *
     * view.setRecord(record);
     */
    
    // view.print();
    // view.input();
    // view.print();
    
    // Spring Framework이 제공하는 메모리(IOC 컨테이너) 사용
    // (IOC 컨테이너) 만들고 그 공간 안에 객체를 생성·조립 >> XML 문서에게
    ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
    RecordView view = (RecordView) context.getBean("view");
    // 코드가 실행되면 IOC 컨테이너 생성 _> DIConfig.xml read -> 객체 생성, 주입 > END
    
    view.input();
    view.print();
  }
}
