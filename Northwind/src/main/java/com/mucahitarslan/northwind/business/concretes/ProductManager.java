package com.mucahitarslan.northwind.business.concretes;

import com.mucahitarslan.northwind.business.abstracts.IProductService;
import com.mucahitarslan.northwind.core.utilities.results.DataResult;
import com.mucahitarslan.northwind.core.utilities.results.Result;
import com.mucahitarslan.northwind.core.utilities.results.SuccessDataResult;
import com.mucahitarslan.northwind.core.utilities.results.SuccessResult;
import com.mucahitarslan.northwind.dataAccess.abstracts.IProductDao;
import com.mucahitarslan.northwind.entities.concretes.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo,pageSize);
        return new SuccessDataResult<List<Product>>(productDao.findAll(pageable).getContent());
    }

    @Override
    public DataResult<List<Product>> getAllSorted() {
        Sort sort = Sort.by(Sort.Direction.DESC,"id");
        return new SuccessDataResult<List<Product>>(productDao.findAll(sort));
    }

    @Override
    public Result add(Product product) {
        productDao.save(product);
        return new SuccessResult("Ürün eklendi");
    }

    @Override
    public DataResult<Product> findByProductName(String productName) {
        return new  SuccessDataResult<Product>(productDao.findByProductName(productName),"Data listelendi");
    }

    @Override
    public DataResult<Product> findByProductNameAndCategoryCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<Product>(productDao.findByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> findByProductNameOrCategoryId(String productName, int categoryId) {
        return new SuccessDataResult<List<Product>>(productDao.findByProductNameOrCategoryCategoryId(productName,categoryId),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> findByCategoryIdIn(List<Integer> categories) {
        return new SuccessDataResult<List<Product>>(productDao.findByCategoryCategoryIdIn(categories),"Data listelendi");
    }

    @Override
    public DataResult<List<Product>> findByProductNameContains(String productName) {
        return new SuccessDataResult<List<Product>>(productDao.findByProductNameContains(productName),"Data listelendi");
    }
}
