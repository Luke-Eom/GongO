package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gongo.gongo.entity.Wishlist;

public interface WishListRepository extends JpaRepository<Wishlist, Integer>{
    
    // save 저장 (memberId / wishlistId)

    // delete 삭제 (deleteById)



}
