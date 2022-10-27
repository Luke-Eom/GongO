package gongo.gongo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumn;
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
    private int id;

    @ManyToOne(fetch = FetchType.LAZY) 
    @JoinColumn(name = "product_info_name") // jointable   1. 테이블이 하나로 합쳐서나올때 / 2. 안합쳐질때 - 
    private ProductInfo productInfo;
    
    private String price;

    private String imageUrl;
    
    private String link;
    
}
