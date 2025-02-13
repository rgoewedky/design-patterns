package com.rgoewedky.observer;

/**
 * Events enum
 * Note: This enum is just used to log different type of events
 */
public enum EventEnum {
    PUBLISHED, // when publisher publish content
    NOTIFIED, // when notified to subscriber
    SUBSCRIBED, // when subscribed to publisher
    UNSUBSCRIBED // when unsubscribed from publisher
}
