package com.klashz.microproduct.dto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Builder
@Getter
@Setter
public class ProductResponseDto {

    private Long Id;
    private String name;
    private String description;
    private String image;
    private double price;
    private int stock;

    private List<CommentDto> comments;
}
