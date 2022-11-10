package gongo.gongo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.dto.ProductSearchDTO;
import gongo.gongo.entity.Product;

public interface ProductRepositoryCustom {
    
    Page<Product> getAdminItemPage(ProductSearchDTO psd, Pageable pageable);

    Page<ProductDTO> getAllProduct(ProductSearchDTO itemSearchDto, Pageable pageable);

}
