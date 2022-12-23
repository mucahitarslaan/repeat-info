package com.mucahitarslan.northwind.business.abstracts;

import com.mucahitarslan.northwind.core.utilities.results.DataResult;
import com.mucahitarslan.northwind.core.utilities.results.Result;
import com.mucahitarslan.northwind.entities.concretes.Product;

import java.util.List;

public interface IProductService {
    DataResult<List<Product>> getAll();
    Result add(Product product);
}