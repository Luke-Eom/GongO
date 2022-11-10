package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gongo.gongo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryCustom{



    // @Query("select p from Product as p inner join product_info as pi where pi.brand like '%:brand%'")
    // ArrayList<Product> findProductByBrand(String brand);
    
    // @Query("select p, pi.category  from Product as p inner join product_info as pi on p.name = pi.name where pi.category like '%:cat%'")
    // ArrayList<Product> findProductByCat(@RequestParam("cat") String cat);
    
    // @Query("select p from Product as p inner join product_info as pi on p.name = pi.name where upper(p.name) like upper('%:name%')")
    // ArrayList<Product> findProductByName(@Param("name") String name);
    
}

