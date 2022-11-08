package gongo.gongo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter

@Entity
public class WishList extends CommonEntity{
    
    @Id
    private Long id;

    @OneToMany(mappedBy = "wishList",cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<ListProduct> wishList = new HashSet<>();

}
