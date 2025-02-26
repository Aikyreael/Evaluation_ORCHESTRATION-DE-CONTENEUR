package school.exercice.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.exercice.backend.entities.Message;
import school.exercice.backend.repositories.MessageRepository;

import java.util.Collection;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(Message message) {
        return messageRepository.save(message);
    }

    public Collection<Message> getAllMessages() {
        return messageRepository.findAll();
    }
}
