package gongo.gongo.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import gongo.gongo.dto.ProductDTO;

public interface ProductService {
    ArrayList<ProductDTO> getProductList(Model model, int page, int size) throws Exception;
    
    ArrayList<ProductDTO> getProductByBrand(String brand) throws Exception;
    
    ArrayList<ProductDTO> getProductByCat(String cat) throws Exception;

    ArrayList<ProductDTO> getProductByName(String name) throws Exception;
}
