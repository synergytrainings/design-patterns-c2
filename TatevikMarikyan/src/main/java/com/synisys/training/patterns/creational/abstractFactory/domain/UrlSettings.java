package com.synisys.training.patterns.creational.abstractFactory.domain;

/**
 * @author vahe.marikyan
 * @since 4/29/2015.
 */
public class UrlSettings {

    private String apiName;

    private String apiUrl;

    private String apiToken;

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getApiToken() {
        return apiToken;
    }

    public void setApiToken(String apiToken) {
        this.apiToken = apiToken;
    }
}
