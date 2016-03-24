package com.synisys.training.patterns.behavioral.observer;

import java.util.*;

/**
 * @author Tatevik.Marikyan
 * @since 15-Mar-16.
 */
public class Site extends Observable {

    private static Map<String, List<String>> articlesByTopicMap = new HashMap<>();

    /**
     * subscribers by topic
     */
    private Map<String, List<Subscriber>> observers = new HashMap<>();

    public void subscribe(Subscriber subscriber, String topic){
        if(observers.get(topic)==null){
            observers.put(topic, new ArrayList<Subscriber>());
        }
        observers.get(topic).add(subscriber);
    }

    private void notify(String topic){
        if(observers.get(topic)!=null){
            for(Subscriber subscriber : observers.get(topic)){
                subscriber.update(this, topic);
            }
        }
    }

    public List<String> getTopicArticles(String topic){
        return this.articlesByTopicMap.get(topic);
    }

    public void addArticleToTopic(String article, String topic){
        if(articlesByTopicMap.get(topic) == null){
            articlesByTopicMap.put(topic, new ArrayList<String>());
        }
        articlesByTopicMap.get(topic).add(article);
        notify(topic);
    }
}
