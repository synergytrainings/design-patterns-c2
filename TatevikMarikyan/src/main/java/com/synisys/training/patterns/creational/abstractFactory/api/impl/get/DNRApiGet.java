package com.synisys.training.patterns.creational.abstractFactory.api.impl.get;

import com.synisys.training.patterns.creational.abstractFactory.api.impl.DNRAPI;
import com.synisys.training.patterns.creational.abstractFactory.domain.*;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class DNRApiGet extends DNRAPI<DNRRequest, DNRResponse> implements APIGet<DNRRequest, DNRResponse> {


    @Override
    public DNRRequest createRequest() {
        return null;
    }

    @Override
    public String getUrl(Request request) {
        return null;
    }

    @Override
    public DNRResponse createResponse(String request) {
        return null;
    }

    @Override
    public String createConnectionWithGet(String url) {
        return null;
    }
}
