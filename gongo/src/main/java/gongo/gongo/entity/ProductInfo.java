package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class ProductInfo {
    
    @Id
    private String name;

    @ManyToOne
    private Category category;
    
    @ManyToOne
    private Brand brand;

}
