package com.klashz.microproduct.client;

import com.klashz.microproduct.dto.CommentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "micro-comments",url = "localhost:9080/comment")
public interface CommentClient {

    @GetMapping("/p/{idProduct}")
    List<CommentDto> getCommentByIdProduct(@PathVariable("idProduct") Long idProduct);
}
