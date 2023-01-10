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

    @GetMapping("/getAllByPage")
    public DataResult<List<Product>> getAll(int pageNo, int pageSize){
        return productService.getAll(pageNo - 1,pageSize);
    }

    @GetMapping("/getAllSorted")
    public DataResult<List<Product>> getAllSorted(){
        return productService.getAllSorted();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return productService.add(product);
    }

    @GetMapping("/getByProductName")
    public DataResult<Product> getByProductName(@RequestParam String productName){
        return productService.findByProductName(productName);
    }

    @GetMapping("/getByProductNameAndCategory")
    public DataResult<Product> getByProductNameAndCategory(@RequestParam(name = "productName") String productName,
                                                           @RequestParam(name = "categoryId") int categoryId){
        return productService.findByProductNameAndCategoryCategoryId(productName,categoryId);
    }

    @GetMapping("/getByProductNameOrCategoryId")
    public DataResult<Product> getByProductNameOrCategoryId(@RequestParam(name = "productName") String productName,
                                                           @RequestParam(name = "categoryId") int categoryId){
        return productService.findByProductNameAndCategoryCategoryId(productName,categoryId);
    }

    @GetMapping("/getByCategoryIdIn")
    public DataResult<List<Product>> getByCategoryIdIn(List<Integer> categories){
        return productService.findByCategoryIdIn(categories);
    }

    @GetMapping("/getByProductNameContains")
    public DataResult<List<Product>> getByProductNameContains(@RequestParam(name = "productName") String productName){
        return productService.findByProductNameContains(productName);
    }


}
