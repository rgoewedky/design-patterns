package com.rgoewedky.observer;

/**
 * Concrete ContentSubscriber class
 */
public class ContentSubscriber implements IContentSubscriber {
    // instance variable to store subscriber name
    private final String subscriberName;

    public ContentSubscriber(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    /**
     * Method to update subscriber when new content is published by publisher
     *
     * @param publisherName name of publisher who published
     * @param newContent    content publisher published
     */
    public void update(String publisherName, String newContent) {
        System.out.println(EventEnum.NOTIFIED + " | " + "Hey, [" + this.subscriberName + "]! [" + publisherName + "] just published fresh content :- [" + newContent + "]");
    }

    /**
     * Getter Method to return subscriber name
     *
     * @return subscriber name
     */
    public String getName() {
        return this.subscriberName;
    }

    @Override
    public void subscribe(IContentPublisher iContentPublisher) {
        ContentPublisher contentPublisher = (ContentPublisher) iContentPublisher;
        // TODO: Subscribe to publisher
    }

    @Override
    public void unsubscribe(IContentPublisher iContentPublisher) {
        ContentPublisher contentPublisher = (ContentPublisher) iContentPublisher;
        // TODO: Unsubscribe to publisher
    }
}
