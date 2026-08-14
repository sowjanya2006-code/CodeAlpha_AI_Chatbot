public class NLPProcessor {

    public String preprocess(String input) {

        // Convert text to lowercase
        input = input.toLowerCase();

        // Remove punctuation
        input = input.replaceAll("[^a-zA-Z0-9 ]", "");

        // Remove extra spaces
        input = input.trim().replaceAll("\\s+", " ");

        return input;
    }

    public String findIntent(String input) {

        // Greetings
        if (input.equals("hello")
                || input.equals("hi")
                || input.equals("hey")) {
            return "hello";
        }

        // General conversation
        if (input.contains("how are you")) {
            return "how are you";
        }

        // Programming languages
        if (input.contains("java")) {
            return "what is java";
        }

        if (input.contains("python")) {
            return "what is python";
        }

        if (input.equals("c")
                || input.contains("what is c")) {
            return "what is c";
        }

        // AI and NLP
        if (input.contains("machine learning")) {
            return "what is machine learning";
        }

        if (input.contains("nlp")
                || input.contains("natural language processing")) {
            return "what is nlp";
        }

        if (input.contains("artificial intelligence")
                || input.equals("ai")
                || input.contains("what is ai")) {
            return "what is ai";
        }

        // Chatbot
        if (input.contains("chatbot")) {
            return "what is chatbot";
        }

        // GUI and Swing
        if (input.contains("gui")
                || input.contains("graphical user interface")) {
            return "what is gui";
        }

        if (input.contains("swing")) {
            return "what is swing";
        }

        // Chatbot information
        if (input.contains("what can you do")) {
            return "what can you do";
        }

        if (input.contains("who are you")) {
            return "who are you";
        }

        if (input.contains("your name")) {
            return "your name";
        }

        if (input.equals("help")
                || input.contains("help me")) {
            return "help";
        }

        // Closing conversation
        if (input.contains("thank")) {
            return "thank you";
        }

        if (input.equals("bye")
                || input.contains("goodbye")) {
            return "bye";
        }

        // Unknown question
        return "unknown";
    }
}