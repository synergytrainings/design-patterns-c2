package domain;

/**
 * <b>Author:</b> David Shahbazyan <br/>
 * <b>Date:</b> 6/2/15 <br/>
 * <b>Time:</b> 7:37 AM <br/>
 */
public class MessageRange implements Cloneable {
    private Integer from;
    private Integer to;

    public MessageRange(Integer from, Integer to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public MessageRange clone() throws CloneNotSupportedException {
        return (MessageRange) super.clone();
    }

    public Integer getFrom() {
        return from;
    }
    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }
    public void setTo(Integer to) {
        this.to = to;
    }
}
