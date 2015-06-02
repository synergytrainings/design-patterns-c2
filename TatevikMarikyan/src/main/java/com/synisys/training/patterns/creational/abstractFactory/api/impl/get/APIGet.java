package com.synisys.training.patterns.creational.abstractFactory.api.impl.get;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.domain.Request;
import com.synisys.training.patterns.creational.abstractFactory.domain.Response;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public interface APIGet<T extends Request, M extends Response> extends API<T, M> {

    String createConnectionWithGet(String url);

    String getUrl(Request request);
}
