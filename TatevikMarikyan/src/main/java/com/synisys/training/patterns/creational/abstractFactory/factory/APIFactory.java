package com.synisys.training.patterns.creational.abstractFactory.factory;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.DNRAPI;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.MPAOApi;
import com.synisys.training.patterns.creational.abstractFactory.domain.DNRRequest;
import com.synisys.training.patterns.creational.abstractFactory.domain.DNRResponse;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAORequest;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAOResponse;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public interface APIFactory {

    DNRAPI createDNRApi();

    MPAOApi createMPAOApi();
}
