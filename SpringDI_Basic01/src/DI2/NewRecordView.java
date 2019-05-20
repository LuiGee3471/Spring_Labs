package DI2;

public class NewRecordView {
  // 점수 출력하기 위해서(NewRecord 객체를 필요)
  
  private NewRecord record;
  
  // 1. 생성자를 통해서 필요한 객체를 생성 or 주입 >> DI
  // 2. 함수를 통해서 setter를 통해서 필요한 객체 주입 >> DI2
  
  public void setRecord(NewRecord record) {
    // 함수의 파라메터로 NewRecord 객체의 주소
    this.record = record;
  }
  
  public void print() {
    System.out.println(record.total() + " / " + record.avg());
  }
}
