package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import gongo.gongo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, String>{
    
    @Query("select wl.id from wishlist as wl inner join member as m on wl.member = m.id where wl.member = :mId")
    Long findWishlistIdByMemberId(@Param("memberId") String mId);
    

}
