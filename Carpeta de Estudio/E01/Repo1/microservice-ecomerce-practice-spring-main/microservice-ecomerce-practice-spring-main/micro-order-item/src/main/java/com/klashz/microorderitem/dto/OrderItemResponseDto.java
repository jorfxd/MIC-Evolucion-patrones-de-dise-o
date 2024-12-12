package com.klashz.microorderitem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderItemResponseDto {

    private Long id;
    private Long orderId;
    private ProductDto productDto;
    private int quantity;
    private double totalPriceByProduct;
}
