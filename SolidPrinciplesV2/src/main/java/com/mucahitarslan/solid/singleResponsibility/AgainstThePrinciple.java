package com.mucahitarslan.solid.singleResponsibility;

public class AgainstThePrinciple {
    public class User {
        private Long id;
        private String name;
        private String street;
        private String city;
        private String username;

        //Getters, setters

        public void changeAddress(String street, String city) {
            //logic
        }

        public void login(String username) {
            //logic
        }

        public void logout(String username) {
            //logic
        }
    }
}