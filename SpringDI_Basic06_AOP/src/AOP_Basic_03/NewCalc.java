package AOP_Basic_03;

public class NewCalc implements Calc {
  @Override
  public int add(int x, int y) {
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    int sum = x + y; // 주 업무 (core-concern)
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    return sum;
  }

  @Override
  public int mul(int x, int y) {
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    int mul = x * y; // 주 업무 (core-concern)
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    return mul;
  }

  @Override
  public int sub(int x, int y) {
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    int sub = x - y; // 주 업무 (core-concern)
    // 보조 업무 (공통 사항: Cross-Cutting Concern)
    return sub;
  }
}
