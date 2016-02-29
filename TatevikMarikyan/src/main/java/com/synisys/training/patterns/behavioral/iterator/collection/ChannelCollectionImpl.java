package com.synisys.training.patterns.behavioral.iterator.collection;

import com.synisys.training.patterns.behavioral.iterator.domain.Channel;
import com.synisys.training.patterns.behavioral.iterator.domain.ChannelTypeEnum;
import com.synisys.training.patterns.behavioral.iterator.iterator.ChannelIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tatevik
 * since  28-Feb-16.
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        this.channelsList = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }

    @Override
    public ChannelIterator getIterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, this.channelsList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        private ChannelTypeEnum type;
        private List<Channel> channels;
        private int position = 0;

        private ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()){
                Channel c = channels.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelTypeEnum.ALL)){
                    return true;
                } else {
                    position++;
                }
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = this.channels.get(position);
            position++;
            return c;
        }
    }

}
