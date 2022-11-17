package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean execute;

    public ShoppingTask(String taskName, String whatToBuy, double quantity, boolean execute) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.execute = execute;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    public String executeTask() {
           return  "Shopping done";
    }
    @Override
    public boolean isTaskExecuted() {
        return execute;
    }

}

