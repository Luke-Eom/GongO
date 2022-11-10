package gongo.gongo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.dto.ProductSearchDTO;

public interface ProductService {
    
    Page<ProductDTO> getAllProduct(ProductSearchDTO psd, Pageable pageable) throws Exception;   
    
}
