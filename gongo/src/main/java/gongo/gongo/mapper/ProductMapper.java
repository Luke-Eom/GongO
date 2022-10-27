package gongo.gongo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.entity.Product;

@Mapper
public  interface ProductMapper{
    
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Override
    ProductDTO toDto(Product entity);
}
