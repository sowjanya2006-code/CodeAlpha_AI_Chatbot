import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class ChatbotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;
    private JButton clearButton;

    private Chatbot chatbot;

    public ChatbotGUI() {

        chatbot = new Chatbot();

        // Window settings
        setTitle("CodeAlpha - AI Chatbot");
        setSize(650, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        );

        // Header
        JLabel titleLabel = new JLabel("AI Chatbot");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel subtitleLabel = new JLabel(
                "CodeAlpha Internship - Task 3"
        );
        subtitleLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        subtitleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel headerPanel = new JPanel(new GridLayout(2, 1));
        headerPanel.add(titleLabel);
        headerPanel.add(subtitleLabel);

        // Chat area
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setLineWrap(true);
        chatArea.setWrapStyleWord(true);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        // Input field
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));

        // Send button
        sendButton = new JButton("Send");
        sendButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Clear button
        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 14));

        // Button panel
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 5, 0));
        buttonPanel.add(sendButton);
        buttonPanel.add(clearButton);

        // Bottom panel
        JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(buttonPanel, BorderLayout.EAST);

        // Add components
        mainPanel.add(headerPanel, BorderLayout.NORTH);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        add(mainPanel);

        // Welcome message
        chatArea.append(
                "Bot: Hello! Welcome to the CodeAlpha AI Chatbot.\n"
        );

        chatArea.append(
                "Bot: Ask me about Java, Python, AI, NLP, Machine Learning, GUI, or Swing.\n\n"
        );

        // Send button action
        sendButton.addActionListener(this::sendMessage);

        // Enter key action
        inputField.addActionListener(this::sendMessage);

        // Clear button action
        clearButton.addActionListener(e -> {
            chatArea.setText("");
            chatArea.append(
                    "Bot: Chat cleared. How can I help you?\n\n"
            );
        });

        // Automatically focus input field
        SwingUtilities.invokeLater(() -> inputField.requestFocusInWindow());
    }

    private void sendMessage(ActionEvent event) {

        String userInput = inputField.getText().trim();

        if (userInput.isEmpty()) {
            return;
        }

        // Display user message
        chatArea.append("You: " + userInput + "\n");

        // Get chatbot response
        String response = chatbot.getResponse(userInput);

        // Display bot response
        chatArea.append("Bot: " + response + "\n\n");

        // Clear input field
        inputField.setText("");

        // Keep input field focused
        inputField.requestFocusInWindow();

        // Scroll to bottom
        chatArea.setCaretPosition(
                chatArea.getDocument().getLength()
        );
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {

            ChatbotGUI chatbotGUI = new ChatbotGUI();

            chatbotGUI.setVisible(true);
        });
    }
}