package gongo.gongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.dto.ProductSearchDTO;
import gongo.gongo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    
    @Autowired
    private final ProductRepository productRepo;
   
    @Transactional(readOnly = true)
    public Page<ProductDTO> getAllProduct(ProductSearchDTO psd, Pageable pageable){
        return productRepo.getAllProduct(psd, pageable);
    }

}