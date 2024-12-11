package com.klashz.microorder.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemDto {

    private Long id;
    private Long orderId;
    private ProductDto productDto;
    private int quantity;
    private double totalPriceByProduct;
}
