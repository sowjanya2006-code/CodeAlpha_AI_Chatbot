import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Chatbot chatbot = new Chatbot();

        System.out.println("=================================");
        System.out.println("       AI CHATBOT");
        System.out.println("=================================");
        System.out.println("Type 'bye' to exit.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String userInput = scanner.nextLine();

            String response = chatbot.getResponse(userInput);

            System.out.println("Bot: " + response);
            System.out.println();

            if (userInput.toLowerCase().contains("bye")) {
                break;
            }
        }

        scanner.close();
    }
}