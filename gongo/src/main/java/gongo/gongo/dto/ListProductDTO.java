package gongo.gongo.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListProductDTO {

    private int id;
    
    //
    private int count;
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" id : ");
		builder.append(id);
        builder.append(" 위시리스트 카운트 : ");
		builder.append(count);
        return builder.toString();
    }

}
