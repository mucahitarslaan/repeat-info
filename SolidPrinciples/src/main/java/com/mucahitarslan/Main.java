package com.mucahitarslan;

import java.lang.reflect.InvocationTargetException;

class Main {
    public static void main(String[] args)
    {
        try {
            Class<?> cls = Singleton.class;

            for (int i = 0; i < 10; ++i) {
                var ctor = cls.getDeclaredConstructor();

                var createdField = cls.getDeclaredField("ms_created");

                createdField.setAccessible(true);
                createdField.setBoolean(null, false);
                createdField.setAccessible(false);

                ctor.setAccessible(true);
                var obj = ctor.newInstance();
                ctor.setAccessible(false);

                //...
            }
        }
        catch (NoSuchMethodException | InvocationTargetException | InstantiationException
               | IllegalAccessException | NoSuchFieldException e) {
            var cause = e.getCause();

            System.out.println(cause == null ? e.getMessage() : cause.getMessage());
        }

    }
}

class Singleton {
    private static boolean ms_created;
    public static final Singleton INSTANCE = new Singleton();
    private int m_x;

    private Singleton()
    {
        if (ms_created)
            throw new UnsupportedOperationException("Object can not created by this way");

        ms_created = true;
        System.out.println("Singleton.Singleton()");
    }

    public int getX() {
        return m_x;
    }
    public static int getX(int i){
        return 1;
    }

    public void setX(int x)
    {
        //...
        m_x = x;
    }

}

/*var timer = new Timer();

        timer.schedule(new TimerTask() {
            public void run()
            {
                System.out.println(".");
            }
        }, 0, 1000);
        //Console.writeLine("main ends");

        //.
*/