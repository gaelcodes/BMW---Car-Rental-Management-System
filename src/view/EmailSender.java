package view;

import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailSender {

    // Use your actual email address
    private final String fromEmail = "kyriegael4@gmail.com"; 
    // Use the App Password you generated
    private final String password = "caanbovrdwqujokv"; // No spaces!

    public void sendEmail(String toEmail, String subject, String messageText) {
        // Gmail SMTP server settings
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");    
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Create the session with authentication
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                // Use your email and App Password
                return new PasswordAuthentication(fromEmail, password);
            }
        });

        try {
            // Create the email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(messageText);

            // Send the email
            Transport.send(message);

            System.out.println("Email sent successfully!");

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("Email sending failed!");
        }
    }
}
