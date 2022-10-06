package com.mucahitarslan;

public abstract class AbstractDatabase {
    public void add()
    {
        System.out.println("Veritabanına eklendi");
    }
    public void delete()
    {
        System.out.println("Veritabanından silindi");
    }

    abstract void update();
    abstract void get();
}
