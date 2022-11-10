package gongo.gongo.entity;

import gongo.gongo.enums.UserRoles;
import gongo.gongo.dto.JoinFormDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
public class Member extends CommonEntity{

    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String email;
    
    private String name;
    
    private String address;
    
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRoles role;

    public static Member createMember(JoinFormDTO join, PasswordEncoder passwordEncoder) {
        Member member = new Member();
        member.setName(join.getName());
        member.setEmail(join.getEmail());
        member.setAddress(join.getAddress());
        String password = passwordEncoder.encode(join.getPassword());
        member.setPassword(password);
        member.setRole(UserRoles.ADMIN);
        return member;
    }
}

