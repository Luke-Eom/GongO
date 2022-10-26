package gongo.gongo.dto;
 
import java.util.Set;

import gongo.gongo.entity.Role;
import gongo.gongo.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
 
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
	private String id;
 
	private String password;
 
	private String name;
 
	private Set<Long> roles;
 
	public User toEntity(Set<Role> roles) {
		return User.builder().id(id).password(password).name(name).roles(roles).build();
	}
}