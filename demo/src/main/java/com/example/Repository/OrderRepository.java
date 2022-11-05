package com.example.Repository;

import com.example.demo.OrderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;



  public interface OrderRepository extends MongoRepository<OrderDetails,String>{

  }

