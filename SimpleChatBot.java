import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        // Array of random fallback responses
        String[] randomResponses = {
                "I'm not sure about that.",
                "Can you please rephrase?",
                "I don't understand, can you ask something else?",
                "Interesting, tell me more."
        };

        System.out.println("Chatbot: Hello! I am your friendly chatbot. How can I help you today?");

        while (true) {
            // Get input from the user
            System.out.print("You: ");
            userInput = scanner.nextLine().toLowerCase();  // Convert input to lowercase for easier matching

            // Check for exit condition
            if (userInput.contains("bye") || userInput.contains("exit")) {
                System.out.println("Chatbot: Goodbye! Have a great day!");
                break;
            }

            // Respond to specific keywords
            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hello! How can I assist you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("Chatbot: I'm just a program, but I'm doing well! Thanks for asking.");
            } else if (userInput.contains("time")) {
                System.out.println("Chatbot: I'm sorry, I can't tell the time. But it’s always a good time to learn!");
            } else if (userInput.contains("weather")) {
                System.out.println("Chatbot: I don’t have real-time data, but I hope it’s sunny where you are!");
            } else if (userInput.contains("name")) {
                System.out.println("Chatbot: I don't have a name, but you can call me Chatbot!");
            } else {
                // Fallback to a random response
                int randomIndex = (int) (Math.random() * randomResponses.length);
                System.out.println("Chatbot: " + randomResponses[randomIndex]);
            }
        }

        scanner.close();
    }
}
