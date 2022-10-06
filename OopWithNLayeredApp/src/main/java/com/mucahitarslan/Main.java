package com.mucahitarslan;

import com.mucahitarslan.business.ProductManager;
import com.mucahitarslan.core.logging.DatabaseLogger;
import com.mucahitarslan.core.logging.FileLogger;
import com.mucahitarslan.core.logging.ILogger;
import com.mucahitarslan.core.logging.MailLogger;
import com.mucahitarslan.dataAccess.HibernateProductDao;
import com.mucahitarslan.entities.Product;


public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1, "Iphone XR", 10000);
        ILogger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers );
        productManager.add(product1);
    }
}