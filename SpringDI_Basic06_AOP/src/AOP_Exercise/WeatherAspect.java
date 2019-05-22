package AOP_Exercise;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class WeatherAspect {
  @Pointcut("execution(public * AOP_Exercise.*Forecast.*(..))")
  private void publicTarget() {
  }

  @Around("publicTarget()")
  public Object printForecast(ProceedingJoinPoint joinPoint) throws Throwable {
    System.out.println("내일의 날씨를 알려드리겠습니다.");
    
    Object result = joinPoint.proceed();
    
    String className = joinPoint.getTarget().getClass().getSimpleName();
    
    if (className.equals("RainForecast")) {
      System.out.println("우산을 꼭 챙겨가시기 바랍니다.");
    } else if (className.equals("SunnyForecast")) {
      System.out.println("나들이 가기 좋은 날입니다.");
    } else {
      System.out.println("생각보다 쌀쌀하니 주의하시기 바랍니다.");
    }
    
    System.out.println("이상 내일의 날씨였습니다.");
    
    return result;
  }
}
