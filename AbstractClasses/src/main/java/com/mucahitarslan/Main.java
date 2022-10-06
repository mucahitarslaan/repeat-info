package com.mucahitarslan;


public class Main {
    public static void main(String[] args) {
        AbstractDatabase database1 = new MongoDatabase();
        AbstractDatabase database2 = new MysqlDatabase();

        database1.add();
        database1.delete();
        database1.get();
        database1.update();

        database2.add();
        database2.delete();
        database2.get();
        database2.update();

    }
}