package exercise.unit_3;

public class Exercise3 {

    private Exercise3() {

    }

    public static void main(String[] args) {
        MessageText messageText = new MessageText("ILY", "I Love You");
        System.out.println(messageText instanceof MessageText);
    }

    public static class MessageText {
        private String abbreviated;
        private String extended;

        public MessageText(String abbreviated, String extended) {
            this.abbreviated = abbreviated;
            this.extended = extended;
        }

        public String getAbbreviated() {
            return abbreviated;
        }

        public String getExtended() {
            return extended;
        }

    }
}
