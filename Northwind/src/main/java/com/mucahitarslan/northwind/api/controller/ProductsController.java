package com.mucahitarslan.northwind.api.controller;

import com.mucahitarslan.northwind.business.abstracts.IProductService;
import com.mucahitarslan.northwind.core.utilities.results.DataResult;
import com.mucahitarslan.northwind.core.utilities.results.Result;
import com.mucahitarslan.northwind.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    private final IProductService productService;

    @Autowired
    public ProductsController(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        return productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return productService.add(product);
    }
}
