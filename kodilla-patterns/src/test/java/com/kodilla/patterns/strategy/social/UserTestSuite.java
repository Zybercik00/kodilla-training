package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        User john = new Millenials("John");
        User ben = new ZGeneration("Ben");
        User pit = new YGeneration("Pit");

        String johnUses = john.sharePost();
        String benUses = ben.sharePost();
        String pitUses = pit.sharePost();

        assertEquals("Facebook", johnUses);
        assertEquals("Snapchat", benUses);
        assertEquals("Twitter", pitUses);

    }

    @Test
    void testIndividualSharingStrategy() {

        User ben = new YGeneration("Ben");
        String benUses = ben.sharePost();
        ben.setSocialPublishing(new FacebookPublisher());
        benUses = ben.sharePost();

        assertEquals("Facebook", benUses);

    }
}
