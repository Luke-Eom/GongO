package gongo.gongo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@AllArgsConstructor
@Getter
@Builder
@Entity(name = "product_info")
public class ProductInfo extends CommonEntity{
    
    @Id
    @OneToMany(mappedBy = "product_info", cascade = CascadeType.REMOVE)
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_name")
    private Category category;
    
    private String brand;

}

