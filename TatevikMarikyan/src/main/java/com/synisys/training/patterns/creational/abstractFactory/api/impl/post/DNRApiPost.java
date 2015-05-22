package com.synisys.training.patterns.creational.abstractFactory.api.impl.post;

import com.synisys.training.patterns.creational.abstractFactory.api.impl.DNRAPI;
import com.synisys.training.patterns.creational.abstractFactory.domain.*;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class DNRApiPost extends DNRAPI<DNRRequest, DNRResponse> implements APIPost<DNRRequest, DNRResponse> {

    @Override
    public DNRRequest createRequest() {
        return null;
    }

    @Override
    public String getUrl() {
        return null;
    }

    @Override
    public DNRResponse createResponse(String request) {
        return null;
    }

    @Override
    public String createConnectionWithPost(DNRRequest request) {
        return null;
    }
}
