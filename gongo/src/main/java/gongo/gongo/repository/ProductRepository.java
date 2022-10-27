package gongo.gongo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import gongo.gongo.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
