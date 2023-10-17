package exercise.unit_6;

import exercise.unit_3.Exercise3.MessageText;
import exercise.unit_3.Exercise4.Message;

public class Exercise15 {

    private Exercise15() {

    }

    public static void main(String[] args) {
        String sender = "010-0000-0000";
        String receiver = "010-9999-9999";
        NewMessage message = new NewMessage(sender, new MessageText("ILY", " I Love  You "), receiver);

        message.trimAndRemoveAllVowels();
        System.out.println(message.getMessageText().getExtended());
    }

}

class NewMessage extends Message {

    public NewMessage(String from, MessageText messageText, String to) {
        super(from, messageText, to);
    }

    public NewMessage(String from, MessageText messageText) {
        super(from, messageText);
    }

    public void trim() {
        String target = getMessageText().getExtended();
        StringBuilder builder = new StringBuilder();

        char[] array = target.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {

                if (i == 0 || i == (array.length - 1)
                        || (i > 0 && array[i - 1] == array[i])) {
                    continue;
                }
                builder.append(array[i]);

            } else {
                builder.append(array[i]);
            }
        }

        this.getMessageText().setExtended(builder.toString());
    }

    public void removeAllVowels() {
        String target = getMessageText().getExtended();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < target.length(); i++) {
            if (!isVowel(target.charAt(i))) {
                builder.append(target.charAt(i));
            }
        }

        getMessageText().setExtended(builder.toString());
    }

    private boolean isVowel(char ch) {

        if (!Character.isAlphabetic(ch)) {
            return false;
        }

        char[] vowels = { 'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' };
        for (int i = 0; i < vowels.length; i++) {
            if (ch == vowels[i]) {
                return true;
            }
        }

        return false;
    }

    public void trimAndRemoveAllVowels() {
        removeAllVowels();
        trim();
    }
}
