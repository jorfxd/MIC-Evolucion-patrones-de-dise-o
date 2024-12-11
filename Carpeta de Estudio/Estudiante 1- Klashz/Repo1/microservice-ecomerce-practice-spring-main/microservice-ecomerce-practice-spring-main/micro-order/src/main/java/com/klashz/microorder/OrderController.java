package com.klashz.microorder;

import com.klashz.microorder.client.OrderItemClient;
import com.klashz.microorder.dto.OrderItemDto;
import com.klashz.microorder.dto.OrderResponseDto;
import com.klashz.microorder.utils.OrderStatus;
import jakarta.persistence.criteria.Order;
import jakarta.ws.rs.DELETE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private OrderItemClient orderItemClient;

    @PostMapping("/create")
    public void createOrder(@RequestBody OrderEntity order) {
        LocalDateTime now = LocalDateTime.now();
        order.setLocalDateTime(now);
        order.setStatus(OrderStatus.PENDING);
        order.setTotalPrice(0.0);
        orderRepository.save(order);

    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponseDto> getOrder(@PathVariable Long id) {
        Optional<OrderEntity> order = orderRepository.findById(id);
        if (order.isPresent()) {
            OrderEntity o = order.get();
            List<OrderItemDto> itemsByOrder = orderItemClient.listOrderItemsByOrderId(id);
            OrderResponseDto orderResponseDto = new OrderResponseDto();
            orderResponseDto.setId(o.getId());
            orderResponseDto.setCity(o.getCity());
            orderResponseDto.setCountry(o.getCountry());
            orderResponseDto.setOrderItems(itemsByOrder);
            orderResponseDto.setTotalPrice(calculateTotalPrice(itemsByOrder));
            return ResponseEntity.ok(orderResponseDto);

        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteOrder(@PathVariable Long id) {
        orderRepository.deleteById(id);
    }


    private double calculateTotalPrice(List<OrderItemDto> items) {
        double totalPrice = 0.0;
        for (OrderItemDto item : items) {
            totalPrice+=item.getTotalPriceByProduct();
        }
        return totalPrice;
    }
}
