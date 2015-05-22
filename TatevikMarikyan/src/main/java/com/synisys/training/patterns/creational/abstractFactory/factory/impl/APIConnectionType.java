package com.synisys.training.patterns.creational.abstractFactory.factory.impl;

import com.synisys.training.patterns.creational.abstractFactory.api.API;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.DNRAPI;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.MPAOApi;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.get.DNRApiGet;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.get.MPAOApiGet;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.post.DNRApiPost;
import com.synisys.training.patterns.creational.abstractFactory.api.impl.post.MPAOApiPost;
import com.synisys.training.patterns.creational.abstractFactory.factory.APIFactory;

/**
 * @author Tatevik.Marikyan
 * @since 14-May-15.
 */
public enum APIConnectionType implements APIFactory {
    GET {
        @Override
        public DNRAPI createDNRApi() {
            return new DNRApiGet();
        }

        @Override
        public MPAOApi createMPAOApi() {
            return new MPAOApiGet();
        }
    },
    POST {
        @Override
        public MPAOApi createMPAOApi() {
            return new MPAOApiPost();
        }

        @Override
        public DNRAPI createDNRApi() {
            return new DNRApiPost();
        }
    };


}
