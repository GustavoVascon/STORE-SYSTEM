package com.salesstore.storesystem.repositories;
import com.salesstore.storesystem.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
