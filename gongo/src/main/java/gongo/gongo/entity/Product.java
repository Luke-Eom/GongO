package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Product {
    
    @Id
    private int id;

    @ManyToOne
    private ProductInfo productInfo;
    
    private String price;

    private String imageUrl;
    
    private String link;
    
}
