package main.java.com.example.minisklep.repository;

import com.example.minisklepbackend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
