import java.util.*;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/5/15 <br/>
 * <b>Time:</b> 3:45 AM <br/>
 * <b>Description:</b> Simple implementation of Adapter pattern.
 */
public class Main {
    public static void main(String[] args) {
        Comparator<Recipient> recipientComparator = new Comparator<Recipient>() {
            @Override
            public int compare(Recipient o1, Recipient o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };

        Set<Recipient> recipientSet = new TreeSet<>(recipientComparator);
        recipientSet.add(new Recipient("David", "david@mail.ru", 1));
        recipientSet.add(new Recipient("Tigran", "tigran@mail.ru", 1));
        recipientSet.add(new Recipient("Hayk", "hayk@mail.ru", 1));

        Map<String, Recipient> recipientMap = new HashMap<>();
        recipientMap.put("Hayarpi", new Recipient("Hayarpi", "hayarpi@mail.ru", 2));
        recipientMap.put("Anahit", new Recipient("Anahit", "anahit@mail.ru", 2));
        recipientMap.put("Lilit", new Recipient("Lilit", "lilit@mail.ru", 2));

        List<Recipient> recipientList = new ArrayList<>();
        recipientList.add(new Recipient("David", "david@mail.ru", 1));
        recipientList.add(new Recipient("Tigran", "tigran@mail.ru", 1));
        recipientList.add(new Recipient("Hayk", "hayk@mail.ru", 1));
        recipientList.add(new Recipient("Hayarpi", "hayarpi@mail.ru", 2));
        recipientList.add(new Recipient("Anahit", "anahit@mail.ru", 2));
        recipientList.add(new Recipient("Lilit", "lilit@mail.ru", 2));


        /* Send mail to boys */
        MailSender.sendMail(recipientSet, "Congratulations!", "We are happy to congratulate you with such amazing day, with 23 of February!");

        /* Send mail to girls */
        MailSender.sendMail(recipientMap, "Congratulations!", "We are happy to congratulate you with such amazing day, with 8 of March!");

        /* Send mail to all */
        MailSender.sendMail(recipientList, "Attention!", "All employees should be at medical center tomorrow 9am to pass annual examination.");
    }
}
