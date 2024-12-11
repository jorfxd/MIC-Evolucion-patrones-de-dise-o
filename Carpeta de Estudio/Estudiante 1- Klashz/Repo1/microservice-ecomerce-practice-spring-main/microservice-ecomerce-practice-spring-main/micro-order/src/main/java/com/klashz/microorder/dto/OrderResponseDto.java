package com.klashz.microorder.dto;

import com.klashz.microorder.utils.OrderStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderResponseDto {

    private Long id;
    private String city;
    private String country;
    private double totalPrice;
    private List<OrderItemDto> orderItems;
}
