package com.synisys.training.patterns.behavioral.observer;

/**
 * @author Tatevik.Marikyan
 * @since 15-Mar-16.
 */
public class Main {

    public static void main(String... args){
        Site site = new Site();
        Subscriber user1 = new Subscriber("Alis", "Johnson");
        Subscriber user2 = new Subscriber("Mary", "Watson");
        Subscriber user3 = new Subscriber("George", "Brown");
        Subscriber user4 = new Subscriber("Hue", "Jackson");

        String topic1 = "topic1";
        String topic2 = "topic2";
        String topic3 = "topic3";

        site.subscribe(user1, topic1);
        site.subscribe(user1, topic2);
        site.subscribe(user2, topic2);
        site.subscribe(user3, topic3);

        site.addArticleToTopic("article1", topic1);
        site.addArticleToTopic("article1", topic2);
        site.addArticleToTopic("article1", topic3);

        System.out.println(user1.printArticles());
        System.out.println(user2.printArticles());
        System.out.println(user3.printArticles());
        System.out.println(user4.printArticles());
    }
}
