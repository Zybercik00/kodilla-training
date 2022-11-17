package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void paintingTask() {
        TaskFactory factory = new TaskFactory();
        Task paintingTask = factory.doSomething(TaskFactory.PAINTING);

        assertEquals(true, paintingTask.isTaskExecuted());
        assertEquals("Job is done", paintingTask.executeTask());
        assertEquals("Paint", paintingTask.getTaskName());
    }

    @Test
    void shoppingTask() {
        TaskFactory factory = new TaskFactory();
        Task shoppingTask = factory.doSomething(TaskFactory.SHOPPING);

        assertEquals(true, shoppingTask.isTaskExecuted());
        assertEquals("Shopping done", shoppingTask.executeTask());
        assertEquals("Go shopping", shoppingTask.getTaskName());
    }

    @Test
    void drivingTask() {
        TaskFactory factory = new TaskFactory();
        Task drivingTask = factory.doSomething(TaskFactory.DRIVING);

        assertEquals(true, drivingTask.isTaskExecuted());
        assertEquals("On destination", drivingTask.executeTask());
        assertEquals("Drive to shop", drivingTask.getTaskName());
    }
}
