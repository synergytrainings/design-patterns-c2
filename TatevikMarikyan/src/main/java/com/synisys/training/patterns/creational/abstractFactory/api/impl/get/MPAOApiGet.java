package com.synisys.training.patterns.creational.abstractFactory.api.impl.get;

import com.synisys.training.patterns.creational.abstractFactory.api.impl.MPAOApi;
import com.synisys.training.patterns.creational.abstractFactory.domain.*;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class MPAOApiGet extends MPAOApi<MPAORequest, MPAOResponse> implements APIGet<MPAORequest, MPAOResponse> {


    @Override
    public String createConnectionWithGet(String url) {
        return null;
    }

    @Override
    public String getUrl(Request request) {
        return null;
    }

    @Override
    public MPAORequest createRequest() {
        return null;
    }

    @Override
    public MPAOResponse createResponse(String result) {
        return null;
    }
}
