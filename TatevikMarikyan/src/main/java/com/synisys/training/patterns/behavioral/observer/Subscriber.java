package com.synisys.training.patterns.behavioral.observer;

import java.util.*;

/**
 * @author Tatevik.Marikyan
 * @since 15-Mar-16.
 */
public class Subscriber {
    private String firstName;
    private String lastName;

    private Map<String, List<String>> articles;

    public Subscriber(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        articles = new HashMap<>();
    }

    public void update(Site site, String topic){
        articles.put(topic, site.getTopicArticles(topic));
    }

    //for test!
    public String printArticles(){
        StringBuilder sb = new StringBuilder("");
        if(articles == null){
            return "No article";
        }
        sb.append(this.firstName).append(" ").append(this.lastName).append(": ");
        for(String topic : articles.keySet()){
            sb.append(topic + ": ");
            if(articles.get(topic) != null){
                for(String article : articles.get(topic)){
                    sb.append(article + ", ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
