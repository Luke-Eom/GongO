package gongo.gongo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity(name = "product_info")
public class ProductInfo extends CommonEntity{
    
    @Id
    @Column(name = "product_info_name")
    private String name;

    @ManyToOne
    private Category category;
    
    private String brand;

    @OneToMany(mappedBy = "product_info")
    private List<Product> product = new ArrayList<>();
}

