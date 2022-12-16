package com.mucahitarslan.northwind.dataAccess.abstracts;

import com.mucahitarslan.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IProductDao extends JpaRepository<Product,Integer> {
}
