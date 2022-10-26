package gongo.gongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder


public class ProductDTO {
    
    private int productId;

    private String productName;

    private int price;

    private String img;

    private String link;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" 고유번호 : ");
		builder.append(productId);
        builder.append(" 이름 : ");
		builder.append(productName);
        builder.append(" 가격 : ");
		builder.append(price);
        builder.append(" 이미지 : ");
		builder.append(img);
        builder.append(" 링크 : ");
		builder.append(link);
        
        return builder.toString();
    }

}
