package gongo.gongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class ProductInfoDTO {
    
    private Long id;

    private String name;
    
    private String category;
        
    
    
    private String link;

    public ProductInfoDTO(String name, String category, String link) {
        this.name = name;
        this.category = category;
        this.link = link;  
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" 고유번호 : ");
		builder.append(id);
        builder.append(" 제품명 : ");
		builder.append(name);
        builder.append(" 카테고리: ");
		builder.append(category);
        builder.append(" 링크 : ");
		builder.append(link);
        return builder.toString();
    }

}
