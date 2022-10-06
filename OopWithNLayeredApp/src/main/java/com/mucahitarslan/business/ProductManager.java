package com.mucahitarslan.business;

import com.mucahitarslan.core.logging.ILogger;
import com.mucahitarslan.dataAccess.IProductDao;
import com.mucahitarslan.entities.Product;

import java.util.List;

public class ProductManager {
    private final IProductDao productDao;
    private final ILogger[] loggers;

    public ProductManager(IProductDao productDao,ILogger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception
    {
        if (product.getUnitPrice()<10)
        {
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz");
        }
        productDao.add(product);

        for (ILogger logger : loggers)
        {
            logger.log(product.getName());
        }
    }


}
