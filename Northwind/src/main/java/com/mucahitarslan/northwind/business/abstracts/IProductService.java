package com.mucahitarslan.northwind.business.abstracts;

import com.mucahitarslan.northwind.entities.concretes.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
}
