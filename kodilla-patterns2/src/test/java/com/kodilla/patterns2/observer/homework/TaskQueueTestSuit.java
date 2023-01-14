package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskQueueTestSuit {

    @Test
    public void testUpdate() {
        TaskQueue firstQueue = new TaskQueue("first tasks");
        TaskQueue secondQueue = new TaskQueue("second tasks");
        TaskQueue thirdQueue = new TaskQueue("third tasks");
        Mentor john = new Mentor("John");
        Mentor jack = new Mentor("Jack");
        firstQueue.registerObserver(john);
        secondQueue.registerObserver(jack);
        thirdQueue.registerObserver(jack);

        firstQueue.addTask("task1, task2");
        secondQueue.addTask("task3, task4");
        thirdQueue.addTask("task5, task6");

        assertEquals(1, john.getUpdateCount());
        assertEquals(2, jack.getUpdateCount());
    }
}
