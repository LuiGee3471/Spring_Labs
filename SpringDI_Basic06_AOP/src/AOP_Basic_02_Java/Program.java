package AOP_Basic_02_Java;

import java.lang.reflect.Proxy;

public class Program {
  public static void main(String[] args) {
    Calc calc = new NewCalc();

    // Proxy 객체 통해서 처리
    Calc cal = (Calc) Proxy.newProxyInstance(calc.getClass().getClassLoader(), // 실제 클래스 메타 정보 
        calc.getClass().getInterfaces(), // 행위 정보(함수)
        new LogPrintHandler(calc)); // 보조 관심 >> 실 객체 주소
    
    int result = cal.mul(5000, 2000);
    System.out.println("main: " + result);
  }
}
