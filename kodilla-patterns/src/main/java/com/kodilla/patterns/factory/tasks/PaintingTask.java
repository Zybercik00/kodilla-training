package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private final String taskName;
    private final String color;
    private final String whatToPaint;
    private boolean execute;

    public PaintingTask(String taskName, String color, String whatToPaint, boolean execute) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
        this.execute = execute;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Job is done";
    }
    @Override
    public boolean isTaskExecuted() {
       return execute;
    }
}
