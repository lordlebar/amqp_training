package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Launcher.class);
        try {
            var rabbitTemplate = context.getBean(RabbitTemplate.class);
            rabbitTemplate.convertAndSend("", "chat_messages", "toto");
        } finally {
            context.close();
        }
    }
}
