package DI_Annotation_02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MonitorViewer {
  private Recorder recorder;

  public Recorder getRecorder() {
    return recorder;
  }

  @Autowired
  @Qualifier("recorder1")
  public void setRecorder(Recorder recorder) {
    this.recorder = recorder;
    System.out.println("setter 주입 성공");
  }
  
  // 일반함수
  @Autowired
  @Qualifier("recorder2")
  public void gMethod(Recorder rec) {
    System.out.println("gMethod(rec): " + rec);
  }
}
