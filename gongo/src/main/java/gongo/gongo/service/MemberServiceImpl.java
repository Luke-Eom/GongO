package gongo.gongo.service;

import org.springframework.beans.factory.annotation.Autowired;

import gongo.gongo.repository.MemberRepository;

public class MemberServiceImpl implements MemberService {
    
    @Autowired
    private MemberRepository mRepo;

    public Long getWishlistId(String memberId) throws Exception {

        return mRepo.findWishlistIdByMemberId(memberId);
        
    }

}
