package com.mucahitarslan;

public class MongoDatabase extends AbstractDatabase{
    @Override
    void update() {
        System.out.println("Mongo veritabanına göre güncellendi");
    }

    @Override
    void get() {
        System.out.println("Mongo veritabanından getirildi");
    }

    @Override
    public void add() {
        System.out.println("Mongo veritabanına göre eklendi ! ");
    }
}
