package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void log() {
        logger = Logger.INSTANCE;
        logger.log("it doesn't work just like that, it flies");
    }
    @Test
    public void getLastLog() {
       String result = logger.getLastLog();

        assertEquals("it doesn't work just like that, it flies", result);
    }

}
