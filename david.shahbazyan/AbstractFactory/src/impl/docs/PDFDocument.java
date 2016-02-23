package impl.docs;

import abstractions.AbstractDoc;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 2/24/16 <br/>
 * <b>Time:</b> 3:19 AM <br/>
 */
public class PDFDocument extends AbstractDoc {
    @Override
    public String getContent() {
        return "Content of *.PDF document...";
    }
}
