package net.engineeringdigest.journalApp.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import net.engineeringdigest.journalApp.service.EmailService;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

     @Test
    void testSendMail() {
        emailService.sendEmail("sadhnamall1010@gmail.com",
                "Testing Java mail sender",
                "Hi, aap kaise hain ?");
    }
}
