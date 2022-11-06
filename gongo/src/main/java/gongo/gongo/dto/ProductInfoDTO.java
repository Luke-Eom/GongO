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

<<<<<<< Updated upstream
=======
    private String detail;

>>>>>>> Stashed changes
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" 제품명 : ");
		builder.append(name);
        builder.append(" 카테고리: ");
		builder.append(category);
        builder.append(" 브랜드 : ");
		builder.append(brand);
<<<<<<< Updated upstream
=======
        builder.append(" 상세 정보 : ");
		builder.append(detail);
>>>>>>> Stashed changes
        
        return builder.toString();
    }
    
}
