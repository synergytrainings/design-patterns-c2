package com.synisys.training.patterns.creational.abstractFactory.api.impl.post;

import com.synisys.training.patterns.creational.abstractFactory.domain.Request;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public interface APIConnectionPost<T extends Request> {

    String createConnectionWithPost(T request);
}
