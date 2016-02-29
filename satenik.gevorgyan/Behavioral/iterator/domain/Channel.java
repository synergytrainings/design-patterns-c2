package iterator.domain;

public class Channel implements Item{
    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type) {
        this.frequency = freq;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }


    @Override
    public void itemDetails() {
        System.out.println("Channel type: " + TYPE + ", frequency - " + frequency);
    }
}