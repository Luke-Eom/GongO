package gongo.gongo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductSearchDTO {
    
    private String searchDateType;
    
    // private ItemSellStatus searchSellStatus;
    
    private String searchBy;
    
    private String searchQuery = "";
}
