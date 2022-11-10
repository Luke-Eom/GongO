package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gongo.gongo.entity.ProductInfo;

public interface ProductInfoRepository extends JpaRepository<ProductInfo, Long>{
    
}
