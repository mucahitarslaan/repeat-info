package com.mucahitarslan.solid.dependencyInversion;

public class AgainstThePrinciple {
    public class Email {

        public void sendEmail() {
            //Send e-mail
        }
    }

    public class SMS {
        public void sendSMS() {
            //Send sms
        }
    }

    public class Notification {

        private Email email = new Email();
        private SMS sms = new SMS();

        public void sender() {

            email.sendEmail();
            sms.sendSMS();
        }
    }
}
