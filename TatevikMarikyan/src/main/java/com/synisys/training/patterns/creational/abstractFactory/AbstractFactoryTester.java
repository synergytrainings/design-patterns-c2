package com.synisys.training.patterns.creational.abstractFactory;

import com.synisys.training.patterns.creational.abstractFactory.api.impl.MPAOApi;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.post.APIPost;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAORequest;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAOResponse;
import com.synisys.training.patterns.creational.abstractFactory.factory.impl.APIConnectionType;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public class AbstractFactoryTester {
    public static void main(String[] args) {

        MPAOApi<MPAORequest, MPAOResponse> mpaoApi = APIConnectionType.POST.createMPAOApi();

        MPAORequest request = mpaoApi.createRequest();

        String result = ((APIPost) mpaoApi).createConnectionWithPost(request);

        MPAOResponse response = mpaoApi.createResponse(result);

        response.printResponseDetails();
    }
}
