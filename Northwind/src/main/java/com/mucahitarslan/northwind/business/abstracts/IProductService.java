package com.mucahitarslan.northwind.business.abstracts;

import com.mucahitarslan.northwind.core.utilities.results.DataResult;
import com.mucahitarslan.northwind.core.utilities.results.Result;
import com.mucahitarslan.northwind.entities.concretes.Product;

import javax.xml.crypto.Data;
import java.util.List;

public interface IProductService {
    DataResult<List<Product>> getAll();
    DataResult<List<Product>> getAll(int pageNo, int pageSize);
    DataResult<List<Product>> getAllSorted();
    Result add(Product product);

    DataResult<Product> findByProductName(String productName);
    DataResult<Product> findByProductNameAndCategoryCategoryId(String productName, int categoryId);

    DataResult<List<Product>> findByProductNameOrCategoryId(String productName, int categoryId);

    DataResult<List<Product>> findByCategoryIdIn(List<Integer> categories);

    DataResult<List<Product>> findByProductNameContains(String productName);
}