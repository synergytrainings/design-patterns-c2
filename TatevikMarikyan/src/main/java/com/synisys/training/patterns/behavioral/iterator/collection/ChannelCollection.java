package com.synisys.training.patterns.behavioral.iterator.collection;

import com.synisys.training.patterns.behavioral.iterator.domain.Channel;
import com.synisys.training.patterns.behavioral.iterator.domain.ChannelTypeEnum;
import com.synisys.training.patterns.behavioral.iterator.iterator.ChannelIterator;

/**
 * Created by Tatevik
 * since  28-Feb-16.
 */
public interface ChannelCollection {

    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator getIterator(ChannelTypeEnum type);
}
