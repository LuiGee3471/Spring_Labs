package AOP_Exercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
  @Bean
  public WeatherAspect weatherAspect() {
    return new WeatherAspect();
  }
  
  @Bean
  public Forecast rainForecast() {
    return new RainForecast();
  }
  
  @Bean
  public Forecast sunnyForecast() {
    return new SunnyForecast();
  }
  
  @Bean
  public Forecast cloudForecast() {
    return new CloudForecast();
  }
}
