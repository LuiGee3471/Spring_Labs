package DI_Annotation_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {
  public static void main(String[] args) {
    // 1. Java 코드 
    ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_Annotation_01/DI_Annotation_01.xml");
    MonitorViewer monitorViewer = context.getBean("monitorViewer", MonitorViewer.class);
    System.out.println(monitorViewer.getRecorder());
  }
}
