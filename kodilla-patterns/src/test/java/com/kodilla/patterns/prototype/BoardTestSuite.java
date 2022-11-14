package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BoardTestSuite {

    @Test
    void testToString() {
        TasksList listToDo = new TasksList("To do Tasks");
        IntStream.iterate(1,n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To do task number: " + n)));

        TasksList listInProgres = new TasksList("In Progress Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgres.getTasks().add(new Task("In Progress Task number: " + n)));

        TasksList listDone = new TasksList("Done Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done Task number: " + n)));

        Board board = new Board("Project number 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgres);
        board.getLists().add(listDone);

        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project number 3: ");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        board.getLists().remove(listToDo);

        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);


        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3,deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(), board.getLists());
        assertNotEquals(deepClonedBoard.getLists(), board.getLists());
    }
}
