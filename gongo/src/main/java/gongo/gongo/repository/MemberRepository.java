package gongo.gongo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gongo.gongo.entity.Member;
 
 
public interface MemberRepository extends JpaRepository<Member, Long> {
	Member findByEmail(String email);
}
