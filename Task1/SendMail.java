package Task1;

import javax.jms.Session;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

public class SendMail {
    public static void main(String[] args) throws MessagingException, IOException {
        final Properties properties = new Properties();
        properties.load(SendMail.class.getClassLoader().getResourceAsStream("mail.properties"));

        Session mailSession = Session.getDefaultInstance(properties);
        MimeMessage message = new MimeMessage((MimeMessage) mailSession);
        message.setFrom(new InternetAddress(" "));
        message.addRecipients(Message.RecipientType.TO, String.valueOf(new InternetAddress(" ")));
        message.setSubject("hello");
        message.setText("mailBody");

        Transport tr = mailSession.getTransport();
        tr.connect(null, String.valueOf(123));
        tr.sendMessage(message, message.getAllRecipients());
        tr.close();
    }
}
    
        
