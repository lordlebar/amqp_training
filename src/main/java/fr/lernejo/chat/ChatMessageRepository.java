package fr.lernejo.chat;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatMessageRepository {

    private final List<String> messages;

    public ChatMessageRepository() {
        messages = new ArrayList<>();
    }

    public void addChatMessage(String message) {
        messages.add(message);
    }

    public List<String> getLastTenMessages() {
        return messages.subList(0, Math.min(messages.size(), 10));
    }
}
