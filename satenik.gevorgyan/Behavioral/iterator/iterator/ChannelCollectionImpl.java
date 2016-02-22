package iterator.iterator;

import iterator.domain.Channel;
import iterator.domain.ChannelTypeEnum;

import java.util.ArrayList;
import java.util.List;


public class ChannelCollectionImpl implements ItemCollection<Channel,ChannelTypeEnum> {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void add(Channel c) {
        this.channelsList.add(c);
    }

    public void remove(Channel c) {
        this.channelsList.remove(c);
    }


    public ItemIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    private class ChannelIteratorImpl implements ItemIterator {
        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum ty, List<Channel> channelsList) {
            this.type = ty;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            System.out.println("ON next shift to next channel.");
            return c;
        }
    }
}
