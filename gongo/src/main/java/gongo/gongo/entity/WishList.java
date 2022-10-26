package gongo.gongo.entity;

import java.util.HashSet;
import java.util.Set;

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
public class WishList {
    
    @Id
    private int id;

    private User name;

    @OneToMany(mappedBy = "product")
    private Set<ListProduct> wishList = new HashSet<>();

}
