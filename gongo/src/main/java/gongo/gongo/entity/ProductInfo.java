package gongo.gongo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
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
    @Column(name = "product_info_name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "category_name", referencedColumnName = "name")
    private Category category;
    
    private String brand;

<<<<<<< Updated upstream
    @OneToMany(mappedBy = "product_info")
    private List<Product> product = new ArrayList<>();
=======
    private String detail;

>>>>>>> Stashed changes
}

