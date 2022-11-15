package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {

    private final String taskName;
    private final String where;
    private final String using;
    private boolean execute;

    public DrivingTask(String taskName, String where, String using, boolean execute) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.execute = execute;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "On destination";
    }
    @Override
    public boolean isTaskExecuted() {
        return execute;
    }
}
