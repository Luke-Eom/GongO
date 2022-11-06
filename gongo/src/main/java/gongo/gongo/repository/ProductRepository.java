package gongo.gongo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import gongo.gongo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
   
<<<<<<< Updated upstream
    @Query("select p from Product where p.brand like %:brand%")
    ArrayList<Product> findProductByBrand(String brand);
    
    @Query("select p from Product where p.cat like %:cat%")
    ArrayList<Product> findProductByCat(String cat);
    
    @Query("select p from Product as p inner join ProductInfo as pi on p.name = pi.name where upper(p.name) like upper(%:name%)")
=======
    @Query("select p from Product as p inner join product_info as pi where pi.brand like '%:brand%'")
    ArrayList<Product> findProductByBrand(String brand);
    
    @Query("select p from Product as p inner join product_info as pi where pi.category like '%:cat%'")
    ArrayList<Product> findProductByCat(String category);
    
    @Query("select p from Product as p inner join product_info as pi on p.name = pi.name where upper(p.name) like upper('%:name%')")
>>>>>>> Stashed changes
    ArrayList<Product> findProductByName(@Param("name") String name);
    
}

