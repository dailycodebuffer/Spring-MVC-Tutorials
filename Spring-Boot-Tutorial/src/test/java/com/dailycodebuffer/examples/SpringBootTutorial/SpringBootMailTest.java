package com.dailycodebuffer.examples.SpringBootTutorial;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Contains;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;
import org.subethamail.wiser.Wiser;
import org.subethamail.wiser.WiserMessage;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTutorialApplication.class)
public class SpringBootMailTest {

    @Autowired
    private JavaMailSender javaMailSender;

    private Wiser wiser;

    private String userTo = "usermail1@localhost";
    private String userFrom = "usermail2@localhost";
    private String subject = "Test subject text";
    private String textMail = "Text subject mail text";

    @Before
    public void setUp() throws Exception {
        final int TESTING_PORT = 25;
        wiser = new Wiser(TESTING_PORT);
        wiser.start();
    }

    @After
    public void breakDown() throws Exception {
        wiser.stop();
    }

    @Test
    public void forgivenMail_ifSendAndReceived_thenCorrect() throws Exception {
        SimpleMailMessage message = composeEmailMessage();
        javaMailSender.send(message);
        List<WiserMessage> messages = wiser.getMessages();


        WiserMessage wiserMessage = messages.get(0);
        Assert.assertEquals(userFrom, wiserMessage.getEnvelopeSender());
        Assert.assertEquals(userTo, wiserMessage.getEnvelopeReceiver());
        Assert.assertEquals(subject, getSubject(wiserMessage));
        Assert.assertEquals(textMail, getMessage(wiserMessage));
    }

    private String getMessage(WiserMessage wiserMessage)
            throws MessagingException, IOException {
        return wiserMessage.getMimeMessage().getContent().toString().trim();
    }

    private String getSubject(WiserMessage wiserMessage) throws MessagingException {
        return wiserMessage.getMimeMessage().getSubject();
    }

    private SimpleMailMessage composeEmailMessage() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(userTo);
        mailMessage.setReplyTo(userFrom);
        mailMessage.setFrom(userFrom);
        mailMessage.setSubject(subject);
        mailMessage.setText(textMail);
        return mailMessage;
    }
}
