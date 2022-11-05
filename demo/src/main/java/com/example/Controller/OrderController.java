package com.example.Controller;


import com.example.Repository.OrderRepository;
import com.example.demo.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

  @Autowired
  private OrderRepository orderRepository;

  @PostMapping("/create")
  public String addOrder(@RequestBody OrderDetails orderDetails)
  {
    orderRepository.save(orderDetails);
    return "Order Added Successfully";
  }

  @GetMapping("order/{orderId}")
  public Optional<OrderDetails> getById(@PathVariable("orderId") String orderId)
  {
    return orderRepository.findById(orderId);
  }

  @GetMapping("orders")
   public List<OrderDetails> getAllOrders(){
    return orderRepository.findAll();
   }
}
