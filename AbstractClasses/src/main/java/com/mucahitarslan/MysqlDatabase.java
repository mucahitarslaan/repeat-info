package com.mucahitarslan;

public class MysqlDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mysql veritabanına göre güncellendi");
    }

    @Override
    void get() {
        System.out.println("Mysql veritabanından getirildi");
    }
}
