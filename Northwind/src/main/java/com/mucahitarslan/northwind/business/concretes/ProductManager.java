package com.mucahitarslan.northwind.business.concretes;

import com.mucahitarslan.northwind.business.abstracts.IProductService;
import com.mucahitarslan.northwind.dataAccess.abstracts.IProductDao;
import com.mucahitarslan.northwind.entities.concretes.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements IProductService {
    private final IProductDao productDao;

    public ProductManager(IProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return productDao.findAll();
    }
}
