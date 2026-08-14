import java.util.Map;

public class Chatbot {

    private NLPProcessor nlpProcessor;
    private final  Map<String, String> responses;

    public Chatbot() {

        // Create NLP processor
        nlpProcessor = new NLPProcessor();

        // Load knowledge base
        KnowledgeBase knowledgeBase = new KnowledgeBase();
        responses = knowledgeBase.getResponses();
    }

    public String getResponse(String userInput) {

        // Handle empty input
        if (userInput == null || userInput.trim().isEmpty()) {
            return "Please enter a message.";
        }

        // Preprocess user input
        String processedInput = nlpProcessor.preprocess(userInput);

        // Identify user's intent
        String intent = nlpProcessor.findIntent(processedInput);

        // Find response from knowledge base
        if (responses.containsKey(intent)) {
            return responses.get(intent);
        }

        // Default response
        return "Sorry, I don't understand that question. Please try asking about Java, Python, AI, NLP, Machine Learning, Chatbots, GUI, or Swing.";
    }
}