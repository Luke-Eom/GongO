package gongo.gongo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;



@Mapper
public  interface ProductMapper{
    
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    
}
