package DI3;

public class Program {
  public static void main(String[] args) {
    NewRecordView view = new NewRecordView();
    NewRecord record = new NewRecord(100, 60, 80);
    
    view.setRecord(record);
    
    view.print();
    view.input();
    view.print();
  }
}
