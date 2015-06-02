package com.synisys.training.patterns.creational.abstractFactory.api.impl;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.domain.*;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public abstract class DNRAPI <T extends DNRRequest, M extends DNRResponse> implements API<T, M> {

    protected UrlSettings urlSettings;

    protected void initUrlSettings(){
        this.urlSettings =  new UrlSettings();
    }

}
