package com.rgoewedky.observer;

import com.rgoewedky.behavioural.observer.ContentPublisher;
import com.rgoewedky.behavioural.observer.ContentSubscriber;
import com.rgoewedky.behavioural.observer.IContentPublisher;
import com.rgoewedky.behavioural.observer.IContentSubscriber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ObserverRunnerTest {

    // marvel studio and fox studio are content publisher
    private IContentPublisher marvelStudio, foxStudio;

    // alex and box is consumer of the app
    private IContentSubscriber alex, bob;

    @BeforeEach
    public void setUpSubscribers() {
        this.alex = new ContentSubscriber("Alex");
        this.bob = new ContentSubscriber("Bob");
    }

    @BeforeEach
    public void setUpPublishers() {
        this.marvelStudio = new ContentPublisher("Marvel Studio");
        this.foxStudio = new ContentPublisher("Fox Studio");
    }

    @Test
    public void shouldNotifySubscribersWhenNewContentReleased() {
//        alex.subscribe(marvelStudio);
//        marvelStudio.publish("Iron Man 1");
    }
}