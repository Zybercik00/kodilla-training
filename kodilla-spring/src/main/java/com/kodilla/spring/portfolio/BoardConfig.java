package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {


    @Qualifier("toDoList")
    TaskList toDoList;
    @Qualifier("inProgressList")
    TaskList inProgressList;
    @Qualifier("doneList")
    TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean("toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }
    @Bean("inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }
    @Bean("doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }





}
