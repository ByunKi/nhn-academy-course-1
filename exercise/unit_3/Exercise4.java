package exercise.unit_3;

import exercise.unit_3.Exercise3.MessageText;

public class Exercise4 {

    private Exercise4() {

    }

    public static void main(String[] args) {
        MessageText messageText = new MessageText("ILY", "I Love You");
        Message message = new Message("010-0000-0000", messageText, "010-9999-9999");

        System.out.println(message instanceof Message);
        System.out.println(messageText instanceof MessageText);
    }

    public static class Message {
        private String senderPhoneNumber;
        private String receiverPhoneNumber;
        private MessageText messageText;

        public Message(String from, MessageText messageText, String to) {
            this.senderPhoneNumber = from;
            this.receiverPhoneNumber = to;
            this.messageText = messageText;
        }

        public Message(String from, MessageText messageText) {
            this.senderPhoneNumber = from;
            this.messageText = messageText;
        }

        public Message(MessageText messageText) {
            this.messageText = messageText;
        }

        public String getSenderPhoneNumber() {
            return senderPhoneNumber;
        }

        public String getReceiverPhoneNumber() {
            return receiverPhoneNumber;
        }

        public MessageText getMessageText() {
            return messageText;
        }

        public void setSenderPhoneNumber(String senderPhoneNumber) {
            this.senderPhoneNumber = senderPhoneNumber;
        }

        public void setReceiverPhoneNumber(String receiverPhoneNumber) {
            this.receiverPhoneNumber = receiverPhoneNumber;
        }

        public void printMessage() {
            StringBuilder builder = new StringBuilder();
            builder.append(getSenderPhoneNumber());
            builder.append("  →  ");
            builder.append(getReceiverPhoneNumber()).append(" ");
            builder.append(getMessageText().getExtended()).append("\n");

            System.out.println(builder.toString());
        }

    }
}
