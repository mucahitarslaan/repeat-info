package com.mucahitarslan.solid.singleResponsibility;

public class WithinThePrinciple {

    public class User {

        private Long id;
        private Address name;

        //Getter,setter
    }

    public class Address {

        private String street;
        private String city;
        private String country;
        //Getter,setter
    }

    /*  // Böyle bir class ile User'a bağlı kalmış oluyoruz. Bu nedenle prensibe uygun olmuyor.
        // Çünlü fonksiyon sadece adres değişikliği ile ilgileniyor.
    public class AddressService{
        public void changeAddress(User user) {
            //logic
        }
    }
     */

    public class AddressService{
        public void changeAddress(Address address) {
            // Sadece addressle ilgileniyorum ve ondan sorumluyum userdaki değişiklikler beni etkilemez.
            //logic
        }
    }

    public class LoginService{
        public void login(String username) {
            //log-in logic
        }

        public void logout(String username) {
            //log-out logic
        }
    }
}
