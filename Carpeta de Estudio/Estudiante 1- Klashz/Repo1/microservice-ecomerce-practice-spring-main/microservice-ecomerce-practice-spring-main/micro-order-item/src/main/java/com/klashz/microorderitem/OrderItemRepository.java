package com.klashz.microorderitem;

import org.hibernate.query.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity,Long> {

    List<OrderItemEntity> findByIdOrder(Long orderId);
}
