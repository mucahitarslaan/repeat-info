package com.mucahitarslan.dataAccess;

import com.mucahitarslan.entities.Product;

public class HibernateProductDao implements IProductDao{
    public void add(Product product)
    {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
