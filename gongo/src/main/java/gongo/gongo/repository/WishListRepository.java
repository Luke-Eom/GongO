package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gongo.gongo.entity.Wishlist;

public interface WishListRepository extends JpaRepository<Wishlist, Long>{
    
}
