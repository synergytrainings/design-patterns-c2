package com.synisys.training.patterns.creational.abstractFactory.api;

import com.synisys.training.patterns.creational.abstractFactory.domain.Request;
import com.synisys.training.patterns.creational.abstractFactory.domain.Response;
import com.synisys.training.patterns.creational.abstractFactory.domain.UrlSettings;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public interface API<T extends Request, M extends Response> {

    T createRequest();

    M createResponse(String result);
}
