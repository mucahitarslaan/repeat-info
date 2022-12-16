package com.mucahitarslan.northwind.business.concretes;

import com.mucahitarslan.northwind.business.abstracts.IProductService;
import com.mucahitarslan.northwind.core.utilities.results.DataResult;
import com.mucahitarslan.northwind.core.utilities.results.Result;
import com.mucahitarslan.northwind.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.northwind.core.utilities.results.SuccessResult;
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
    public DataResult<List<Product>> getAll() {
        return new SuccessDataResult<List<Product>>(productDao.findAll(),"Data listelendi");
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }
}
