package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
<<<<<<< Updated upstream
=======
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
>>>>>>> Stashed changes
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Product extends CommonEntity{
    
    @Id
<<<<<<< Updated upstream
=======
    @GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> Stashed changes
    private Long id;

    @ManyToOne(targetEntity = ProductInfo.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_info_name")
    private ProductInfo name;
    
    private String price;

    private String imageUrl;
    
    private String link;

}
