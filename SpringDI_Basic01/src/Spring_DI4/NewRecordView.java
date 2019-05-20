package Spring_DI4;

import java.util.Scanner;

public class NewRecordView implements RecordView {
  // 점수 출력하기 위해서(NewRecord 객체를 필요)
  
  private NewRecord record;
  
  // 1. 생성자를 통해서 필요한 객체를 생성 or 주입 >> DI
  // 2. 함수를 통해서 setter를 통해서 필요한 객체 주입 >> DI2
  
  public void setRecord(Record record) {
    // 함수의 파라메터로 NewRecord 객체의 주소
    this.record = (NewRecord) record;
  }
  
  @Override
  public void print() {
    System.out.println(record.total() + " / " + record.avg());
  }
  
  @Override
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.print("kor: ");
    record.setKor(sc.nextInt());
    sc.nextLine();
    
    System.out.print("eng: ");
    record.setEng(sc.nextInt());
    sc.nextLine();
    
    System.out.print("math: ");
    record.setMath(sc.nextInt());
    sc.nextLine();
  }
}
