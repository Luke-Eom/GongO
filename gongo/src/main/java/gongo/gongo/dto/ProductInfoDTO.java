package gongo.gongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ProductInfoDTO {

    private String name;

   
    private CategoryDTO category;
    
    private String brand;
}
