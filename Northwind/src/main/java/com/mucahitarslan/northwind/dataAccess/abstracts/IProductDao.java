package com.mucahitarslan.northwind.dataAccess.abstracts;

import com.mucahitarslan.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IProductDao extends JpaRepository<Product,Integer> {

    Product findByProductName(String productName);
    Product findByProductNameAndCategory_CategoryId(String productName, int categoryId);

    List<Product> findByProductNameOrCategoryCategoryId(String productName, int categoryId);

    List<Product> findByCategoryCategoryIdIn(List<Integer> categories);

    List<Product> findByProductNameContains(String productName);
}
