package gongo.gongo.dto;

import gongo.gongo.entity.Product;
import gongo.gongo.entity.ProductInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class ProductDTO {
    
    private int id;
    
    private ProductInfo name;

    private String price;

    private String imageUrl;
    
    private String link;
    

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" 고유번호 : ");
		builder.append(id);
        builder.append(" 이름 : ");
		builder.append(name);
        builder.append(" 가격 : ");
		builder.append(price);
        builder.append(" 이미지 : ");
		builder.append(imageUrl);
        builder.append(" 링크 : ");
		builder.append(link);
        
        return builder.toString();
    }

    public Product toEntity() {
        return Product.builder().id(id).productInfo(name).price(price).imageUrl(imageUrl).link(link)build();
    }

}
