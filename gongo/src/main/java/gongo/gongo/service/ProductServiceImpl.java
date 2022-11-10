package gongo.gongo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.entity.Product;
import gongo.gongo.repository.ProductRepository;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService{

    
    @Autowired
    private final ProductRepository productRepo;
   
    public ArrayList<ProductDTO> getProductList(Model model, int page, int size) throws Exception {

        Page <Product> allProducts = productRepo.findAll(PageRequest.of(page, size));
        
        ArrayList <ProductDTO> allDTO = new ArrayList <ProductDTO>();
        

        for (Product i : allProducts) {
            allDTO.add(ProductDTO.builder().id(i.getId()).name(i.getName().getName()).price(i.getPrice()).imageUrl(i.getImageUrl()).link(i.getLink()).build());
        }
        return allDTO;

    }

    public ArrayList <ProductDTO> getProductByBrand(String brand) throws Exception {
        ArrayList <Product> all = productRepo.findProductByBrand(brand);
        ArrayList <ProductDTO> allDTO = new ArrayList <ProductDTO>();
        
        for (Product i : all) {
            allDTO.add(ProductDTO.builder().id(i.getId()).name(i.getName().getName()).price(i.getPrice()).imageUrl(i.getImageUrl()).link(i.getLink()).build());
         }
        
        return allDTO;
        
    }

    public ArrayList <ProductDTO> getProductByName(String name) throws Exception {
        ArrayList<Product> all = productRepo.findProductByName(name);
        ArrayList<ProductDTO> allDTO = new ArrayList<ProductDTO>();

        for (Product i : all) {
            allDTO.add(ProductDTO.builder().id(i.getId()).name(i.getName().getName()).price(i.getPrice()).imageUrl(i.getImageUrl()).link(i.getLink()).build());
        }
        return allDTO;
    }

    public ArrayList <ProductDTO> getProductByCat(String cat) throws Exception {
        ArrayList <Product> all = productRepo.findProductByCat(cat);
        ArrayList <ProductDTO> allDTO = new ArrayList <ProductDTO>();
        
        for (Product i : all) {
                allDTO.add(ProductDTO.builder().id(i.getId()).name(i.getName().getName()).price(i.getPrice()).imageUrl(i.getImageUrl()).link(i.getLink()).build());
        }
        return allDTO;
        
    }




}