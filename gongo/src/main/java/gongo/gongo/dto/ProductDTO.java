package gongo.gongo.dto;

import com.querydsl.core.annotations.QueryProjection;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDTO {
    
    private Long id;

    private String name;

    private String imageUrl;

    private String brand;

    private String price;

    public ProductDTO(String name, String imageUrl, String brand, String price) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" 고유번호 : ");
		builder.append(id);
        builder.append(" 이미지 : ");
		builder.append(imageUrl);
        builder.append(" 이름 : ");
		builder.append(name);
        builder.append(" 제조사 : ");
		builder.append(brand);
        builder.append(" 가격 : ");
		builder.append(price);
        return builder.toString();
    }

    @QueryProjection
    public ProductDTO(Long id, String name, String imageUrl,
                       String brand, String price){
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.brand = brand;
        this.price = price;

    }

}
