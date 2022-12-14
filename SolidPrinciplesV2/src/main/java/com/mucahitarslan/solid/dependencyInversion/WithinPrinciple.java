package com.mucahitarslan.solid.dependencyInversion;


import java.util.List;

// Notification sınıfını sms ve email sınıfına bağımlılığını ortadan kaldırmak için bir soyutlama yapmalıyız.
// Bu çözümü uygulamak için Email ve Sms sınıflarınıda içeren bir interface yazarak başlayabiliriz.
public class WithinPrinciple {
    public interface Message {
        void sendMessage();
    }

    public class Email implements Message {

        @Override
        public void sendMessage() {
            sendEmail();
        }

        private void sendEmail() {
            //Send email
        }
    }

    public class SMS implements Message {

        @Override
        public void sendMessage() {
            sendSMS();
        }

        private void sendSMS() {
            //Send sms
        }
    }

    public class Notification {

        private List<Message> messages;

        public Notification(List<Message> messages) {
            this.messages = messages;
        }

        public void sender() {
            for (Message message : messages) {
                message.sendMessage();
            }
        }
    }
}
