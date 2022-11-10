package gongo.gongo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WishlistDTO {
    
    private Long listProductId;

    
    private String productName;
    
    private String price;
    
      public WishlistDTO(Long listProductId, String productName, String price){
        
        this.listProductId = listProductId;
        this.productName = productName;
        this.price = price;
    }

}
