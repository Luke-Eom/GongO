package gongo.gongo.service;

import lombok.RequiredArgsConstructor;
import gongo.gongo.entity.Member;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import gongo.gongo.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService implements UserDetailsService {

    private final MemberRepository memberRepo;

    public Member saveMember(Member member) {
        validateDuplicateMember(member);
        return memberRepo.save(member);
    }

    public void validateDuplicateMember(Member user) {
        Member findMember = memberRepo.findByEmail(user.getEmail());

        if (findMember != null) {
            throw new IllegalStateException("이미 가입된 회원입니다.");
        }
    }

    // 여기서 User는 org.springframework.security.core.userdetails.User;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Member member = memberRepo.findByEmail(email);

        if (member == null) {
            throw new UsernameNotFoundException(email);
        }

        return User.builder()
                .username(member.getEmail())
                .password(member.getPassword())
                .roles(member.getRole().toString())
                .build();
    }



}