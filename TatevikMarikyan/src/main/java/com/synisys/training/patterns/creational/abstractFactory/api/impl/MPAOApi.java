package com.synisys.training.patterns.creational.abstractFactory.api.impl;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAORequest;
import com.synisys.training.patterns.creational.abstractFactory.domain.MPAOResponse;
import com.synisys.training.patterns.creational.abstractFactory.domain.Request;
import com.synisys.training.patterns.creational.abstractFactory.domain.UrlSettings;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public abstract class MPAOApi<T extends MPAORequest, M extends MPAOResponse> implements API<T, M> {

    protected UrlSettings urlSettings;

    protected void initUrlSettings(){
        this.urlSettings =  new UrlSettings();
    }

}
