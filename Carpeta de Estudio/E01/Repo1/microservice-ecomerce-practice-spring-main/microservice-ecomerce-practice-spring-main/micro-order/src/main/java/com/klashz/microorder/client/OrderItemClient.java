package com.klashz.microorder.client;

import com.klashz.microorder.dto.OrderItemDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(name = "micro-order-item",url = "localhost:7090/item")
public interface OrderItemClient {

    @GetMapping("/byOrder/{id}")
    List<OrderItemDto> listOrderItemsByOrderId(@PathVariable Long id);
}
