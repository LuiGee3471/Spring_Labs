package DI2;

public class Program {
  public static void main(String[] args) {
    NewRecord record = new NewRecord(100, 70, 80);
    NewRecordView view = new NewRecordView();
    view.setRecord(record);
    
    view.print();
  } 
}
