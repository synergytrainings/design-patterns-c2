package com.synisys.training.patterns.creational.abstractFactory.api.impl.post;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.domain.Request;
import com.synisys.training.patterns.creational.abstractFactory.domain.Response;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public interface APIPost<T extends Request, M extends Response> extends API<T, M> {

    String createConnectionWithPost(T request);

    String getUrl();
}
