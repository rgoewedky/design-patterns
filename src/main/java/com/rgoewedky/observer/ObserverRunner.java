package com.rgoewedky.observer;

public class ObserverRunner {

    public ObserverRunner() {
        System.out.println("=======================");
        System.out.println("Pattern: OBSERVER");
        System.out.println("=======================");
    }


    public void run() {
        /*
        // marvel studio content publisher
        IContentPublisher marvelContentPublisher = new ContentPublisher("Marvel Studio");
        // fox studio content publisher
        IContentPublisher foxContentPublisher = new ContentPublisher("Fox Studio");

        // subscriberAlex is consumer of the app
        IContentSubscriber subscriberAlex = new ContentSubscriber("Alex");
        // subscriberBob is consumer of the app
        IContentSubscriber subscriberBob = new ContentSubscriber("Bob");

        // subscriberAlex subscribe to marvel studio
        subscriberAlex.subscribe(marvelContentPublisher);

        // marvel studio publish content
        marvelContentPublisher.publish("Captain America: The First Avenger");

        // subscriberBob subscribe to marvel studio
        subscriberBob.subscribe(marvelContentPublisher);

        // marvel studio publish content
        marvelContentPublisher.publish("Iron Man");

        // subscriberAlex unsubscribe to marvel studio
        subscriberAlex.unsubscribe(marvelContentPublisher);

        // subscriberAlex subscribe to fox studio
        subscriberAlex.subscribe(foxContentPublisher);

        // marvel studio publish content
        marvelContentPublisher.publish("Thor");

        // fox studio publish content
        foxContentPublisher.publish("X-Men");
        */
    }
}
