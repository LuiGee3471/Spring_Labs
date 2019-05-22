package AOP_Exercise;

public class CloudForecast implements Forecast {
  @Override
  public void weatherTomorrow() {
    System.out.println("내일은 날이 흐리겠습니다.");
  }
}
