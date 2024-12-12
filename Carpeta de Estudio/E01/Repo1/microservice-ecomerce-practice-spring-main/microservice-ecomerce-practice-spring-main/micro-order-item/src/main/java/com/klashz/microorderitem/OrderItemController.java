package com.klashz.microorderitem;

import com.klashz.microorderitem.client.ProductClient;
import com.klashz.microorderitem.dto.OrderItemResponseDto;
import com.klashz.microorderitem.dto.ProductDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/item")
public class OrderItemController {

    @Autowired
    private OrderItemRepository repository;

    @Autowired
    private ProductClient productClient;

    @PostMapping("/add/{idOrder}")
    private ResponseEntity<OrderItemEntity> addOrderItem(@PathVariable Long idOrder, @RequestBody OrderItemEntity orderItemEntity) {
        orderItemEntity.setIdOrder(idOrder);
        return ResponseEntity.status(201).body(repository.save(orderItemEntity));
    }

    @GetMapping("/{id}")
    private ResponseEntity<OrderItemResponseDto> getOrderItem(@PathVariable Long id) {
        Optional<OrderItemEntity> orderItemEntity = repository.findById(id);
        if (orderItemEntity.isPresent()) {
            OrderItemEntity o = orderItemEntity.get();
            ProductDto p = productClient.findById(o.getIdProduct()).get();
            OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
            orderItemResponseDto.setId(o.getIdOrder());
            orderItemResponseDto.setOrderId(o.getIdOrder());
            orderItemResponseDto.setProductDto(p);
            orderItemResponseDto.setQuantity(o.getQuantity());
            orderItemResponseDto.setTotalPriceByProduct(o.getQuantity()*p.getPrice());
            return ResponseEntity.status(200).body(orderItemResponseDto);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/byOrder/{idOrder}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    private List<OrderItemResponseDto> getOrderItemsByOrder(@PathVariable Long idOrder) {
        return repository.findByIdOrder(idOrder).stream()
                .map(orderItemEntity -> {
                    OrderItemResponseDto orderItemResponseDto = new OrderItemResponseDto();
                    ProductDto p = productClient.findById(orderItemEntity.getIdProduct()).get();
                    orderItemResponseDto.setId(orderItemEntity.getIdOrder());
                    orderItemResponseDto.setOrderId(orderItemEntity.getIdOrder());
                    orderItemResponseDto.setProductDto(p);
                    orderItemResponseDto.setQuantity(orderItemEntity.getQuantity());
                    orderItemResponseDto.setTotalPriceByProduct(p.getPrice()*orderItemEntity.getQuantity());
                    return orderItemResponseDto;
                }).toList();
    }

    @DeleteMapping("/delete/{id}")
    private ResponseEntity<OrderItemEntity> deleteOrderItem(@PathVariable Long id) {
        Optional<OrderItemEntity> orderItemEntity = repository.findById(id);
        if (orderItemEntity.isPresent()) {
            repository.deleteById(id);
            return ResponseEntity.status(200).body(orderItemEntity.get());
        }
        return ResponseEntity.notFound().build();
    }
}
