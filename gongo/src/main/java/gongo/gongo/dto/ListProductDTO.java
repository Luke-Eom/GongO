package gongo.gongo.dto;

public class ListProductDTO {

    private int id;
    
    //@Join
    private WishListDTO wishListId;

    private ProductDTO product;

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(" id : ");
		builder.append(id);
        builder.append(" wishList: ");
		builder.append(wishListId);
        builder.append(" product : ");
		builder.append(product);
        
        return builder.toString();
    }

    CRUD
}
