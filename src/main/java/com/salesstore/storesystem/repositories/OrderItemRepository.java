package com.salesstore.storesystem.repositories;

import com.salesstore.storesystem.entities.OrderItem;
import com.salesstore.storesystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
