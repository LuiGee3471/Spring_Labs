package com.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.OrderCommand;
import com.model.OrderItem;

// 주문화면(UI), 주문(처리)
// 1. 하나의 요청 주소

// 다른 방식: 요청 주소 > 화면 order.dp
//                      > 처리 orderok.do

// 하나의 주소: order.do: 화면, 처리 모두

@Controller
@RequestMapping("/order/order.do")
public class OrderController {
  @RequestMapping(method = RequestMethod.GET)
  public String form() {
    return "order/OrderForm";
  }
  
  @RequestMapping(method = RequestMethod.POST)
  public String submit(OrderCommand orderCommand) {
    System.out.println("orderCommand: " + orderCommand);
    System.out.println("orderItems size: " + orderCommand.getOrderItems().size());
    
    // 검증
    List<OrderItem> items = orderCommand.getOrderItems();
    for (OrderItem item : items) {
      System.out.println(item);
    }
    
    // OrderCommand orderCommand는 자동으로 forward (객체 이름은 orderCommand)
    // == request.setAttribute("orderCommand", orderCommand);
    
    return "order/OrderCommitted";
  }
}
