package DI_07_Spring;

import java.util.List;

public class ProtocolHandler {
  private List<MyFilter> filters; // filters라는 Collection의 주소값
  
  public List<MyFilter> getFilters() {
    return filters;
  }
  
  public void setFilters(List<MyFilter> filters) {
    this.filters = filters;
  }
  
  // 검증하는 함수 
  public int filterLength() {
    return this.filters.size();
  }
}
