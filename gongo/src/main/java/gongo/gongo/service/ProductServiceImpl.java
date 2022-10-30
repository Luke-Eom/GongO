package gongo.gongo.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.entity.Product;
import gongo.gongo.repository.ProductRepository;

public class ProductServiceImpl implements ProductService {
    
    @Autowired
    ProductRepository productRepo;

    public ArrayList<ProductDTO> getProductByCat(String cat) throws SQLException {
        ArrayList<Product> all = (ArrayList<Product>) productRepo.findAll();
        ArrayList<ProductDTO> allDTO = new ArrayList<ProductDTO>();
        
        for(Product i : all) {
            if(i.getProductInfo().getCategory().getName()==cat) {
                //allDTO.add(ProductDTO.builder().)
            }
        }

        return allDTO;
        
    }
}
