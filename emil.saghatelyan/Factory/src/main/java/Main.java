
import com.synisys.ns.Notification;
import com.synisys.ns.SenderFactory;
import com.synisys.ns.TransferType;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Notification notification =new Notification();

        SenderFactory senderFactory = new SenderFactory();
        senderFactory.getSender(TransferType.EMAIL).send(notification);



    }
}
