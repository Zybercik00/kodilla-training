package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testSet() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);

        boolean listToDoExist = context.containsBean("toDoList");
        boolean listInProgressExist = context.containsBean("inProgressList");
        boolean listDoneExist = context.containsBean("doneList");

        assertTrue(listToDoExist);
        assertTrue(listInProgressExist);
        assertTrue(listDoneExist);


        }

    @Test
    void addTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        TaskList toDoList = (TaskList) context.getBean("toDoList");
        TaskList inProgressList = (TaskList) context.getBean("inProgressList");
        TaskList doneList = (TaskList) context.getBean("doneList");


        toDoList.getTasks().add("newTasksListToDo");
        System.out.println(toDoList);
        inProgressList.getTasks().add("tasksListInProgress");
        System.out.println(inProgressList);
        doneList.getTasks().add("doneTasksList");
        System.out.println(doneList);
    }
}
