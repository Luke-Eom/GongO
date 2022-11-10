package gongo.gongo.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gongo.gongo.entity.ListProduct;

public interface ListProductRepository extends JpaRepository<ListProduct, Integer>{

    @Query("select lp from ListProduct as lp where lp.wishlist = :wishlistId")
    ArrayList<ListProduct> findListProductByWishlist(Long wishlistId);

    // @Query("insert into ... (id, .. , wishlistId, )리스트프로덕트 생성 :wishList")

}
