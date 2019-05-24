package com.model;

import java.util.List;

// 주문서 클래스
// 하나의 주문은 여러 개의 상품을 가질 수 있다
public class OrderCommand {
  private List<OrderItem> orderItems;
  // ArrayList, Vector 통해서 주소값

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  public void setOrderItems(List<OrderItem> orderItems) {
    this.orderItems = orderItems;
  }
  /*
   * OrderCommand command = new OrderCommand();
   * KEY POINT
   * command.setOrderItems(상품 목록);
   * List<OrderItem> list = new ArrayList<>();
   * list.add(new OrderItem(1, 10, "흑우 ㄳ"));
   * list.add(new OrderItem(2, 100, "...));
   * list.add(new OrderItem(3, 10, "음머"));
   * command.setOrderItems(list);
   * 
   * Map > Map<,>
   */
}
