import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/5/15 <br/>
 * <b>Time:</b> 3:46 AM <br/>
 */
public final class MailSender {
    private MailSender() {}

    public static void sendMail(Set<Recipient> recipients, String messageSubject, String messageText) {
        sendMail(ListAdapter.SetToList(recipients), messageSubject, messageText);
    }

    public static void sendMail(Map<?, Recipient> recipients, String messageSubject, String messageText) {
        sendMail(ListAdapter.MapToList(recipients), messageSubject, messageText);
    }

    public static void sendMail(List<Recipient> recipients, String messageSubject, String messageText) {
        for (Recipient recipient : recipients) {
            /* Below should be real mail sender implementation. */
            System.out.println("===========================================");
            System.out.println("Recipient: " + recipient.getName());
            System.out.println("Subject: " + messageSubject);
            System.out.println("Message: " + messageText);
            System.out.println("===========================================");
        }
    }
}
