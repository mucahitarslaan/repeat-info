package com.mucahitarslan.solid.liskovSubstitution;

public class AgainstThePrinciple {
/*
    Kareyi de beklendiği yerde dikdörtgen olarak kullanılabilir hale getirmiş olduk. Ancak böyle yaparak
dikdörtgen davranışındaki beklentiyi bozuyoruz. Çünkü karenin sadece tek bir kenar bilgisi yeterlidir yada
uzunluk ve en bilgisi aynı olmak durumundadır.

    Matematiksel olarak karenin dikdörtgenden türediğini varsayabiliriz. Ama davranışsal olarak Kare Dikdörtgenin
yerine geçmez, bu hiyerarşi Liskov prensibini (LSP) ihlal eder.
    public class Square extends Rectangle {
        @Override
        public void setWidth(int width) {
            super.setWidth(width);
            super.setHeight(width);
        }
        @Override
        public void setHeight(int height) {
            super.setHeight(height);
            super.setWidth(height);
        }
    }

    @Test
    public void testRectangleArea() throws Exception {
        Rectangle rectangle = new Square();
        rectangle.setWidth(20);
        rectangle.setHeight(4);
        assertEquals(80, rectangle.area());
    }


 */
}
