package com.rgoewedky.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete ContentPublisher class
 */
public class ContentPublisher implements IContentPublisher {
    // instance variable to store publisher name
    private final String publisherName;

    // set to store subscribers
    private final List<IContentSubscriber> subscribers = new ArrayList<>();

    public ContentPublisher(String publisherName) {
        this.publisherName = publisherName;
    }


    /**
     * Method to add subscriber to subscription list
     *
     * @param iContentSubscriber subscriber to add
     */
    public void addSubscriber(IContentSubscriber iContentSubscriber) {
        ContentSubscriber contentSubscriber = (ContentSubscriber) iContentSubscriber;
        // TODO: Add subscriber if not added, else only log see below
        // System.out.println(Event.SUBSCRIBED + " | [" + contentSubscriber.getName() + "] subscribed [" + this.getName() + "]");
        // System.out.println(Event.SUBSCRIBED + " | [" + contentSubscriber.getName() + "] already subscribed [" + this.getName() + "]");
    }

    /**
     * Method to remove subscriber from subscriber list
     *
     * @param iContentSubscriber subscriber to remove
     */
    public void removeSubscriber(IContentSubscriber iContentSubscriber) {
        ContentSubscriber contentSubscriber = (ContentSubscriber) iContentSubscriber;
        // TODO: Remove Subscriber
        // System.out.println(Event.UNSUBSCRIBED + " | [" + contentSubscriber.getName() + "] unsubscribed [" + this.getName() + "]");
    }

    @Override
    public void publish(String content) {
        // System.out.println(Event.PUBLISHED + " | [" + this.publisherName + "] published [" + content + "]");
        // TODO: Notify all subscribers about fresh content
    }

    /**
     * Getter Method to return publisher name
     *
     * @return publisher name
     */
    public String getName() {
        return this.publisherName;
    }
}
