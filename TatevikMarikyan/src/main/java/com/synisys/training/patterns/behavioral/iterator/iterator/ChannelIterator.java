package com.synisys.training.patterns.behavioral.iterator.iterator;

import com.synisys.training.patterns.behavioral.iterator.domain.Channel;

/**
 * Created by Tatevik
 * since  28-Feb-16.
 */
public interface ChannelIterator {

    public boolean hasNext();

    public Channel next();
}
