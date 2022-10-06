package com.mucahitarslan.dataAccess;

import com.mucahitarslan.entities.Product;

public class JdbcProductDao implements IProductDao{
    public void add(Product product)
    {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
