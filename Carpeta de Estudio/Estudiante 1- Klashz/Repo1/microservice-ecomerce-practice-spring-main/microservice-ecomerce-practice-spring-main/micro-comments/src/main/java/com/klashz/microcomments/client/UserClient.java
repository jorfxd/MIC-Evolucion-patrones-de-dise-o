package com.klashz.microcomments.client;

import com.klashz.microcomments.dto.UserDto;
import jakarta.ws.rs.GET;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "micro-user",url = "localhost:8090/users")
public interface UserClient {

    @GetMapping("/{id}")
    Optional<UserDto> findById(@PathVariable("id") Long id);
}
