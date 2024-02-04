package com.salesstore.storesystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesstore.storesystem.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
