package DI_Annotation_01;

import org.springframework.beans.factory.annotation.Autowired;

public class MonitorViewer {
  /*
  1단계: XML 설정 파일로 DI 작업
  private Recorder recorder;

  public Recorder getRecorder() {
    return recorder;
  }

  public void setRecorder(Recorder recorder) {
    this.recorder = recorder;
  }
  */
  
  // 2단계: Annotation 기반 DI 작업(Injection : 생성자 주입. setter)
  // 추가적으로 member field도 injection 가능
  // @Autowired: IOC 컨테이너 안에 Recorder 타입을 가진 객체가 있다면
  // 자동으로 그 객체의 주소를 받겠다
  // Recorder r = new Recorder();
  // recorder = r;
  
  /*
  @Autowired
  private Recorder recorder;

  public Recorder getRecorder() {
    return recorder;
  }
  */
  
  // setter를 통한 자동 주입
  
  private Recorder recorder;

  public Recorder getRecorder() {
    return recorder;
  }

  @Autowired // 타입 기반
  public void setRecorder(Recorder recorder) {
    this.recorder = recorder;
  }
}
