package com.klashz.microorderitem.client;

import com.klashz.microorderitem.dto.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "micro-product",url = "localhost:9090/product")
public interface ProductClient {

    @GetMapping("/id/{idProduct}")
    Optional<ProductDto> findById(@PathVariable Long idProduct);
}
