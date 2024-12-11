package com.klashz.microorder;

import com.klashz.microorder.utils.OrderStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idUser;
    private String city;
    private String country;
    private String phone;
    private OrderStatus status;
    private double totalPrice;
    private LocalDateTime localDateTime;

}
