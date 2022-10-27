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
@Entity(name = "product_info")
public class ProductInfo extends CommonEntity{
    
    @Id
    private String name;

    @ManyToOne
    private Category category;
    
    private String brand;

}
