import java.util.HashMap;
import java.util.Map;

public class KnowledgeBase {

    private final Map<String, String> responses;

    public KnowledgeBase() {
        responses = new HashMap<>();

        responses.put("hello", "Hello! How can I help you?");
        responses.put("hi", "Hi! Nice to meet you.");
        responses.put("how are you", "I'm doing great! Thanks for asking.");
        responses.put("what is java",
                "Java is a popular object-oriented programming language.");
        responses.put("what is nlp",
                "NLP stands for Natural Language Processing. It helps computers understand human language.");
        responses.put("what is ai",
                "AI stands for Artificial Intelligence. It enables computers to perform tasks that normally require human intelligence.");
        responses.put("what can you do",
                "I can answer frequently asked questions and have a simple conversation with you.");
        responses.put("thank you", "You're welcome! Have a great day.");
        responses.put("bye", "Goodbye! It was nice talking to you.");
     responses.put("what is python",
        "Python is a high-level programming language known for its simple and readable syntax."); 
        responses.put("what is c",
        "C is a general-purpose programming language widely used for system and application programming."); 
      responses.put("what is machine learning",
        "Machine Learning is a branch of AI that allows computers to learn patterns from data.");
      responses.put("what is chatbot",
        "A chatbot is a software application that communicates with users through text or voice."); 
        responses.put("what is gui",
        "GUI stands for Graphical User Interface. It allows users to interact with software using visual elements."); 
        responses.put("what is swing",
                "Swing is a Java GUI toolkit used to create desktop applications.");

        // Chatbot information
        responses.put("what can you do",
                "I can answer frequently asked questions and have a simple conversation with you.");

        responses.put("who are you",
                "I am a Java-based AI chatbot created using NLP and rule-based logic.");

        responses.put("your name",
                "I am your AI Chatbot.");

        responses.put("help",
                "You can ask me about Java, Python, AI, NLP, Machine Learning, Chatbots, GUI, or Java Swing.");

        // Closing conversation
        responses.put("thank you",
                "You're welcome! Have a great day.");

        responses.put("bye",
                "Goodbye! It was nice talking to you.");  
    }

    public Map<String, String> getResponses() {
        return responses;
    }
}