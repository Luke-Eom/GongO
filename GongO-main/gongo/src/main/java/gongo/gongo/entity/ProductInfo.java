package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


@AllArgsConstructor
@Getter
@Builder
@Entity(name = "product_info")
public class ProductInfo extends CommonEntity{
    
    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "category_name")
    private Category category;
    
    private String brand;

    private String detail;

}

