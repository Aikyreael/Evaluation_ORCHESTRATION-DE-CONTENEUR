package school.exercice.backend.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.exercice.backend.entities.Message;
import school.exercice.backend.services.MessageService;

import java.util.Collection;

@RestController()
public class MessageController {

    private static final Logger logger = LoggerFactory.getLogger(MessageController.class);

    private final MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @PostMapping("/messages")
    public Message saveMessage(@RequestBody Message message) {

        Message savedMessage = messageService.saveMessage(message);

        logger.info("Le message - ID: {}, Date: {}, Contenu: {} - à était sauvegardé",
                savedMessage.getId(),
                savedMessage.getDate(),
                savedMessage.getContent()
        );

        return savedMessage;
    }

    @GetMapping("/messages")
    public Collection<Message> getMessages() {
        return messageService.getAllMessages();
    }
}
