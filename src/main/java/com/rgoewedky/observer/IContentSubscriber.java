package com.rgoewedky.observer;

/**
 * ContentSubscriber Interface
 */
public interface IContentSubscriber {
    /**
     * Method to subscribe
     * @param iContentPublisher publisher to subscribe
     */
    void subscribe(IContentPublisher iContentPublisher);

    /**
     * Method to unsubscribe
     * @param iContentPublisher publisher to unsubscribe
     */
    void unsubscribe(IContentPublisher iContentPublisher);
}
