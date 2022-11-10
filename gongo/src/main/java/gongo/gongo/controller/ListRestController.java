package gongo.gongo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.service.ProductService;

@RestController
@RequestMapping("freelancer/search")
public class ListRestController {
    
    @Autowired
    private ProductService productService;

    @GetMapping("/all/{page}/{size}")
    public ArrayList<ProductDTO> productAll(@PathVariable("page") int page, @PathVariable("size") int size) throws Exception {
        return productService.getProductList(page, size);    
    }

    // @GetMapping("/brandAll")
    // public ArrayList<ProductDTO> brandAll(String brand) throws Exception {
    //     return productService.getProductByBrand(brand);
    // }

    @GetMapping("/categoryAll/{page}/{size}")
    public ArrayList<ProductDTO> categoryAll(String cat, @PathVariable("page") int page, @PathVariable("size") int size) throws Exception {
        return productService.getProductByCat(page, size, cat);
    }

    @GetMapping("/input")
    public ArrayList<ProductDTO> nameAll(String input) throws Exception {
        return productService.getProductByInput(input);
    }
}
