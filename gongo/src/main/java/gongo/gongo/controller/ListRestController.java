package gongo.gongo.controller;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gongo.gongo.dto.ProductDTO;
import gongo.gongo.service.ProductService;

@RestController
@RequestMapping("freelancer/search")
public class ListRestController {
    
    @Autowired
    private ProductService productService;

    @GetMapping(value ="/all/{page}/{size}")
    public ArrayList<ProductDTO> productAll(Model model, @PathVariable("page") Integer page, @PathVariable("size") Integer size) throws Exception {
        // int startPage = Math.max(0, allProducts.getPageable().getPageNumber() - 4);
        // int endPage = Math.min(allProducts.getTotalPages(), allProducts.getPageable().getPageNumber() + 4);
        // model.addAttribute("startPage", startPage);
        // model.addAttribute("endPage", endPage);
        // model.addAttribute("all", allProducts);
        return productService.getProductList(model, page, size);
    }
    
    @GetMapping("/brandAll")
    public ArrayList<ProductDTO> brandAll(String brand) throws Exception {
        
        return productService.getProductByBrand(brand);
    }
    
    @GetMapping("/categoryAll")
    public ArrayList<ProductDTO> categoryAll(@RequestParam("cat") String cat) throws Exception {
        return productService.getProductByCat(cat);
    }
    
    @GetMapping("/nameAll")
    public ArrayList<ProductDTO> nameAll(String name) throws Exception {
        return productService.getProductByName(name);
    }
}