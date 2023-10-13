package exercise.unit_3;

import java.util.Scanner;

import exercise.unit_3.Exercise3.MessageText;
import exercise.unit_3.Exercise4.Message;

public class Exercise5 {

    private Exercise5() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Sender's Phone Number: ");
        String senderPhoneNumber = scanner.nextLine();

        System.out.print("Input Abbreviated Message and Original Message: ");
        String[] inputs = scanner.nextLine().split(" ");
        String abbreviated = inputs[0];
        String originalString = inputs[1];
        MessageText messageText = new MessageText(abbreviated, originalString);

        System.out.print("Input Receiver's Phone Number: ");
        String receiverPhoneNumber = scanner.nextLine();

        Message message = new Message(senderPhoneNumber, messageText, receiverPhoneNumber);
        message.printMessage();

        scanner.close();
    }
}
